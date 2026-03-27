package tema11.Repaso.clases;

public class Heroe extends Personaje {
    // Cuando una propiedad o metodo son estaticas existe siempre incluso antes de que se cree el objeto, 
    // si no fuese asi no podria ser la misma constante o variable para todas las instacia
    private static final int MAX_ATAQUE = 15;
    private static final int MAX_VIDA = 100;

    public Heroe(String nombre){
        super(nombre, MAX_VIDA, (int) ((Math.random()* MAX_ATAQUE)+1 ));
    }



    /**
     * @param personaje (enemigo)
     */
    @Override
    public void atacar(Personaje enemigo){

        int puntoAtaques = (int) ((Math.random()*MAX_ATAQUE)+1);
        System.out.printf("%s ataca a %s y le quita %d de vida.",this.getNombre(),enemigo.getNombre(),puntoAtaques);
        System.out.printf("%s se queda con %d.",enemigo.getNombre(),enemigo.getVida());
    }
}
