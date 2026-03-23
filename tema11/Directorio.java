package tema11;

import java.io.File;

public class Directorio {
    public static void main(String[] args) {
        
        File file;
        String ruta = ".";
        String[] archivos;
        Boolean tipo = false;

        //aceptamos un único argumetno, que será la ruta del directorio
        // del que queremos listar los archivos
        if (args.length > 0){
            ruta = args[0];

            // comprobamos si hay segundo argumento (-t)
            System.out.println(args.length);
            tipo = (args.length == 2) && (args[i].equalsIgnoreCase("-t"));
        }



        // una vez tenemos definida la ruta
        try {
            file = new File(ruta);
            archivos = file.list();

            for(String item: archivos){
                if(tipo){
                    File temp = new File(item);

                    if (temp.isDirectory()) { System.out.println("[D] " + item);}
                    else if (temp.isFile()) { System.out.println("[A] " + item);} 
                } else {
                    System.out.println(item);
                }
            }
        } c

    }
}
