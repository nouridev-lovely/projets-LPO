import java.sql.*;

public class Insert {
    private static void arret(String message) {
        System.err.println(message);
        System.exit(99);
    }
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stmt = null;
        // URL de connexion
        String DBurl = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "Mysql-1310";
        String insertSQL = "INSERT INTO personne (Nom, Prenom) VALUES (?, ?)";

        System.out.println("Connexion à la base de données");
        try {
            // Connexion à la base de données
            con = DriverManager.getConnection(DBurl, user, password);

            // Préparation de la requête SQL avec des paramètres
            stmt = con.prepareStatement(insertSQL);

            // Insertion de plusieurs personnes
            stmt.setString(1, "Dupont");
            stmt.setString(2, "Pierre");
            stmt.executeUpdate();

            stmt.setString(1, "Durand");
            stmt.setString(2, "Sophie");
            int rowsAffected= stmt.executeUpdate();
            System.out.println(rowsAffected + " ligne(s) ajoutée(s).");

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
