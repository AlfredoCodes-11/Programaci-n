package Tema9.Ejercicios.Ejercicio11;

public class Ameba {
    private int peso;

    Ameba (){
        this.peso = 3;
    }

    public void come(int pesoComida){
        this.peso = this.peso + (pesoComida-1);
    }

    public void come(Ameba ameba2){
        this.peso = this.peso +(ameba2.peso-1);
        ameba2.peso = 0;
    }

    @Override
    public String toString(){
        return String.format("Soy una ameba y peso %d microgramos", this.peso);
    }
}
