interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double length;
    double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
}
class Circle implements Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }


public double calculateArea() {
    return Math.PI * radius * radius;
    
}
}

class Triangle implements Shape {
    double base;
    double height;
    
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        
    }
    
    
    public double calculateArea(){
        return 0.5 * base * height;
    }
    }
    
    class AreaCalculator {
        public double calculateTotalArea(Shape[] shapes){
            double total = 0;
            
            for (Shape shape : shapes){
                total += shape.calculateArea();
            }
            return total;
        }
            
        }
        
        public class Main {
            public static void main(String[] args) {
                Shape[] shapes = {
                    new Rectangle(5, 4),
                    new Circle(3),
                    new Triangle(6, 2)
                };
                
                AreaCalculator calculator = new AreaCalculator();
                
                System.out.println("Total Area = " + calculator.calculateTotalArea(shapes));
            }
        }
