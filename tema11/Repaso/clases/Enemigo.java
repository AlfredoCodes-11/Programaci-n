package tema11.Repaso.clases;

import java.util.Random;

public class Enemigo extends Personaje {
    
    
    public Enemigo(String nombre, int vida, int ataque){
        super(nombre,vida,ataque);
    }

    public void atacar(Personaje heroe){
        int puntoAtaques;
        Random generador = new Random();

        puntoAtaques = generador.nextInt(0, getAtaque());
        heroe.restarVida(puntoAtaques);
        System.out.printf("%s ataca a %s y le quita %d de vida.",this.getNombre(),heroe.getNombre(),puntoAtaques);
        System.out.printf("%s se queda con %d.",heroe.getNombre(),heroe.getVida());
    }
}
