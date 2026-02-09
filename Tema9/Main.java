package Tema9;

import Tema9.clases.Gato;
import Tema9.clases.Moneda;
import Tema9.clases.Perro;
import Tema9.clases.Sexo;

public class Main {
    public static void main(String[] args) {
        
        Gato garfield = new Gato("Garfield");
        Gato silvestre = new Gato("Silvestre", 5);

        garfield.maulla();
        garfield.ronronea();

        Perro pluto = new Perro("Pluto");
        pluto.setCaza(true);

        System.out.println(pluto.getNombre() + "\n" + pluto.getEdad());
        System.out.println(pluto);

        pluto.caza();

        System.out.println(garfield.getNombre());
        garfield.come("lasaña");

        garfield.peleaCon(pluto);
        garfield.peleaCon(silvestre);

        garfield.setEdad(15);
        garfield.setSexo(Sexo.MACHO);
    
    
    // ===========================================
    Moneda moneda = Moneda.DOLAR;
    System.out.println(10 * moneda.getValor() + " " + moneda.getSimbolo());
    
    
    }
}
