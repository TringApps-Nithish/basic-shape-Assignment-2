
/*2. Design a class for a basic shape. The class should have the following features:
- An instance variable for the shape's type (e.g. triangle, rectangle, circle).
- An instance variable for the shape's dimensions (e.g. side lengths for a triangle, length and width for a rectangle, radius for a circle).
- A constructor that allows the user to create a shape with a given type and dimensions.
- A method that calculates and returns the perimeter of the shape.
- A method that calculates and returns the area of the shape.*/
import java.util.*;

class shapecal {

    int breadth, length, hypo, width, radius;
    String s;

    // triangle
    shapecal(String shape, int b, int l, int h) {
        breadth = b;
        length = l;
        hypo = h;
        s = shape;
        System.out.println("\n Triangle Created ...");
    }

    shapecal(String shape, int l, int w) {
        length = l;
        width = w;
        s = shape;
        System.out.println("\n Rectangle Created ...");
    }

    shapecal(String shape, int r) {
        radius = r;
        s = shape;
        System.out.println("\n Circle Created ...");
    }

    void area(int b, int h) {
        double area = 0.5 * b * h;
        System.out.printf("\n Area Of Triangle  = " + area);
    }

    void perimeter(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.printf("\n Perimeter Of Circle = " + perimeter);
    }
    // rectangle

    void rarea(int l, int h) {
        int area = l * h;
        System.out.printf("\n Area Of Rectangle  = " + area);
    }

    void rperimeter(int l, int h) {
        int perimeter = 2 * (l + h);
        System.out.printf("\n Perimeter Of Rectangle  = " + perimeter);
    }

    // Circle

    void area(int r) {
        double area = 3.14 * r * r;
        System.out.printf("\n Area Of Circle = " + area);
    }

    void perimeter(int r) {
        double perimeter = 2 * 3.14 * r;
        System.out.printf("\n Perimeter Of Circle = " + perimeter);
    }
}

class shape {
    public static void main(String args[]) {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        while (ch != 4) {
            System.out.print(
                    "\n\n\t\t\t...... Shapes Availabel ......\n 1.Triangle \n 2.Rectangle \n 3.Circle \n 4.Exit ");
            System.out.printf("\n\n Enter Your Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1: // Triangle
                {
                    // area of triangle
                    System.out.printf("\n Enter the Base Value : ");
                    int base = sc.nextInt();
                    System.out.printf(" Enter the Lenth value : ");
                    int length = sc.nextInt();
                    System.out.printf(" Enter the Hypoteneous of Triangle : ");
                    int hypo = sc.nextInt();
                    shapecal obj = new shapecal("Triangle", base, length, hypo);
                    obj.area(base, length); // area of triangle
                    obj.perimeter(base, length, hypo); // perimeter f triangle
                }
                    break;

                case 2: // Rectangle
                {
                    System.out.printf("\n Enter the Length Value : ");
                    int length = sc.nextInt();
                    System.out.printf(" Enter the Width Value : ");
                    int width = sc.nextInt();
                    shapecal obj = new shapecal("Rectangle", length, width);
                    obj.rarea(length, width); // area of rectangle
                    obj.rperimeter(length, width); // perimeter of rectangle
                }
                    break;

                case 3: // Circle
                {
                    System.out.printf("\n Enter the Radius Value : ");
                    int radius = sc.nextInt();
                    shapecal obj = new shapecal("Circle", radius);
                    obj.area(radius); // area of circle
                    obj.perimeter(radius); // perimeter of circle
                }
                    break;

                case 4:
                    System.out.printf("\n Exiting.....");
                    break;

                default:
                    System.out.println("\n Invalid Choice ....");
                    break;
            }
        }
    }
}
