import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void Show() {
        System.out.println("---------------------------------");
        System.out.println("Персона: " + firstName + " " + lastName);
    }
}

class Student extends Person {
    private String major;
    private int course;

    public Student(String firstName, String lastName, String major, int course) {
        super(firstName, lastName);
        this.major = major;
        this.course = course;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Статус: Студент");
        System.out.println("Спеціальність: " + major);
        System.out.println("Курс: " + course);
    }
}

class Teacher extends Person {
    protected String department;
    protected String position;

    public Teacher(String firstName, String lastName, String department, String position) {
        super(firstName, lastName);
        this.department = department;
        this.position = position;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Статус: Викладач");
        System.out.println("Кафедра: " + department);
        System.out.println("Посада: " + position);
    }
}

class DepartmentHead extends Teacher {
    private String faculty;

    public DepartmentHead(String firstName, String lastName, String department, String faculty) {
        super(firstName, lastName, department, "Завідувач кафедри");
        this.faculty = faculty;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Факультет: " + faculty);
    }
}

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[3];

        System.out.println("--- ВВЕДІTЬ ДАНІ ДЛЯ СТУДЕНТА ---");
        System.out.print("Ім'я: ");
        String s_fn = scanner.nextLine();
        System.out.print("Прізвище: ");
        String s_ln = scanner.nextLine();
        System.out.print("Спеціальність: ");
        String s_major = scanner.nextLine();
        System.out.print("Курс: ");
        int s_course = scanner.nextInt();
        scanner.nextLine();

        people[0] = new Student(s_fn, s_ln, s_major, s_course);


        System.out.println("\n--- ВВЕДІТЬ ДАНІ ДЛЯ ВИКЛАДАЧА ---");
        System.out.print("Ім'я: ");
        String t_fn = scanner.nextLine();
        System.out.print("Прізвище: ");
        String t_ln = scanner.nextLine();
        System.out.print("Кафедра: ");
        String t_dept = scanner.nextLine();
        System.out.print("Посада (напр., Доцент): ");
        String t_pos = scanner.nextLine();

        people[1] = new Teacher(t_fn, t_ln, t_dept, t_pos);


        System.out.println("\n--- ВВЕДІTЬ ДАНІ ДЛЯ ЗАВІДУВАЧА КАФЕДРИ ---");
        System.out.print("Ім'я: ");
        String h_fn = scanner.nextLine();
        System.out.print("Прізвище: ");
        String h_ln = scanner.nextLine();
        System.out.print("Кафедра (якою завідує): ");
        String h_dept = scanner.nextLine();
        System.out.print("Факультет: ");
        String h_faculty = scanner.nextLine();

        people[2] = new DepartmentHead(h_fn, h_ln, h_dept, h_faculty);


        System.out.println("\n\n========== СПИСОК ПЕРСОН ==========");

        for (Person person : people) {
            person.Show();
        }

        System.out.println("---------------------------------");

        scanner.close();
    }
}