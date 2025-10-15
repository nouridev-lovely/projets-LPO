import java.util.Scanner;

public class Exo5 {
    public static void main (String[] args){
        float rayon ;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduisez le rayon du cercle !");
        rayon =sc.nextFloat();
        double pi= Math.PI;
        double surface = pi*rayon*rayon;
        System.out.printf("La surface du cercle est: %f%n" , surface );
        //C=2×π×r
    }
}
