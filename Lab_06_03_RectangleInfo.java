import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) throws Exception {
        double lengthRectangle = 0;
        double widthRectangle = 0;
        double hypoRectangle = 0;
        double perimRectangle = 0;
        double areaRectangle = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the length of your rectangle: ");
       if(in.hasNextDouble()){
        lengthRectangle = in.nextDouble();
       }
       else{
        System.out.println("invalid value");
        }
        System.out.print("Please enter the width of your rectangle: ");
       if(in.hasNextDouble()){
        widthRectangle = in.nextDouble();
       }
       else{
        System.out.println("invalid value");
       }
       perimRectangle = (2*lengthRectangle) + (2*widthRectangle);
       areaRectangle = lengthRectangle * widthRectangle;
       hypoRectangle = (lengthRectangle*lengthRectangle) + (widthRectangle*widthRectangle); 

       System.out.println("The perimeter of your rectangle is: "+perimRectangle);
       System.out.println("The area of your rectangle is: "+areaRectangle);
       System.out.println("The diagonal of your rectangle is the square root of : "+hypoRectangle);

    }
}
