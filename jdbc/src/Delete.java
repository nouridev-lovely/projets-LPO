import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    private static void arret(String message) {
        System.err.println(message);
    }
    public static void main(String[] args) {
        // URL de connexion
        String DBurl = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "Mysql-1310";

        Connection con = null;
        PreparedStatement stmt = null;
        // Préparation de la requête SQL avec des paramètres
        String insertSQL = "DELETE FROM personne WHERE Id=?";

        System.out.println("Connexion à la base de données");
        try {

            // Connexion à la base de données
            con = DriverManager.getConnection(DBurl, user, password);
            stmt = con.prepareStatement(insertSQL);
            // ajout des paramètres
            stmt.setInt(1, 1);
            // Récupère le nombre de lignes supprimées
            int rowsAffected =stmt.executeUpdate();
            System.out.println(rowsAffected + " ligne(s) a été supprimée(s).");

        } catch (SQLException e) {
            arret("Erreur SQL : " + e.getMessage());
        } finally {
            // Fermeture des ressources dans le bloc finally
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println("Erreur lors de la fermeture des ressources : " + e.getMessage());
            }
        }

        System.out.println("Fin du programme");
    }
}
