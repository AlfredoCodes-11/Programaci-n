package Tema9.Ejercicios.Ejercicio6;

public class Pizza {
    private String tamaño;
    private String tipo;
    private boolean estado= false;
    private static int totalPedidas;
    private static int totalServidas;

    Pizza (String tipo, String tamaño){
        this.tamaño = tamaño;
        this.tipo = tipo;
        totalPedidas++;
    }

    public void sirve(){
        if (!estado){
            estado = true;
            totalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    public static int getTotalPedidas(){
        return totalPedidas;
    }

    public static int getTotalServidas(){
        return totalServidas;
    }

    @Override
    public String toString(){
        String cadena;
        if (estado){
            cadena = String.format("pizza %s %s, servida", this.tipo, this.tamaño);
        } else {
            cadena = String.format("pizza %s %s, pedida", this.tipo, this.tamaño);
        }
        return cadena;
    }

}
