import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connection con1 =Connexion.getInstance();
        Connection con2 =Connexion.getInstance();
        System.out.println(con2.equals(con1));
    }
}