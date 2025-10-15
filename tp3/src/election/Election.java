package election;

public class Election {

    private float a, b, c, d;
    public void  initialise (float a, float b, float c, float d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public String resultatCandidat1(){
        String str="str";
        if (a >= 50){
            str= "ELU";
        }
        else if(a<12.5){
            str="BATTU";
        }
        else
            str="EN BALOTTAGE";


        return str;
    }
    public void afficherTour2(){
        byte nbcandidat =0;
        if (a <50 && b < 50 && c < 50 && d < 50 ){
            if(a >= 12.5)
                nbcandidat +=1;
            if(b >= 12.5)
                nbcandidat +=1;
            if(c >= 12.5)
                nbcandidat +=1;
            if(d >= 12.5)
                nbcandidat +=1;
        }
        System.out.println(nbcandidat +" candidats au deuxième tour.");
    }
}
