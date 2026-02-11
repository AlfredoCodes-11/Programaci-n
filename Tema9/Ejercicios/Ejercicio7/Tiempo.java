package Tema9.Ejercicios.Ejercicio7;

public class Tiempo {
    private static int horas;
    private static int minutos;
    private static int segundos;
    private boolean suma = false;

    Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void suma(Tiempo t2){
        int h=0;
        int m=0;
        int s=0;
        horas = this.horas + t2.horas;
        minutos = this.minutos + t2.minutos;
        segundos = this.segundos + t2.segundos;
        if (segundos >= 60){
            minutos++;
            segundos = segundos-60;
            if (minutos >=60){
                horas++;
                minutos= minutos-60;
            }
        }
        suma = true;
    }

    public void resta(Tiempo t2){
        int h=0;
        int m=0;
        int s=0;
        this.horas = this.horas - t2.horas;
        this.minutos = this.minutos - t2.minutos;
        this.segundos = this.segundos - t2.segundos;
        if (this.segundos < 0){
            this.minutos--;
            this.segundos = s+60;
            if (this.minutos < 0){
                this.horas--;
                this.minutos= minutos+60;
            }
        }
    }

    public static int getHoras(){
        return horas;
    }

    
    public static int getMinutos(){
        return minutos;
    }
    
    public static int getSegundo(){
        return segundos;
    }

    @Override
    public String toString(){
        String cadena;
        if (suma){
            cadena = String.format("%dh %dm %ds",this.horas,this.minutos,this.segundos);
        } else {
            cadena = String.format("%dh %dm %ds",this.horas,this.minutos,this.segundos);
        }
        return cadena;
    }
}