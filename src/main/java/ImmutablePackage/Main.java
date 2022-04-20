package ImmutablePackage;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Aygul");
        account1.report();

        System.out.println(" I am testing if jar file changes after changing code");
        BankAccount account2 = new BankAccount("Aygul", 10000);
        System.out.println(account2.balance());
        if (account1.equals(account2)) {
            System.out.println("They are equal");
        } else System.out.println("They are not equal");

        System.out.println("Account 1 "+account1);



//equals metodu obyektin icindeki variabllerin neraber olub olmadigini yoxlayir, iki obyektin eyni olub olmadigini yoxlamir
        //        Record2 record2 = new Record2(90);
        //        record2.print();
    }
    //Records are automatically generated when you compile the program . The soirce code is generated for the record
    //But also these records are final classes , that makes them immutable.
    //When we create record it implicitly extends the class Record


}
