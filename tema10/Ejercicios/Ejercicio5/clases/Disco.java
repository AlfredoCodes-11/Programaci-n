package tema10.Ejercicios.Ejercicio5.clases;

public class Disco {
    private String codigo;
    private String titulo;
    private String artista;
    private String genero;
    private int duracion;

    /**
     * @param codigo
     * @param titulo
     * @param artista
     * @param genero
     * @param duracion
     */
    public Disco(String codigo, String titulo, String artista, String genero, int duracion){
        this.codigo=codigo;
        this.titulo=titulo;
        this.artista=artista;
        this.genero=genero;
        this.duracion=duracion;
    }

    public Disco(){

    }

    public String getCodigo(){
        return this.codigo;
    }


    public String toString(){
        return String.format("CÓDIGO:   %s\n NOMBRE:   %s\n ARTISTA:  %s\n GENERO:   %s\n DURACION: %d\n", this.codigo,this.titulo,this.artista,this.genero,this.duracion);
    }
}
