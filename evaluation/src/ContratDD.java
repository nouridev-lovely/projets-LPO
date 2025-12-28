public class ContratDD extends Contrat {

    private String dateFin;

    public ContratDD(String nomEmploye, String dateEmbauche, float salaire, String dateFin)
            throws SalaireException {


        super(nomEmploye, dateEmbauche, salaire);

        if (dateFin == null || dateFin.equals(dateEmbauche)) {
            throw new IllegalArgumentException("La date de fin doit être postérieure à la date d'embauche.");
        }

        this.dateFin = dateFin;
    }

    public String getDateFin() {
        return dateFin;
    }

    @Override
    public String toString() {
        return "Contrat N°" + getNumContrat() +
                " | Employé : " + getNomEmploye() +
                " | Embauche : " + getDateEmbauche() +
                " | Fin : " + dateFin +
                " | Salaire : " + getSalaire() + " € (CDD)";
    }
}
