package exercice_Shape;

public class rectangle implements Shape{
    private double length;
    public double width;
    public rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }
}
