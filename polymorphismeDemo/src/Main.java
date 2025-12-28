public class Main {public static void main(String[]args){
    Animal m= new Mouton();
    Animal c= new Chien();

    m.decrire();

    c.decrire();
    //c.sauter(); erreur l'objet c ne peut pas voir la méthode sauter

   Animal[] animalerie = new Animal[2];
   animalerie[0]=m;
   animalerie[1]=c;
   for ( Animal a : animalerie){
       a.decrire();
   }
}

}
