package task3;

import java.util.Objects;

public class Trapezium implements Figure {
    private double baseA;
    private double baseB;
    private double height;
    private double sideC;
    private double sideD;

    public Trapezium(double baseA, double baseB, double height, double sideC, double sideD) {
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
        Trapezium trapezium = (Trapezium) obj;
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