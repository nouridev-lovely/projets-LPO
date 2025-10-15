import java.util.*;

public class Exo4 {
    private int i;
    public int getI(){
        return this.i;
    }

    public static void main (String[] args){
        float note1, note2, note3 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduisez la note 1 !");
        note1 =sc.nextFloat();
        System.out.println("introduisez la note 2 !");
        note2 =sc.nextFloat();
        System.out.println("introduisez la note 3 !");
        note3=sc.nextFloat();
        float moyenneF= (note1+note2+note3)/3;
        int moyenneI = (int)((note1 + note2+note3)*5/3);
        System.out.printf("la moyenne sur 20 en flottant est %f%n", moyenneF);
        System.out.printf("la moyenne sur 100 en entier est %d%n", moyenneI);
    }
}
