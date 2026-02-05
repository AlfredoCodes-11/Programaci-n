package Tema9.Ejercicios.Ejercicio3.clases;

public class Mamifero extends Animal {
    

    public Mamifero(String nombre) {
        super(nombre);
    }

    public Mamifero(String nombre, int edad) {
        super(nombre,edad);
    }

    public void darLeche(){
        System.out.println("Amamantando su cría");
    }

    public void crias(){
        System.out.println("Tengo 3 crias");
    }
}
