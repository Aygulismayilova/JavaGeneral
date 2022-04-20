public interface Animal {
    static void talk(){
        System.out.println("Statik Interface metoduyam");

    }

   default void shout(){
     //  scream();

    }

   /* private  void scream(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAA");
    }*/
}
