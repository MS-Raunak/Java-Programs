package oopsinterview;

public abstract class Shape {
    abstract void drawShape();
}

class Rectangle extends Shape {

    @Override
    void drawShape() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {

    @Override
    void drawShape() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {

    @Override
    void drawShape() {
        System.out.println("Drawing a Square");
    }
}

class ShapeFactory {
    public void drawFactory(String shapetype) {
        switch (shapetype.toLowerCase()) {
            case "circle": new Circle().drawShape(); break;
            case "rectangle": new Rectangle().drawShape(); break;
            case "square": new Square().drawShape(); break;
            default:
                System.out.println("Drawing " + shapetype + " is not supported");
        }
    }
}