package Tema9.Ejercicios.Ejercicio10;

import java.text.DecimalFormat;

public class Movil extends Terminal {

    private String tarifa;
    private double coste;


    Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.coste = 0;
    }


    @Override
    public void llama(Terminal t2, int tiempo){
        double precioMinuto=0;
        super.llama(t2, tiempo);

        switch (tarifa) {
            case "rata":
                precioMinuto = 0.06;
                break;

            case "mono":
                precioMinuto = 0.12;
                break;

            case "bisonte":
                precioMinuto = 0.30;
                break;
        }

        coste += (precioMinuto / 60) * tiempo;

    }

    @Override
    public String toString(){
        
        return super.toString() + String.format(" - tafiricados %.2f euros", coste);
    }
    
}
