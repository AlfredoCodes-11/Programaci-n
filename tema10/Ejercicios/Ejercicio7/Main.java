package tema10.Ejercicios.Ejercicio7;

import java.util.ArrayList;

import tema10.Ejercicios.Ejercicio7.clases.Moneda;

public class Main {
    public static void main(String[] args) {

        Moneda moneda;
        Moneda anterior;
        String posicionAnterior;
        String cantidadAnterior;
        ArrayList<Moneda> monedas = new ArrayList<>();

        // cvreamos una primera moneda
        anterior = new Moneda();
        monedas.add(new Moneda());


        // consultamos la posición y el valor de la moneda anterior
        posicionAnterior = anterior.getPosicion();
        cantidadAnterior = anterior.getCantidad();

        for (int i =1; i<=5;i++){
            do {
                moneda = new Moneda();
            } while (moneda.getCantidad().equals(cantidadAnterior) && moneda.getPosicion().equals(posicionAnterior));
            
            // encontrada la moneda, la guardamos
            monedas.add(moneda);

            // actualizamos la posición y cantidad anteriores
            posicionAnterior = moneda.getPosicion();
            cantidadAnterior = moneda.getCantidad();
        }

        // mostramos las monedas generadas
        for (Moneda item: monedas) {
            System.out.println(item);
        }


        


    }
}
