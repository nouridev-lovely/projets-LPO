import java.sql.*;

public class Update {
    private static void arret(String message) {
        System.err.println(message);
        System.exit(99);
    }
    public static void main(String[] args) {
        // URL de connexion
        String DBurl = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "Mysql-1310";
        Connection con = null;
        PreparedStatement stmt = null;

        System.out.println("Connexion à la base de données");
        try {
            // Connexion à la base de données
            con = DriverManager.getConnection(DBurl, user, password);

            // Préparation de la requête SQL avec des paramètres
            String updateSQL = "UPDATE personne SET nom = ? , prenom=? WHERE Id=? ";
            stmt = con.prepareStatement(updateSQL);

            //Mettre à jour une  personnes
            stmt.setString(1, "DUPONT");
            stmt.setString(2, "Pascal");
            stmt.setInt(3, 1);
            int rowsAffected= stmt.executeUpdate();
            System.out.println(rowsAffected + " ligne(s) mise(s) à jour.");

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
