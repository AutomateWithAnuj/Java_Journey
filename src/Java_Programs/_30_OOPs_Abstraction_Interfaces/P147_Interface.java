package Java_Programs._30_OOPs_Abstraction_Interfaces;

/*
 * Polygon is an interface.
 * It defines a contract for all polygon shapes.
 * Any class that implements this interface MUST implement getArea().
 */
interface Polygon {

    /*
     * Abstract method to calculate area.
     * By default, this method is:
     * public and abstract
     */
    void getArea(int value1, int value2);
}

/*
 * Rectangle class implements Polygon interface.
 * It provides its own implementation of getArea().
 */
class Rectangle implements Polygon {

    /*
     * Overriding the getArea() method for Rectangle.
     * Formula used:
     * Area = length * breadth
     */
    @Override
    public void getArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("The area of Rectangle is: " + area);
    }
}

/*
 * Triangle class implements Polygon interface.
 * It also provides its own implementation of getArea().
 */
class Triangle implements Polygon {

    /*
     * Overriding the getArea() method for Triangle.
     * Formula used:
     * Area = 1/2 * base * height
     */
    @Override
    public void getArea(int base, int height) {
        double area = 0.5 * base * height;
        System.out.println("The area of Triangle is: " + area);
    }
}

/*
 * This class contains the main method.
 * Execution of the program starts from here.
 */
public class P147_Interface {

    public static void main(String[] args) {

        // Creating object of Rectangle class
        // Reference type is the implementing class
        Rectangle rectangle = new Rectangle();

        // Calling getArea() method for rectangle
        // length = 10, breadth = 10
        rectangle.getArea(10, 10);
        // Expected Output:
        // The area of Rectangle is: 100


        // Creating object of Triangle class
        Triangle triangle = new Triangle();

        // Calling getArea() method for triangle
        // base = 3, height = 4
        triangle.getArea(3, 4);
        // Expected Output:
        // The area of Triangle is: 6.0
    }
}
