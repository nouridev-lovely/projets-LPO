import java.util.Scanner;

public class Exo7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int b = sc.nextInt();

        int max = Math.max(a, b);

        System.out.println("Le plus grand des deux nombres est : " + max);
    }
}
