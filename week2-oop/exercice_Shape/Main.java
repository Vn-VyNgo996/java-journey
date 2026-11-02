package exercice_Shape;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Shape circle = new circle(5.0);
        Shape rectangle = new rectangle(6,4);

        areaCalculator.printArea(circle);
        areaCalculator.printArea(rectangle);
    }
}
