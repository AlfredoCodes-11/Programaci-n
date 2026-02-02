package Tema9;

public class Gato {
    String nombre;
    String raza;
    int edad;

    // métodos (comportamientos)
    Gato(String nombre) {
        this.nombre = nombre;
    }

    void maulla(){
        System.out.println("Miiiaaau");
    }

    void ronronea(){
        System.out.println("Brrrrrrr");
    }

    void cumple(int anios){
        this.edad+=anios;
    }

    /**
     * @param comida
     */
    void come(String comida){
        System.out.println("Me gusta comer "+ comida + "!!!");
        System.out.println("Ñam");
    }

    void pelea(Gato gato){
        System.out.println("Voy a pelearme con " + gato.nombre   + "!!");
    }
}
