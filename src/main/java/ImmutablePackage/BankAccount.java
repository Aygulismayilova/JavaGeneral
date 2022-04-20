package ImmutablePackage;

public record BankAccount(String owner, double balance) {
    public BankAccount {
        System.out.println("Bank account has been created");
        if (balance < 0)
            throw new IllegalArgumentException();
    }

    public BankAccount(String owner) {
        this(owner, 10000);
    }
    //private static int bob;
    //Records are essentially class in Java that are immutable(Java 16)
    //Records are automatically generated when you compile the program . The soirce code is generated for the record
    //But also these records are final classes , that makes them immutable.
    //When we create record it implicitly extends the class Record
    //But also Record class extends object class
    //Record cannot be extended or implemented by other classes
    //You can add non-static and static variables
    //instance fields are not allowed in records
    //Constructors generated  by Record is called canonical constructor
    //You can create custom constructor


    public void report() {
        System.out.println("The account owned by " + this.owner()
                + " has " + this.balance() + " dollars");
    }

    /*public double deposit(double ammountToAdd) {
        this.balance = this.balance + ammountToAdd;
    }*/
/*public void add(String name,double r){
this.owner="";    r=this.balance+90;
//burada final 0ldugu ucun deyisme olmur
}
public void add(int b){
    this.balance=this.balance+90;
    //final oldugu uvun deyismek olmur
}*/
}
