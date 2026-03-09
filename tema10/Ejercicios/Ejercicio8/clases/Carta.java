package tema10.Ejercicios.Ejercicio8.clases;

public class Carta {

    private final String FIGURAS[] = {"As", "2","3","4","5","6","7","Sota","Caballo","Rey"};
    private final String PALOS[] = {"Oros", "Bastos", "Espadas", "Copas"};
    private String figura;
    private String palo;

    public Carta(){
        this.figura = FIGURAS[(int) (Math.random()*10)];
        this.palo = PALOS[(int) (Math.random())*5];
    }

    /**
     * @return
     */
    @Override
    public String toString(){
        return this.figura + " de " + this.palo;
    }


    public boolean equals(Object objeto){

        Carta b = (Carta) objeto;

        return this.figura.equals(b.figura) && this.palo.equals(b.palo);

    }

}
