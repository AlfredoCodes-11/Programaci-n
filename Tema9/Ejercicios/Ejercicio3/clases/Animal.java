package Tema9.Ejercicios.Ejercicio3.clases;

import Tema9.clases.Sexo;

public class Animal {
    private String nombre;
    private int edad;
    private Sexo sexo;

    Animal(String nombre){
        this.nombre = nombre;
    }

    Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Getter de la propiedad NOMBRE
     * @return
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Setter de la propiedad EDAD
     * @param edad
     */
    public void setEdad (int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    /**
     * @param sexo
     */
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }

    /**
     * @param comida
     */
    public void come(String comida){
        System.out.println("Me gusta comer "+ comida + "!!!");
        System.out.println("Ñam");
    }
}
