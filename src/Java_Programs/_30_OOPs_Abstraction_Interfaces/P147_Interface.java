package Java_Programs._30_OOPs_Abstraction_Interfaces;

public class P147_Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10,10);

        triangle t1 = new triangle();
        t1.getArea(3,4);
    }
}
interface Polygon{
    void getArea(int length, int breadth);
}
class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth){
        System.out.println("The area of rectangle is: "+(length*breadth));
    }
}
class triangle implements Polygon{
    @Override
    public void getArea(int a,int b){
        System.out.println("The area of triangle is: "+(0.5*a*b*Math.sin(90)));
    }
}
