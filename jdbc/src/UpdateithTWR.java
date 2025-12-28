import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateithTWR {
    private static void arret(String message) {
        System.err.println(message);
    }
    public static void afficher(String message){ System.out.println(message); }
    public static void main(String[] args) {

        String updateSQL = "UPDATE personne SET nom = ? , prenom=? WHERE Id=? ";
        try(Connection con = Connexion.getInstance();
            PreparedStatement stmt = con.prepareStatement(updateSQL)) {

            // liaison des paramètres & exécution de la requête
            stmt.setString(1, "DUPONT");
            stmt.setString(2, "Pascal");
            stmt.setInt(3, 1);
            int rowsAffected= stmt.executeUpdate();
            System.out.println(rowsAffected + " ligne(s) mise(s) à jour.");

        } catch (SQLException e) {
            arret("Erreur SQL : " + e.getMessage());
        }
        afficher("Fin du programme");
    }
}
