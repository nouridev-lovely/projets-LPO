import java.util.Scanner;

public class Exo6 {
    public static void main (String[] args){
        int i1, i2 ;
        Scanner sc = new Scanner(System.in);
        i1= sc.nextInt();
        i2=sc.nextInt();
        String resultat =(i1>i2) ? i1+ " est plus grand que "+i2 : i1+" est plus petit que "+i2;
        System.out.println(resultat);
    }
}
