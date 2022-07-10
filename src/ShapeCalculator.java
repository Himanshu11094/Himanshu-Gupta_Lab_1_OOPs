// Online Java Compiler
// Use this editor to write, compile and run your Java code online

  class Shape
{
    String color;
    public double calculateArea()
    {
        return 0;
    }
    public double calculatePerimeter()
    {
        return 0;
    }
    public void display()
    {
        System.out.println("This is a shape with color: "+ this.color);
    }

    public Shape(String color)
{
    this.color = color;
}
}

class Triangle extends Shape
{
    int height, base;
    public double calculateArea()
    {
    return (1/2*base*height);
    }


    public double calculatePerimeter()
    {
    return ((base+height)+ Math.sqrt(base^2 + height^2));
    }
    public void display()
    {
        System.out.println("This is a triangle with color: "+ super.color);
    }
    
    public Triangle(String color, int height, int base)
    {
    	super(color);
    	this.height = height;
        this.base = base;
    
    }
}

class Rectangle extends Shape
{
    int length, width;
    public double calculateArea()
    {
    return (length*width);
    }


    public double calculatePerimeter()
    {
    return (2*(length+width));
    }
    public void display()
    {
        System.out.println("This is a rectangle with color: "+ this.color);
    }

    public Rectangle(String color, int length, int width)
    {
	super(color);
	this.length = length;
    this.width = width;
    
    }
    
}
  class Circle extends Shape
{
    int radius;
    final double PI = 3.14;
    public double calculateArea()
    {
    return (PI*radius*radius);
    }

public double calculatePerimeter()
    {
    return (2*PI*radius);
    }
    public void display()
    {
        System.out.println("This is a circle with color: "+ this.color);
    }
    
    public Circle(String color, int radius)
    {
    	super(color);
    	this.radius = radius;
     
    }
}
  
  class Square extends Rectangle
  {

	
	  public Square(String color, int side) {
		super(color, side, side);
		// TODO Auto-generated constructor stub
	}
	  public void display()
	  {
		  System.out.println("This is a square with color: "+ super.color);
	  }
  }
class ShapeCalculator {
    public static void main(String[] args) {
           
       Circle cir= new Circle("red", 20);
       Square sq = new Square("orange", 10);
       Rectangle rect = new Rectangle("blue", 10, 20);
       Triangle tri = new Triangle ("green", 5, 10);
       
       System.out.printf("CIRLCE:\nAREA: %.2f, Perimeter: %.2f\n", cir.calculateArea(), cir.calculatePerimeter());
       cir.display();
       
       System.out.printf("\nTriangle:\nAREA: %.2f, Perimeter%.2f\n", tri.calculateArea(), tri.calculatePerimeter());
       tri.display();
       
       System.out.printf("\nRectangle:\nAREA: %.2f, Perimeter: %.2f\n", rect.calculateArea(), rect.calculatePerimeter());
       rect.display();
       
       System.out.printf("\nSQUARE:\nAREA: %.2f, Perimeter: %.2f\n", sq.calculateArea(), sq.calculatePerimeter());
       sq.display();
    }
}