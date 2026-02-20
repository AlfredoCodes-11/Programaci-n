package tema10.ObjetosArray.Ejercicio3;

public class Disco {
    private String codigo;
    private String titulo;
    private String artista;
    private String genero;
    private int duracion;

    Disco(String codigo, String titulo, String artista, String genero, int duracion){
        this.codigo = codigo;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    Disco(){}

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setArtista(String artista){
        this.artista=artista;
    }

    public String getArtista(){
        return this.artista;
    }

    public void setGenero(String genero){
        this.genero=genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setDuracion(int duracion){
        this.duracion=duracion;
    }

    public int getDuracion(){
        return this.duracion;
    }


    @Override
    public String toString(){
        return String.format("CÓDIGO  : %s\nNOMBRE  : %s\nARTISTA : %s\nGENERO  : %s\nDURACIÓN: %d", this.codigo,this.titulo,this.artista,this.genero,this.duracion);
    }

}
