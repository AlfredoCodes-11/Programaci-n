package tema11.Repaso.clases;

public abstract class Personaje {
    
    private String nombre;
    private int vida;
    private int ataque;


    /**
     * @param nombre
     */
    public Personaje(String nombre, int vida, int ataque){
        this.nombre=nombre;
        this.vida=vida;
        this.ataque= ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    /**
     * @param puntos
     */
    public void restarVida(int puntos){
        this.vida -= puntos;

        if (this.vida < 0){
            this.vida=0;
        }
    }

    public int getVida() {
        return vida;
    }

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * @return
     */
    public boolean estaVivo(){
        return this.vida < 0;
    }


    @Override
    public String toString() {
        
        return String.format("%s - vida: %d - ataque: %d", this.nombre, this.vida,this.ataque);
    }

    /**
     * @param enemigo
     */
    public abstract void atacar(Personaje enemigo);
        //intanceof para ver si es heroe o enemigo

}
