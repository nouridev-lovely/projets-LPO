import java.util.*;

public class Exo3 {
    public static void main (String[] args){
        int nombre ;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduisez un nombre  !");
        nombre= sc.nextInt();
        if (nombre%2==0)
            System.out.println("nombre pair !");
        else
            System.out.println("nombre impair !");

        String resultat = (nombre % 2 == 0) ? "nombre pair" : "nombre impair";
        System.out.println(resultat);
    }
}
