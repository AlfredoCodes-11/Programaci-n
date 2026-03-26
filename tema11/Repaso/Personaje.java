package tema11.Repaso;

public class Personaje {
    private String nombre;
    private int vida;
    private int ataque;


    Personaje(String nombre, int vida, int ataque){
        this.nombre=nombre;
        this.vida=vida;
        this.ataque=ataque;
    }

    public boolean estaVivo(){
        return vida < 0;
    }

    public void atacar(int ataque){

    }
}
