package Tema9.Ejercicios.Ejercicio3.clases;
/**
 * La clase GATO extiende las características y comportamientos 
 * de la clase ANIMAL. Independiente, define sus propios
 * atributos y métodos.
 * HERENCIA
 */
public class Gato extends Mamifero {
    //

    private String raza;
    private boolean callejero;
    private boolean arisco;


    private Sexo sexo;

    // métodos (comportamientos)
    public Gato(String nombre) {
        super(nombre);
        this.callejero=false;
        this.arisco=false;
    }

    public Gato(String nombre, int edad) {
        super(nombre, edad);
        this.callejero=false;
        this.arisco=false;
    }

    /**
     * Getter para la propiedad CALLEJERO
     * @return
     */
    public boolean getCallejero(){
        return this.callejero;
    }
    
    /**
     * Setter para la propiedad CALLEJERO
     * @param callejero
     */
    public void setCallejero(boolean caza){
        this.callejero = callejero;
    }
    
    

    
    /**
     */
    public void maulla(){
        System.out.println("Miiiaaau");
    }
    /**
     */
    public void ronronea(){
        System.out.println("Brrrrrrr");
    }

   
}
