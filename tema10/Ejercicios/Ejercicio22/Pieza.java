package tema10.Ejercicios.Ejercicio22;

public class Pieza {
    
    private String nombre;
    private int valor;
    private int cantidad;

    public Pieza(String nombre, int cantidad, int valor){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.valor=valor;
    }

    public void capturar(){
        this.cantidad--;
    }

    public boolean puedoCapturar(){
        return this.cantidad > 0;
    }

    public int getValor(){
        return valor;
    }


    @Override
    public String toString() {
        return String.format("%s (%d peones)", this.nombre,this.valor);
    }
}
