package tema10.Ejercicios.Ejercicio5.clases;

import java.util.ArrayList;

public class ColeccionDiscos {
    private ArrayList<Disco> coleccion;


    /**
     */
    public ColeccionDiscos(){
        this.coleccion = new ArrayList<>();
    }

    /**
     * @param disco
     */
    public void añadirDisco(Disco disco){
        this.coleccion.add(disco);
    }

    /**
     */
    public void mostrarDiscos(){
        for(Disco disco: this.coleccion){
            System.out.println(disco);
        }
    }

    /**
     * @param codigo
     * @return
     */
    public Disco bucarDisco(String codigo){


        int i =0;
        Disco disco = null;

        while ((i < this.coleccion.size()) && (disco!=null)) {
            Disco temp = this.coleccion.get(i);
            if (codigo.equals(temp.getCodigo())) {
                disco= temp;                
            }
            i++;
        }
        return disco;
    }

    /**
     * @param codigo
     * @return
     */
    public boolean eliminarDisco(String codigo){

        Disco disco = this.bucarDisco(codigo);
        boolean encontrado;

        // determino si se ha encontrado el disco o no
        encontrado = (disco!=null);

        // si he encontrado el disco, lo elimino
        if (encontrado) {
            this.coleccion.remove(disco);
        }

        return encontrado;
    }
}
