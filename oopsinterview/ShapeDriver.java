package oopsinterview;

public class ShapeDriver {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.drawFactory("circle");
        factory.drawFactory("rectangle");
        factory.drawFactory("square");

        System.out.println();

        factory.drawFactory("Circle");
        factory.drawFactory("circlerectangle");
        factory.drawFactory("Rectangle");
        factory.drawFactory("rectangla");
        factory.drawFactory("Square");
        factory.drawFactory("squareshape");
        factory.drawFactory("oval");

    }
}
