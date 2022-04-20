public class Kitab {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length + " Contents ");
        for (int x : v){
            System.out.print(x + " ");}
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Menim adim Ayguldur ", 4, 3);
        vaTest("ikinci ",9);
    }

 //   var buffer = new StringBufferClass();
}
