public class ImmutableMatrix {
    // Atributos
    private int[][] matriz;
    private int filas;
    private int columnas;

    // constructores
    public ImmutableMatrix(int[][] arr){
        matriz = arr;

        for (int i =0; i<arr.length;i++) {
            if (arr[0].length!=arr[i].length){
                throw new IllegalArgumentException("Se ha introducido una matriz irregular");
            }
        }
        columnas = arr[0].length;
        filas = arr.length;

    }
    public ImmutableMatrix(int f, int c){
        if (f<=0 || c<=0)
            throw new IllegalArgumentException("Parámetros introducidos inválidos");
        int[][] matrizAux = new int[f][c];
        filas = f;
        columnas = c;
        int num=1;
        for (int i = 0; i < f; i++)
            for (int j = 0; j < c; j++, num++) {
                matrizAux[i][j] = num;
            }
        matriz = matrizAux;
    }

    // Métodos
    public String toString(){
        int i, j;
        String s = "";
        for (i = 0; i < filas; i++) {
            s += "[";
            for (j = 0; j < columnas-1; j++) {
                s += matriz[i][j]+ ", ";
            }
            s += matriz[i][j] + "]\n";
        }
        return s;
    }
    public int at(int f, int c){
        if(f<0 ||  f>filas)
            throw new IllegalArgumentException("Número de filas inválido");
        else if(c<0 || c>columnas)
            throw new IllegalArgumentException("Número de columnas inválido");
        return matriz[f][c];
    }

    public int rowCount(){
        return filas;
    }

    public int columnCount(){
        return columnas;
    }

    public int[][] toArray2D(){
        return matriz.clone();
    }

    public ImmutableMatrix reverse() {
        int[][] m = new int[filas][columnas];
            for (int i = 0; i < filas; i++)
                for (int j = 0; j < columnas; j++) {
                    m[i][j] = matriz[i][columnas-j-1];
                }
        return new ImmutableMatrix(m);
    }
    public ImmutableMatrix reshape (int NuevasColumnas){
        int r=filas;
        int c=columnas;
        int NuevasFilas=(r*c/NuevasColumnas);
        int i,j,t=0;

        if(r*c %NuevasColumnas!=0){
            throw new IllegalArgumentException("No se ha introducido un número de columnas válido, pues dará una matriz irregular");
        }

        if (NuevasColumnas==c){
            return new ImmutableMatrix(matriz);
        }
        int[] MatrizFila= new int[NuevasFilas*NuevasColumnas];
        int[][] matrizAux = new int[NuevasFilas][NuevasColumnas];


        for ( i=0; i < filas;i++) {
            for ( j = 0; j < columnas; j++) {
                MatrizFila[t] = matriz[i][j];
                t++;
            }
        }
        t=0;
        for ( i=0; i < NuevasFilas;i++) {
            for ( j = 0; j < NuevasColumnas; j++) {
                matrizAux[i][j] =MatrizFila[t];
                t++;
            }
        }
        return new ImmutableMatrix(matrizAux);
    }

    public ImmutableMatrix  transpose() {
        int[][] traspuesta = new int[columnas][filas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }}

        return new ImmutableMatrix(traspuesta);
    }

}
