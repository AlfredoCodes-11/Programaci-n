package Tema9.Ejercicios.Ejercicio4.clases;

public class Fracciones {
    private int numerador;
    private int denominador;

    public Fracciones(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }


    public Fracciones multiplicar(Fracciones frac){
        return new Fracciones(this.numerador*frac.numerador, this.denominador*frac.denominador);
    }

    public Fracciones division(Fracciones frac){
        return new Fracciones(this.numerador*frac.denominador, this.denominador*frac.numerador);
    }

    /*public Fracciones simplificar(Fracciones frac){
        if (this.numerador%7==0){
            this.numerador
        }
    }*/

    /**
     * Invierte el numerador y el denominador
     */
    public void invertir(){
        int aux;

        aux = this.numerador;
        this.numerador = this.denominador;
        this.denominador = aux;
    }

    @Override
    public String toString(){

        String cadena = String.format("%d", this.numerador);

        if (this.denominador!=1){
            cadena += String.format("/%d", this.denominador);
        }
        return cadena;
        //return (this.denominador==1)?""+ this.numerador : this.numerador + "/" + this.denominador;
    }
}
