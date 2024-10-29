import java.util.ArrayList;
import java.util.Arrays;

public class MesaBillar {
    // atributos
    private boolean iniciada;
    private ArrayList<BolaBillar> bolasEnJuego;//Cambiei private pod pubic para o seu correcto uso nos test
    private ArrayList<BolaBillar> bolasMetidas;//Cambiei probate por public apra o seu correcto uso nos test


    // constructor inicializador
    public void inicializarMesa() {
        this.bolasMetidas = new ArrayList<>(15);
        this.bolasEnJuego = new ArrayList<>(15);
        bolasEnJuego.addAll(Arrays.asList(BolaBillar.values()));
        iniciada = true;
    }

    // métodos


    private void bola8(BolaBillar b){
        bolasEnJuego.remove(b);
        bolasMetidas.add(b);
        boolean haiSoloRayadas=true,haiSoloLisas=true;
        for (int i=1;bolasEnJuego.size()>i;i++){
            if (bolasEnJuego.get(i).getLisa()) {
                haiSoloLisas = false;

            }
            else
                haiSoloRayadas=false;
        }
        if (this.bolasEnJuego.size()==1)
            System.out.println("El jugador que haya metido la bola negra es el ganador");
        else if (!haiSoloLisas && !haiSoloRayadas)
            System.out.println("La partida se ha acabado, el jugador que metio la bola 8 ha perdido");
        else if (haiSoloRayadas)
            System.out.println("Felicidades a las rayadas");
        else if (haiSoloLisas)
            System.out.println("Felicidades a las lisas");


        this.iniciada=false;


        }


    public void meterBola(BolaBillar b) {
        if (!this.iniciada)
            throw new IllegalArgumentException("La partida no se ha iniciado, use inicializarMesa e intentelo de nuevo");
        if (!this.bolasEnJuego.contains(b))
            throw new IllegalArgumentException("La bola que has intentado introducir ya ha sido introducida");
        if(b==BolaBillar.BOLA8) bola8(b);

        if (b == BolaBillar.BLANCA) return;

        bolasEnJuego.remove(b);
        bolasMetidas.add(b);
    }

    public String bolasMesa() {
        if (!this.iniciada)
            throw new IllegalArgumentException("La partida no se ha iniciado, use inicializarMesa e intentelo de nuevo");
        return (bolasEnJuego.toString());

    }

    public String bolasCajetin() {
        if (!this.iniciada)
            throw new IllegalArgumentException("La partida no se ha iniciado, use inicializarMesa e intentelo de nuevo");
        return (bolasMetidas.toString());
    }

    public boolean esPartidaIniciada() {
        return iniciada;
    }

    public String obtenerGanador() {
        if (!this.iniciada)
            throw new IllegalArgumentException("La partida no se ha iniciado, use inicializarMesa e intentelo de nuevo");

        int BolasMlisas = 0;
        int BolasMrayadas = 0;

        for (BolaBillar bolasMetida : this.bolasMetidas) {
            if (bolasMetida.getLisa()) {
                BolasMlisas++;
            } else
                BolasMrayadas++;
        }

        if (BolasMrayadas < BolasMlisas) {
            return "Ganan las Lisas";
        } else if (BolasMrayadas > BolasMlisas) {
            return "Ganan las Rayadas";
        } else return "No hay ganador, ambos están empatados";
    }



}
