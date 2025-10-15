import java.util.*;

public class Exo2 {
    public static void main (String[] args){
        int secondes ;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduisez un temps exprimé en seconde !");
        secondes =sc.nextInt();
        int minutes  = secondes/60;
        int secondesRestantes = secondes % 60;
        System.out.printf("le nombre de minutes est %d%n", minutes);
        System.out.printf("le nombre de secondes restantes est %d%n", secondesRestantes);

    }
}
