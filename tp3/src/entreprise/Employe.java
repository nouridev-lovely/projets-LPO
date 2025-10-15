package entreprise;

public class Employe {
    private String nom;
    private boolean acompte;
    private int nbHeures;
    private float salaireHoraire ;
    public void initialise (String nom, float salaireHoraire) {
        this.nom=nom;
        this.salaireHoraire=salaireHoraire;
        this.nbHeures=0;
        this.acompte=false;
    }
    public void demandeAcompte(){
        String result = "";
        if (this.acompte!=true){
            result = "OK "+this.nom+ " On vous verse 500 € ";
            this.acompte=true;
        }
        else
            result="Désolé "+this.nom+ " on accorde maximum un acompte de 500 € par mois  ";

        System.out.println(result);
    }
    public void travaille (int nbheuresPrestee){
        this.nbHeures +=nbheuresPrestee;
        System.out.println(this.nom+ ": "+this.nbHeures);
    }
    public float salaire(){
        return (acompte!=true) ?
                this.salaireHoraire*nbHeures :
                this.salaireHoraire*nbHeures-500;
    }

}
