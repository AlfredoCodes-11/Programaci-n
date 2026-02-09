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

    public void simplificar(){
        while ((this.numerador%7==0 && this.denominador%7==0) || (this.numerador%5==0 && this.denominador%5==0) || (this.numerador%3==0 && this.denominador%3==0) || (this.numerador%2==0 && this.denominador%2==0)) {
            if (this.numerador%7==0 && this.denominador%7==0){
                this.numerador /= 7;
                this.denominador /= 7;
            } else if (this.numerador%5==0 && this.denominador%5==0){
                this.numerador /= 5;
                this.denominador /= 5;
            } else if (this.numerador%3==0 && this.denominador%3==0){
                this.numerador /= 3;
                this.denominador /= 3;
            } else if (this.numerador%2==0 && this.denominador%2==0){
                this.numerador /= 2;
                this.denominador /= 2;
            }
        }    
    }

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
