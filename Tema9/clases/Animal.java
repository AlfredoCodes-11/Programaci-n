package Tema9.clases;

public abstract class Animal {
    private String nombre;
    private String raza;
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
     * @param anios
     */
    public void cumple(int anios){
        this.edad+=anios;
    }

    /**
     * @param comida
     */
    public void come(String comida){
        System.out.println("Me gusta comer "+ comida + "!!!");
        System.out.println("Ñam");
    }

    /**
     * @param gato
     */
    public void peleaCon(Animal gato){
        System.out.println("Voy a pelearme con " + gato.getNombre()   + "!!");
    }
}
