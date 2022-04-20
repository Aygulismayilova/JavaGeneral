
enum Colors {
    RED(2), PINK(3), YELLOW(4), ORANGE(), BLUE(1), NAVYBLUE(5), GREEN(7);
    private int price;
    private int price2;

    Colors(int p) {
        price = p;
    }

    Colors() {
        price = -1;
    }

    Colors(int p, int p2) {
        price = p;
        price2 = p2;

    }

    int getPrice() {
        return price;
    }
}


public class EnumerationsAsClass {
    public static void main(String[] args) {
        Colors color1 = Colors.NAVYBLUE;
        System.out.println(color1.getPrice());

        Colors color2 = Colors.ORANGE;
        System.out.println(color2.getPrice());
        System.out.println(color2.ordinal());
        System.out.println(color2.compareTo(Colors.YELLOW));

   if (color2.equals(color1)){
       return;
   }


    }


}
