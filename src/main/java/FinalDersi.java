public class FinalDersi {
    public static void main(String[] args) {
        FinalDemo demo=new FinalDemo();
        demo.print(90);
        demo.print(890);

    }

}

class FinalDemo {

    void print(final int TEKER){
       System.out.println(TEKER);
   }


}

