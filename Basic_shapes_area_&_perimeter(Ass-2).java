/*2. Design a class for a basic shape. The class should have the following features:
- An instance variable for the shape's type (e.g. triangle, rectangle, circle).
- An instance variable for the shape's dimensions (e.g. side lengths for a triangle, length and width for a rectangle, radius for a circle).
- A constructor that allows the user to create a shape with a given type and dimensions.
- A method that calculates and returns the perimeter of the shape.
- A method that calculates and returns the area of the shape.*/
import java.util.*;

class calculates{

    //triangle
    void area(int b,int h)
    {
        double area = 0.5 * b *h ;
        System.out.printf("\n Area Of Triangle  = " +area);
    }
    
    void perimeter(int a,int b,int c)
    {
        int perimeter = a+b+c ;
        System.out.printf("\n Perimeter Of Circle = " +perimeter);
    }

    //rectangle
    void area(float l,float h)
    {
        float area = l * h;
        System.out.printf("\n Area Of Rectangle  = " +area);
    }
    
    void perimeter(float l,float h)
    {
        float perimeter = 2 * (l + h);
        System.out.printf("\n Perimeter Of Rectangle  = " +perimeter);
    }

    //Circlr
    void area(int r)
    {
        double area = 3.14 * r * r ;
        System.out.printf("\n Area Of Circle = " +area);
    }

    void perimeter(int r)
    {
        double perimeter = 2 * 3.14 * r ;
        System.out.printf("\n Perimeter Of Circle = " +perimeter);
    }
}

class shape
{
    public static void main(String args[]) 
    {
    int ch = 0;
    Scanner sc = new Scanner(System.in);
    calculates obj = new calculates();
    while(ch!=4)
    {
        System.out.print("\n\n\t\t\t...... Shapes Availabel ......\n 1.Triangle \n 2.Rectangle \n 3.Circle \n 4.Exit ");
        System.out.printf("\n\n Enter Your Choice : " );
        ch = sc.nextInt();
        switch(ch)
        {
           case 1: // Triangle
          {
            //area of triangle
            System.out.printf("\n Enter the Base Value : "); 
            int base = sc.nextInt();
            System.out.printf(" Enter the Lenth value : ");
            int height = sc.nextInt();
            System.out.printf("\n Enter Three Sides of Triangle : ");
            System.out.printf("\n\n Side-1 : ");
            int side1 = sc.nextInt();
            System.out.printf(" Side-2 : ");
            int side2 = sc.nextInt();
            System.out.printf(" Side-3 : ");
            int side3 = sc.nextInt();
            obj.area(base,height); // area of triangle
            obj.perimeter(side1,side2,side3); // perimeter f triangle
        }
        break;

         case 2: // Rectangle
        {
            System.out.printf("\n Enter the Length Value : "); 
            float length = sc.nextInt();
            System.out.printf(" Enter the Height Value : ");
            float height = sc.nextInt();
            obj.area(length,height); // area of rectangle
            obj.perimeter(length,height); // perimeter of rectangle
        }
        break;

        case 3: // Circle
        {
            System.out.printf("\n Enter the Radius Value : "); 
            int radius = sc.nextInt();
            obj.area(radius); // area of circle
            obj.perimeter(radius); // perimeter of circle
        }
        break; 

        case 4:
        System.out.printf("\n Exiting.....");
        break;

        default :
            System.out.println("\n Invalid Choice ....");
            break;
        }
    }
    }
}