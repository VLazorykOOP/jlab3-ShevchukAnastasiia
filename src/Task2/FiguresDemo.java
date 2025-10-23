package Task2;

import java.util.Objects;

abstract class Figure {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

class Rectangle extends Task2.Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Прямокутник [ширина=" + width + ", висота=" + height + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Task2.Rectangle rectangle = (Task2.Rectangle) obj;

        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}

class Circle extends Task2.Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Коло [радіус=" + radius + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task2.Circle circle = (Task2.Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}

class Tropezium extends Task2.Figure {
    private double baseA;
    private double baseB;
    private double height;
    private double sideC;
    private double sideD;

    public Tropezium(double baseA, double baseB, double height, double sideC, double sideD) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public double calculateArea() {
        return (baseA + baseB) * height / 2.0;
    }

    @Override
    public double calculatePerimeter() {
        return baseA + baseB + sideC + sideD;
    }

    @Override
    public String toString() {
        return "Трапеція [основаA=" + baseA + ", основаB=" + baseB +
                ", висота=" + height + ", сторонаC=" + sideC +
                ", сторонаD=" + sideD + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tropezium trapezium = (Tropezium) obj;
        return Double.compare(trapezium.baseA, baseA) == 0 &&
                Double.compare(trapezium.baseB, baseB) == 0 &&
                Double.compare(trapezium.height, height) == 0 &&
                Double.compare(trapezium.sideC, sideC) == 0 &&
                Double.compare(trapezium.sideD, sideD) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseA, baseB, height, sideC, sideD);
    }
}

public class FiguresDemo {

    public static void main(String[] args) {

        Task2.Figure[] figures = new Task2.Figure[4];

        figures[0] = new Task2.Rectangle(10, 5);
        figures[1] = new Task2.Circle(7);
        figures[2] = new Tropezium(10, 6, 4, 5, 5);
        figures[3] = new Task2.Rectangle(10, 5);


        System.out.println("--- Демонстрація роботи методів (Area, Perimeter, toString) ---");

        for (Task2.Figure fig : figures) {
            System.out.println(fig);
            System.out.printf("  Площа: %.2f\n", fig.calculateArea());
            System.out.printf("  Периметр: %.2f\n", fig.calculatePerimeter());
            System.out.println("---------------------------------");
        }


        System.out.println("\n--- Демонстрація роботи методу equals() ---");

        boolean test1 = figures[0].equals(figures[1]);
        System.out.println("Прямокутник(10,5) == Коло(7)? : " + test1);

        boolean test2 = figures[0].equals(figures[3]);
        System.out.println("Прямокутник(10,5) == Прямокутник(10,5)? : " + test2);

        boolean test3 = figures[0].equals(new Task2.Rectangle(1, 1));
        System.out.println("Прямокутник(10,5) == Прямокутник(1,1)? : " + test3);

        boolean test4 = figures[0].equals(null);
        System.out.println("Прямокутник(10,5) == null? : " + test4);
    }
}