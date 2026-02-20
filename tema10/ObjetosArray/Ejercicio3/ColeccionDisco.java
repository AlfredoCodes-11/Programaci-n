package tema10.ObjetosArray.Ejercicio3;

import java.util.ArrayList;

public class ColeccionDisco {
    private ArrayList<Disco> lista;

    ColeccionDisco(){
        lista = new ArrayList<Disco>();
    }

    public void añadirDisco(Disco disco){
        lista.add(disco);
    }

    public void mostrarDisco(){
        if (lista.isEmpty()){
            System.out.println("No hay discos aun.");
        } else {
            for (Disco d: lista){
                System.out.println(d);
            }
        }
    }
}
