package Tema9.Ejercicios.Ejercicio10;

import java.text.DecimalFormat;

public class Movil extends Terminal {

    private String tarifa;

    Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
    }

    @Override
    public String toString(){
        String cadena;
        if (this.tarifa == "rata"){
            cadena = String.format(" - tafiricados %f" null)
        }
    }
    
}
