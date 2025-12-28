import java.sql.*;
final public class Connexion {
    private static String DBurl = "jdbc:mysql://localhost:3306/yourdatabase";
    private static String user = "root";
    private static String passwd = "****";
    private static Connection con;

    private Connexion(){

    }
    public static Connection getInstance(){
        if(con == null){
            try {
                    con = DriverManager.getConnection(DBurl, user, passwd);
                    System.out.println("connexion a la base de données");
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }

}
