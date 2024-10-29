
import java.util.Arrays;
import java.util.Objects;

public class StringUtilities {

    private static boolean containsCharactersFrom(String source, String reference) {
        int matchCounter;
        for (int i = 0; i < source.length(); i++) {
            matchCounter = 0;
            for (int j = 0; j < reference.length(); j++) {
                if (source.charAt(i) == reference.charAt(j)) {
                    matchCounter++;
                    break;
                }
            }
            if (matchCounter == 0) return false;
        }
        return true;
    }

    public static boolean isValidString(String s, String allowed, int len) {
        String allowedExt = allowed.concat("0123456789");
        if (s == null || s.isEmpty() || s.length() < len) return false;

        return containsCharactersFrom(s, allowedExt);

    }

    public static String lowercaseFirst(String Desordenada) {
        int i =0;
        if (Objects.equals(Desordenada, ""))return Desordenada;

        char[] StringtoChar = Desordenada.toCharArray();

        Arrays.sort(StringtoChar);
        String SortedString = new String(StringtoChar);

        StringBuilder cadenaM = new StringBuilder();
        StringBuilder cadenam =new StringBuilder();

        for (i=0 ;i<Desordenada.length();i++){
            if (StringtoChar[i] <'a'){
                cadenaM.append(SortedString.charAt(i));

            }else
                cadenam.append(SortedString.charAt(i));
        }

        return cadenam.append(cadenaM).toString();
    }



   public static boolean checkTextStats(String string, int min, int max) {

       if (string==null || string.isEmpty()) {
          throw new  IllegalArgumentException("Debes introducir un string valido");
       }
       if ((min<1) || (max<1)) {
           throw new IllegalArgumentException("No puedes introducir limites menores de 1");
       }

        String delimitadores= " ";
       String[] palabrasSeparadas = string.split(delimitadores);
       int PalabrasTotales=0;
       float LongitudMedia;

       for (String palabrasSeparada : palabrasSeparadas) {
           PalabrasTotales = PalabrasTotales + palabrasSeparada.length();
       }

        LongitudMedia=(float)PalabrasTotales/(float)palabrasSeparadas.length;

       if (LongitudMedia>max||LongitudMedia<min) return false;

       for (String palabrasSeparada : palabrasSeparadas) {
           if (palabrasSeparada.length() > (2 * LongitudMedia)) {
               return false;
           }
       }
       return true;
   }

    public static void main(String[] args) {
        System.out.println(isValidString("12345", "abcd", 5));
        System.out.println(lowercaseFirst("ABC"));
        System.out.println(checkTextStats("Habia una vez", 4, 5));


    }
}



