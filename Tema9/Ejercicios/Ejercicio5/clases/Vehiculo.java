package Tema9.Ejercicios.Ejercicio5.clases;

public class Vehiculo {
    private int vehiculosCreados =0 ;
    private static int kilometrosTotales=0;
    private int kilometrosRecorridos;
    
        Vehiculo (){
            this.kilometrosRecorridos = 0;
                vehiculosCreados++;
        }
    
        public void recorrer(int klm){
            this.kilometrosRecorridos += klm;
            kilometrosTotales += klm;
        }
    
        public int getKilometrosRecorridos() {
            return kilometrosRecorridos;
        }
    
        public static int getKilometrosTotales() {
            return kilometrosTotales;
    }

    public int getVehiculosCreados() {
        return vehiculosCreados;
    }
}
