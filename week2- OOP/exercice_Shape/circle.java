package exercice_Shape;

public class circle implements Shape{

    private double r;
    public circle(double r){
        this.r = r;
    }
    public double area(){
     return r * r  * Math.PI;
    }
}
