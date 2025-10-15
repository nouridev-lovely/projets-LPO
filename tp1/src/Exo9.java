import java.util.*;

public class Exo9 {
    int i;
    char c;
    public void calculer(){
        double d=0;
        System.out.println("la valeur de d est "+ d );
    }

    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Introduiser les scores des quatres candidats");
        int i=1;
        float score1=sc.nextFloat();
        System.out.println("Introduiser le score du candidat"+i);
        if (score1 < 12.5)
            System.out.println("Le candidat 1 est battu");
        else if (score1 > 50)
            System.out.println("Le candidat 1 est élu ");
        else
            System.out.println("Le candidat 1 est en ballottage");
    }
}
