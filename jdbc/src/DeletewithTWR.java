import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletewithTWR {
    private static void arret(String message) {
        System.err.println(message);
    }
    public static void afficher(String message){ System.out.println(message); }
    public static void main(String[] args) {
    String deleteSQL = "DELETE FROM personne WHERE Id=?";

    try( Connection con = Connexion.getInstance();
        PreparedStatement stmt = con.prepareStatement(deleteSQL);) {
        // liaison des paramètres & exécution de la requête
        stmt.setInt(1, 1);
        int rowsAffected =stmt.executeUpdate();
        System.out.println(rowsAffected + " ligne(s) a été supprimée(s).");

    } catch (SQLException e) {
        arret("Erreur SQL : " + e.getMessage());
    }
    afficher("Fin du programme");
}
}
