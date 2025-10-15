import java.util.*;

public class Exo1 {
    public static void main (String[] args){
        float h,b,s ;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduisez la hauteur du triangle !");
        h= sc.nextFloat();
        System.out.println("introduisez la base du triangle !");
        b=sc.nextFloat();
        s=h*b/2;
        System.out.println("La surface du triangle est :" + s);
        System.out.printf("La surface du triangle est : %s", s);
    }
}
/*Les principaux spécificateurs en Java

%s → String (texte)

%d → entier (int, long, etc.)

%f → nombre à virgule (float, double)

%c → caractère (char)

%b → booléen (true / false)
*/