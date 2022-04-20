package patternMatching;

import ImmutablePackage.Record2;

public class MainShapes {
    public static void main(String[] args) {
        Shape shape = new Rectangle(2, 3);
        System.out.println("Shape area: " + calculateShapeArea(shape));
        Shape shape1 = new Triangle(5, 7);
        System.out.println("Shape area " + calculateShapeInstancePatternMatching(shape1));
        if (shape instanceof Rectangle r) {
            //r will exist in this scope
        } else {
            //r will not exist in this scope
        }
        if (!(shape instanceof Triangle t)) {
            //t will not exist in this scope
          //  System.out.println(t);
        } else if(false) {
            System.out.println(t);
            //t will exist in this scope
        }else{
            System.out.println(t);
        }

        if (shape instanceof Triangle t && t.getHeight()>2){
            System.out.println(t);
        }else{
            System.out.println("deyil");
        }



    }

    private static double calculateShapeArea(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.getHeight() * r.getWidth();
        } else if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            return 0.5 * t.getBase() * t.getHeight();
        } else {
            return -1;
        }
    }

    public static double calculateShapeInstancePatternMatching(Shape shape) {
        if (shape instanceof Rectangle r) {
            return r.getWidth() * r.getHeight();
        } else if (shape instanceof Triangle t) {
            return 0.5 * t.getBase() * t.getHeight();
        } else return 1;
    }
}
