package Tema9.Ejercicios.Ejercicio12;

public class TarjetaRegalo {
    private double saldo;
    private int numeroDigitos;

    TarjetaRegalo(double saldo){
        this.saldo= saldo;
        this.numeroDigitos = (int)((Math.random()*89999)+10000);
    }

    public void gasta(double gasto){
        if (this.saldo < gasto){
            System.out.printf("No tienes suficiente saldo para gastar %.2f€\n", gasto);
        } else {
            this.saldo -=gasto;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        double nuevoSaldo = this.saldo + t.saldo;

        this.saldo=0;
        t.saldo=0;

        return new TarjetaRegalo(nuevoSaldo);
    }

    @Override
    public String toString(){
        return String.format("Tarjeta no %d - Saldo %.2f€", this.numeroDigitos,this.saldo);
    }
}
