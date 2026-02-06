package Tema9.Ejercicios.Ejercicio3.clases;

public class Lagarto extends Animal {

    public Lagarto(String nombre) {
        super(nombre);
    }

    public void tomaSol(){
        System.out.println("Que calorcito...");
    }
    
    public void mudarPiel(){
        System.out.println("Soy un lagarto y estoy mudando la piel");
    }
}
