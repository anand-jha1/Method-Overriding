/** Java program to demonstrate Method Overriding */
import java.lang.Override; //importing java.lang package
public class Shape {
    public  void calcArea(){ //Overridden Method
        System.out.println("Base method");
    }
}

class Rectangle extends Shape{
    private int length;
    private int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void calcArea(){ //Overriding Method
        System.out.println("Area of rectangle--" + this.length * this.breadth);
    }
}

class Square extends Shape{
    private int side;
    Square(int side){
        this.side = side;
    }
    @Override
    public void calcArea(){ //Overriding Method
        System.out.println("Area of square--" + this.side*this.side);
    }
}
/** Main method*/
class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.calcArea();

        // Creating object for Rectangle class
        s = new Rectangle(10,20); //Runtime polymorphism
        s.calcArea();

        // Creating object for Square class
        s = new Square(15); //Runtime polymorphism
        s.calcArea();
    }
}
