package Tema9.Ejercicios.Ejercicio2.clases;

public class Caballo {
    private String nombre;
    
    public Caballo(String nombre){
        this.nombre = nombre;
    }

    /**
     * Getter de la propiedad NOMBRE
     * @return
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     */
    public void galopa(){
        System.out.println("Tocotoc tocotoc tocotoc");
    }

    /**
     */
    public void relinchar(){
        System.out.println("Hiiiiiiieeeee");
    }

    /**
     */
    public void come(){
        System.out.println("Ñam Ñam Ñam");
    }
}
