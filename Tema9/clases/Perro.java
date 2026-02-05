package Tema9.clases;
/**
 * La clase PERRO extiende las características y comportamientos 
 * de la clase ANIMAL. Independiente, define sus propios
 * atributos y métodos.
 * HERENCIA
 */
public class Perro extends Animal{
    
    private boolean caza;

    

    /**
     * @param nombre
     */
    public Perro(String nombre){
        super(nombre);
        this.caza = false;
    }

    /**
     * Getter para la propiedad CAZA
     * @return
     */
    public boolean getCaza(){
        return this.caza;
    }
    
    /**
     * Setter para la propiedad CAZA
     * @param caza
     */
    public void setCaza(boolean caza){
        this.caza = caza;
    }

    /**
     */
    public void ladra(){
        System.out.println("Guau! Guau!");
    }

    /**
     */
    public void grune(){
        System.out.println("Grrrrrrr....");
    }

    /**
     */
    public void caza(){
        if (this.caza){
            System.out.println(this.getNombre() + " cobra la pieza...");
        }
    }

    /**
     * Sobrecargamos el método COME definido en la clase ANIMAL y modificamos
     * su comportamiento.
     * @param comida
     */
    @Override
    public void come(String comida){
        System.out.println("Ñam!!");
    }

    /**
     * El método toString existe en la clase Object, de la que heredan
     * toda las clases. Cómo vamos a redefinir su comportamiento en
     * la clase Perro, decimos que estamos SORBECARGANDO el método.
     */
    @Override
    public String toString(){
        return this.getNombre() + "\n" +
               this.getEdad() + "\n";
    }
}
