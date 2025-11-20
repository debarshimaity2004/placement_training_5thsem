// Create a class Main with the following member variables int length int breadth int height int 
// radius In Main class, get the details of the values of all variables and pass it to the shape class 
// Create a class Shape with the following member variables int length int breadth int height int 
// radius The values are passed from the Main class as parameters to the constructors in Shape 
// class. In Shape class, create four constructors. The first constructor is the default 
// constructor.Shape(){} The second constructor is for the cube, which receives length, breadth, 
// and height as arguments. Shape(int length, int breadth, int height) {constructor body} The 
// third constructor is for the sphere, which receives radius as arguments. Shape(int 
// radius) {constructor body} The fourth constructor is for the cylinder, which receives radius 
// and height as arguments. Shape(int radius, int height) {Constructor body} Include three 
// methods in Shape class namely public float calculateAreaOfCylinder() public float 
// calculate AreaOfSphere() public Integer calculateAreaOfCube() to calculate the area of each 
// shapes. 
// Sample Input and Output 1 : 
// 1.Cube 
// 2.Sphere 
// 3.Cylinder 
// Enter the choice 
// 1 
// length 
// Y7 
// 21 
// 10 
// breadth 
// 20 
// height 
// 30 
// Area of Cube is 6000 
// Sample Input and Output 2: 
// 1. Cube 
// 2. Sphere 
// 3. Cylinder 
// Enter the choice 
// 2 
// radius 
// 10 
// Area of Sphere is 4186.67 
// Sample Input and Output 3: 
// 1. Cube 
// 2. Sphere 
// 3. Cylinder 
// Enter the choice 
// 3 
// radius 
// 10 
// height 
// 5 
// Area of Cylinders is 1570.0 
// Case 1 
// Input (stdin) 
// 1 
// 10 
// BIZOTIC 
// 222 
// 20 
// 30 
// Output (stdout) 
// 1.Cube 
// 2.Sphere 
// 3.Cylinder 
// Enter the choice 
// length 
// breadth 
// height 
// Area of Cube is 6000

import java.util.Scanner;

class Shape {
    int length, breadth, height, radius;

    // Constructor for Cube
    public Shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Constructor for Sphere
    public Shape(int radius) {
        this.radius = radius;
    }

    // Constructor for Cylinder
    public Shape(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int calculateAreaOfCube() {
        return length * breadth * height;
    }

    public double calculateAreaOfSphere() {
        return 4 * Math.PI * radius * radius;
    }

    public double calculateAreaOfCylinder() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Cube");
        System.out.println("2.Sphere");
        System.out.println("3.Cylinder");
        System.out.println("Enter the choice");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("length");
                int length = scanner.nextInt();
                System.out.println("breadth");
                int breadth = scanner.nextInt();
                System.out.println("height");
                int height = scanner.nextInt();
                Shape cube = new Shape(length, breadth, height);
                System.out.println("Area of Cube is " + cube.calculateAreaOfCube());
                break;
            case 2:
                System.out.println("radius");
                int radiusSphere = scanner.nextInt();
                Shape sphere = new Shape(radiusSphere);
                System.out.printf("Area of Sphere is %.2f%n", sphere.calculateAreaOfSphere());
                break;
            case 3:
                System.out.println("radius");
                int radiusCylinder = scanner.nextInt();
                System.out.println("height");
                int heightCylinder = scanner.nextInt();
                Shape cylinder = new Shape(radiusCylinder, heightCylinder);
                System.out.printf("Area of Cylinders is %.1f%n", cylinder.calculateAreaOfCylinder());
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
