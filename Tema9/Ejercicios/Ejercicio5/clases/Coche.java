package Tema9.Ejercicios.Ejercicio5.clases;

public class Coche extends Vehiculo {
    
    
    public void andaCoche(int km) {
        System.out.println("El coche anda " + km + " km\n");
        recorrer(km);
    }

    public void quemaRueda() {
        System.out.println("Estoy quemando rueda\n");
    }

    public void limpiarCoche(){
        System.out.println("Limpio el coche en la gasolinera\n");
    }
}
