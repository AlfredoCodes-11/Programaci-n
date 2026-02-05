package Tema9.clases;
/**
 * La clase GATO extiende las características y comportamientos 
 * de la clase ANIMAL. Independiente, define sus propios
 * atributos y métodos.
 * HERENCIA
 */
public class Gato extends Animal {
    //
    private String nombre;
    private String raza;
    private int edad;

    private Sexo sexo;

    // métodos (comportamientos)
    public Gato(String nombre) {
        super(nombre);
    }

    public Gato(String nombre, int edad) {
        super(nombre, edad);
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
