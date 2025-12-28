import java.sql.*;
final public class Connexion {
    private static String DBurl = "jdbc:mysql://localhost:3306/jdbc_demo";
    private static String user = "root";
    private static String passwd = "Mysql-1310";
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

