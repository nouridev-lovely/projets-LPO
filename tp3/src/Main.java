import election.Election;
import entreprise.Employe;

public class Main {
    public static void main(String[] args) {
//        election.Election e = new election.Election();
//        e.initialise(50, 12.5f, 12.5f, 12.5f);
//        System.out.println(e.resultatCandidat1());
//        e.afficherTour2();
        Employe moi = new Employe();
        moi.initialise("DUPONT", 55.00f);
        moi.travaille(20);
        moi.demandeAcompte();
        System.out.println(moi.salaire());
    }
}