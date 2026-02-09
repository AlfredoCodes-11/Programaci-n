package Tema9.clases;

public enum Moneda {
    
    //constantes del tipo enumerado
    EURO(1.0, '€'),
    DOLAR(1.08, '$'),
    YEN(162.5, 'Y');

    // propiedades inmutables (no mutables)
    private final double valor;
    private final char simbolo;
    
        // cunado asignamos valores por defecto a las constantes
        // del tipo enumerado, estamos obligafos a definir un
        // constructor
    Moneda (double valor, char simbolo) {
        this.valor = valor;
        this.simbolo = simbolo;
    }

    public double getValor(){
        return this.valor;
    }

    public char getSimbolo(){
        return simbolo;
    }



}
