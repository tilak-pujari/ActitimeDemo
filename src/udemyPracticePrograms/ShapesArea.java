package udemyPracticePrograms;

public class ShapesArea {

	public static void main(String[] args) {
		Shape s=new Circle("circle",10.5);
		System.out.println(s.calculateArea());
		
		Shape s1=new Rectangle("rectangle",25.0,10.0);
		System.out.println(s1.calculateArea());
	}

}

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}

// Create a Circle class that extends Shape
// The Circle class should have a private double radius attribute and a constructor to initialize it
// It should also implement the calculateArea() method 

class Circle extends Shape{
    private double radius;
    public Circle(String name,double radius){
        super(name);
        this.radius=radius;
    }
    
    @Override
    public double calculateArea(){
        return (Math.PI*radius*radius);
    }
}

// Create a Rectangle class that extends Shape
// The Rectangle class should have private double attributes for length and width, and a constructor to initialize them
// It should also implement the calculateArea() method 

class Rectangle extends Shape{
    private double length;
    private double width;
    Rectangle(String name,double length,double width){
        super(name);
        this.length=length;
        this.width=width;
    }
    
    @Override
    public double calculateArea(){
        return (length*width);
    }
}