public enum BolaBillar {
    BLANCA(0, "BLANCO", true),
    BOLA1  (1 ,"AMARILLO", true),
    BOLA2 (2, "AZUL", true),
    BOLA3 (3, "ROJO", true),
    BOLA4 (4, "VIOLETA", true),
    BOLA5 (5, "NARANJA",true),
    BOLA6 (6,"VERDE", true),
    BOLA7 (7,"GRANATE", true),
    BOLA8 (8,"NEGRO" ,true),
    BOLA9 (9,"AMARILLO", false),
    BOLA10 (10, "AZUL" ,false),
    BOLA11 (11, "ROJO", false),
    BOLA12 (12, "VIOLETA", false),
    BOLA13 (13, "NARANJA" ,false),
    BOLA14 (14, "VERDE" ,false),
    BOLA15 (15, "GRANATE", false);
    private int numero;
    private String color;
    private boolean lisa;

    BolaBillar(int numero, String color, boolean lisa){
        this.numero=numero;
        this.color=color;
        this.lisa=lisa;
    }

    public int getNumero(){
        return this.numero;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getLisa(){
        return this.lisa;
    }

}
