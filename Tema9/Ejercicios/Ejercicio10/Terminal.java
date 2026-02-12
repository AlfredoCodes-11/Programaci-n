package Tema9.Ejercicios.Ejercicio10;

public class Terminal {
    private String numero;
    private int tiempo;

    Terminal(String numero){
        this.numero = numero;
    }

    public void llama(Terminal t2, int tiempo){
        this.tiempo = this.tiempo + tiempo;
        t2.tiempo = t2.tiempo + tiempo;
        tiempo=0;
    }

    @Override
    public String toString(){
        String cadena;
        cadena = String.format("No %s - %ds de conversación",this.numero,this.tiempo);
        return cadena;
    }
}
