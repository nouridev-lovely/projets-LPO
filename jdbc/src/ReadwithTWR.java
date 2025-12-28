import java.sql.*;
public class ReadwithTWR {
        private static void arret(String message) {
            System.err.println(message);
           // System.exit(99);
        }
        public static void afficher(String message){
            System.out.println(message);
        }

        public static void main(java.lang.String[] args) {

            String requete = "SELECT * FROM personnes";

            System.out.println("connexion à la base de données");

            try (Connection con = Connexion.getInstance();
                 Statement stmt = con.createStatement();
                 ResultSet resultats = stmt.executeQuery(requete)) {

                System.out.println("Création et exécution de la requête réussies.");

                // -----
                ResultSetMetaData rsmd = resultats.getMetaData();
                int nbCols = rsmd.getColumnCount();

                // Obtenir des informations concernant le BD en général (si nécessaire)
                DatabaseMetaData dmData = con.getMetaData();

                System.out.println("parcours des données retournées");

                // Le .next() initial est inclus dans la boucle pour simplifier
                while (resultats.next()) {
                    for (int i = 1; i <= nbCols; i++) {
                        // Utilisation d'une tabulation pour une meilleure séparation
                        System.out.print(resultats.getString(i) + "\t");
                    }
                    afficher("");
                }
                // con, stmt, et resultats sont AUTOMATIQUEMENT fermés ici

            } catch (SQLException e) {
                // Un seul catch pour toutes les erreurs JDBC (connexion, requête, lecture)
                arret("Erreur JDBC fatale. Détails : " + e.getMessage());
            }

            afficher("fin du programme");
        }
}
