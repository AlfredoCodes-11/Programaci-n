package Tema9.Ejercicios.Ejercicio13;

import Tema9.Ejercicios.Ejercicio13.CuentaCorriente;

public class CuentaCorriente {
    
    private double saldo;
    private long numeroDigitos;

    CuentaCorriente(double saldo){
        this.saldo= saldo;
        this.numeroDigitos = (long)((Math.random()*8999999999L)+1000000000);
    }

    CuentaCorriente(){
        this.saldo=0;
        this.numeroDigitos = (long)((Math.random()*8999999999L)+1000000000);
    }

    public void cargo(double gasto){
        this.saldo -=gasto;
    }

    public void ingreso(double ingresar){
        this.saldo +=ingresar;
    }

    public void transferencia(CuentaCorriente cuenta, int trans){
        this.saldo-=trans;
        cuenta.saldo+=trans;
    }

    @Override
    public String toString(){
        return String.format("Número de cta: %d - Saldo %.2f€", this.numeroDigitos,this.saldo);
    }

}
