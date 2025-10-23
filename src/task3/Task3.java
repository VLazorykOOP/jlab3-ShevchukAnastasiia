package task3;

public class Task3 {

    public static void main(String[] args) {

        Figure[] figures = new Figure[4];

        figures[0] = new Rectangle(10, 5);
        figures[1] = new Circle(7);
        figures[2] = new Trapezium(10, 6, 4, 5, 5);
        figures[3] = new Rectangle(10, 5);


        System.out.println("--- Демонстрація роботи методів (Area, Perimeter, toString) ---");

        for (Figure fig : figures) {
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

        boolean test3 = figures[0].equals(new Rectangle(1, 1));
        System.out.println("Прямокутник(10,5) == Прямокутник(1,1)? : " + test3);

        boolean test4 = figures[0].equals(null);
        System.out.println("Прямокутник(10,5) == null? : " + test4);
    }
}