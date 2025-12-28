import java.sql.*;

public class InsertwithTWR {
    private static void arret(String message) {
        System.err.println(message);
    }
    public static void afficher(String message){ System.out.println(message); }
    public static void main(String[] args) {

        String insertSQL = "INSERT INTO personnes (Nom, Prenom) VALUES (?, ?)";

        try (Connection con = Connexion.getInstance();
             PreparedStatement stmt = con.prepareStatement(insertSQL)){

            // liaison des paramètres & exécution de la requête
            stmt.setString(1, "Dupont");
            stmt.setString(2, "Pierre");
            int rowsAffected= stmt.executeUpdate();
            System.out.println(rowsAffected + " ligne(s) ajoutée(s).");

        } catch (SQLException e) {
            arret("Erreur SQL : " + e.getMessage());
        }

        afficher("Fin du programme");
    }
}
