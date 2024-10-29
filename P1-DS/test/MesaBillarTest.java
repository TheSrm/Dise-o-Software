import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MesaBillarTest {

    private static final MesaBillar b = new MesaBillar();

    @Test
    void SenInicializar(){
        assertThrows(IllegalArgumentException.class, b::obtenerGanador);
        assertFalse(b.esPartidaIniciada());
        assertThrows(IllegalArgumentException.class, b::bolasCajetin);
        assertThrows(IllegalArgumentException.class, b::bolasMesa);
       assertThrows(IllegalArgumentException.class, () -> b.meterBola(BolaBillar.BOLA3));
    }
    @Test
    void Meter2Veces(){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA3);
        assertThrows(IllegalArgumentException.class, () -> b.meterBola(BolaBillar.BOLA3));

    }

    @Test
    void MeterunaBola(){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA3);


        assertEquals("[BLANCA, BOLA1, BOLA2, BOLA4, BOLA5, BOLA6, BOLA7, BOLA8, BOLA9, BOLA10, BOLA11, BOLA12, BOLA13, BOLA14, BOLA15]", b.bolasMesa());
        assertEquals("[BOLA3]", b.bolasCajetin());

    }
    @Test
void GananRayadas(){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA13);

        assertEquals("Ganan las Rayadas", b.obtenerGanador());

}
@Test
    void GananLisas(){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA3);

        assertEquals("Ganan las Lisas", b.obtenerGanador());

    }

    @Test
    void Empate(){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA13);
        b.meterBola(BolaBillar.BOLA1);

        assertEquals("No hay ganador, ambos están empatados", b.obtenerGanador());

    }

    @Test
    void PartidaIniciadaSi() {
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        assertTrue(b.esPartidaIniciada());
    }

    @Test
    void BolasEnLaMesa(){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA13);
        assertEquals("ROJO", BolaBillar.BOLA3.getColor());
        assertEquals("NARANJA", BolaBillar.BOLA13.getColor());
        b.meterBola(BolaBillar.BOLA1);
        assertEquals(1,BolaBillar.BOLA1.getNumero());

    }

    @Test
    void Bola8Lisas(){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA1);
        b.meterBola(BolaBillar.BOLA2);
        b.meterBola(BolaBillar.BOLA3);
        b.meterBola(BolaBillar.BOLA4);
        b.meterBola(BolaBillar.BOLA5);
        b.meterBola(BolaBillar.BOLA6);
        b.meterBola(BolaBillar.BOLA7);
        b.meterBola(BolaBillar.BOLA8);
        assertFalse(b.esPartidaIniciada());


    }
    @Test
    void Bola8Rayadas(){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA10);
        b.meterBola(BolaBillar.BOLA11);
        b.meterBola(BolaBillar.BOLA12);
        b.meterBola(BolaBillar.BOLA13);
        b.meterBola(BolaBillar.BOLA14);
        b.meterBola(BolaBillar.BOLA15);
        b.meterBola(BolaBillar.BOLA9);
        b.meterBola(BolaBillar.BOLA8);
        assertFalse(b.esPartidaIniciada());


    }
@Test
    void GanaElquelaMeta (){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA10);
        b.meterBola(BolaBillar.BOLA11);
        b.meterBola(BolaBillar.BOLA12);
        b.meterBola(BolaBillar.BOLA13);
        b.meterBola(BolaBillar.BOLA14);
        b.meterBola(BolaBillar.BOLA15);
        b.meterBola(BolaBillar.BOLA9);
        b.meterBola(BolaBillar.BOLA1);
        b.meterBola(BolaBillar.BOLA2);
        b.meterBola(BolaBillar.BOLA3);
        b.meterBola(BolaBillar.BOLA4);
        b.meterBola(BolaBillar.BOLA5);
        b.meterBola(BolaBillar.BOLA6);
        b.meterBola(BolaBillar.BOLA7);
        b.meterBola(BolaBillar.BOLA8);
        assertFalse(b.esPartidaIniciada());

    }
@Test
    void TestComplejo(){
        MesaBillar b = new MesaBillar();
        b.inicializarMesa();
        b.meterBola(BolaBillar.BOLA4);
        b.meterBola(BolaBillar.BOLA6);
        b.meterBola(BolaBillar.BOLA9);
        b.meterBola(BolaBillar.BOLA10);
        b.meterBola(BolaBillar.BLANCA);
        System.out.println(b.obtenerGanador());
        b.meterBola(BolaBillar.BOLA8);
        assertFalse(b.esPartidaIniciada());

    }
}


