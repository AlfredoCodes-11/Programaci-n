package Tema9.Ejercicios.Ejercicio3.clases;

public class Canarios extends Ave {
    
    private boolean salvaje;
    public Canarios(String nombre) {
        super(nombre);
        this.salvaje=false;
    }

    public boolean getSalvaje(){
        return this.salvaje;
    }

    public void setSalvaje(boolean salvaje){
        this.salvaje = salvaje;
    }

    public void piar(){
        System.out.println("¡Pio pio pio!");
    }

}
