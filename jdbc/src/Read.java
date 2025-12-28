import java.sql.*;

public class Read {
    private static void arret(String message) {
        System.err.println(message);
        System.exit(99);
    }
    public static void main(java.lang.String[] args) {
        String DBurl = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "Mysql-1310";
        Connection con = null;
        Statement stmt = null;
        ResultSet resultats = null;
        String requete  = "SELECT * FROM personne";

        System.out.println("connexion a la base de données");
        try {
            con = DriverManager.getConnection(DBurl, user, password);
            stmt = con.createStatement();
            //creation et execution de la requête
            System.out.println("creation et execution de la requête");
            resultats = stmt.executeQuery(requete);
        } catch (SQLException e) {
            arret("Erreur  lors de la connexion ou de la requête: " + e.getMessage());
        }

        //parcours des données retournées
        System.out.println("parcours des données retournées");
        try {
            //getMetaData : Récupère le nombre, les types et les  propriétés
            // des colonnes de l'objet Resultset
            ResultSetMetaData rsmd = resultats.getMetaData();

            // Obtenir des informations concernant le ResultSetMetaData
            int nbCols = rsmd.getColumnCount();

            // Obtenir des informations concernant le BD en général
            DatabaseMetaData dmData = con.getMetaData();

            //affiche(String.valueOf(rsmd.isCurrency(1)));

            // Obtenir des informations concernant le resultset
            while (resultats.next()) {
                for (int i = 1; i <= nbCols; i++)
                    System.out.print(resultats.getString(i) + "\t");
                System.out.println();
            }

        } catch (SQLException e) {
            arret(e.getMessage());
        }
        finally {
            // Fermeture des ressources dans le bloc finally
            try {
                if (resultats != null) resultats.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println("Erreur lors de la fermeture des ressources : " + e.getMessage());
            }
        }
        System.out.println("fin du programme");
        System.exit(0);
    }
}
