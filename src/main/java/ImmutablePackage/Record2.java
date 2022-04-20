package ImmutablePackage;

public record Record2(int number) {
    public Record2(int number) {

        this.number = number+10;
    }

    /* public Record2() {
                }*/
    public void print(){
        System.out.println(this.number);    }
}
