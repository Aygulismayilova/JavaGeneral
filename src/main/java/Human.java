public class Human extends Life {
    @Override
    void talk() {
        System.out.println("my name is Human");
    }
void move(String name,int num, String...varrs){
    System.out.println(name);
    System.out.println(num);
    for (String x:varrs
         ) {
        System.out.print(x);
    }
    System.out.println();
}
}
