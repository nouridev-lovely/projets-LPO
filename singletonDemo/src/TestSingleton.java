public class TestSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        if (s1.equals(s2) && s2.equals(s3)  ){
            System.out.println("les trois instances sont égales");
        }
    }
}
final class Singleton{
      private static  Singleton INSTANCE  ;
      private Singleton(){
      }
      public static Singleton getInstance(){
          if ( INSTANCE == null ) {
              INSTANCE = new Singleton();
          }
          return INSTANCE;
      }
}
