package tema4.Relacion;

public class Ejercicio11 {
    public static void main(String[] args) {

        char opcion;
        int puntuacion = 0;
        
        System.out.println("\033[1mCUESTIONARIO DE 1º DE DAW\033[0m");
    
        // PRIMERA PREGUNTA
        System.out.println("1. ¿Cuál de los siguientes tipos de datos tiene más precisión?");
        System.out.println("a. int");
        System.out.println("b. double");
        System.out.println("c. float");
        System.out.print("=>");

        opcion=System.console().readLine().toLowerCase().charAt(0);

        if (opcion=='b'){
            System.out.println("Correcto");
            puntuacion +=2;
        } else {
            System.out.println("Incorrecto");
        }

         // SEGUNDA PREGUNTA
         System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?");
         System.out.println("a. XML");
         System.out.println("b. SELECT");
         System.out.println("c. SQL");
         System.out.print("=>");
 
         opcion=System.console().readLine().toLowerCase().charAt(0);
 
         if (opcion=='c'){
             System.out.println("Correcto");
             puntuacion +=2;
         } else {
             System.out.println("Incorrecto");
         }

         // TERCERA PREGUNTA
         System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
         System.out.println("a. href");
         System.out.println("b. a");
         System.out.println("c. link");
         System.out.print("=>");
 
         opcion=System.console().readLine().toLowerCase().charAt(0);
 
         if (opcion=='b'){
             System.out.println("Correcto");
             puntuacion +=2;
         } else {
             System.out.println("Incorrecto");
         }

         // CUARTA PREGUNTA
         System.out.println("4. ¿En qué directorio se encuentra los archivos de configuración de Linux?");
         System.out.println("a. /etc");
         System.out.println("b. /config");
         System.out.println("c. /cfg");
         System.out.print("=>");
 
         opcion=System.console().readLine().toLowerCase().charAt(0);
 
         if (opcion=='b'){
             System.out.println("Correcto");
             puntuacion +=2;
         } else {
             System.out.println("Incorrecto");
         }

         // QUINTA PREGUNTA
         System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
         System.out.println("a. RAM");
         System.out.println("b. EPROM");
         System.out.println("c. /ROM");
         System.out.print("=>");
 
         opcion=System.console().readLine().toLowerCase().charAt(0);
 
         if (opcion=='a'){
             System.out.println("Correcto");
             puntuacion +=2;
         } else {
             System.out.println("Incorrecto");
         }

        // Mostramos puntuación final
        System.out.printf("Has obtenido \033[1m%d puntos\033[0m\n", puntuacion);
    }
}
