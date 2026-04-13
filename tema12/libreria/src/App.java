import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:mysql://localhost:3306/ejemplo?characterEncoding=UTF-8";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "root");
            System.out.println("**INFO: se ha conectado correctamente con la base de datos.");
        } catch (SQLException sqle) {
            System.out.println("**ERROR: ha sido imposible conectar con la base de datos.");
        }
    }
}
