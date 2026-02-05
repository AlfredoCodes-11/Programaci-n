package Tema9.Ejercicios.Ejercicio3.clases;

public class Ave extends Animal{

    private boolean vuela;

    Ave(String nombre) {
        super(nombre);
        this.vuela=false;
    }
    

    public boolean getVuela(){
        return this.vuela;
    }

    public void setVuela(boolean vuela){
        this.vuela = vuela;
    }
}
