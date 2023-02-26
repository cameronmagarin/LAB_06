import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) throws Exception {
        double lengthRectangle = 0;//used to store the value of the length of the rectangle
        double widthRectangle = 0;//used to store the value of the width of the rectangle 
        double hypoRectangle = 0;//used to store the value of the hypotenuse of the rectangle
        double perimRectangle = 0;//used to store the value of the perimeter of the rectangle
        double areaRectangle = 0;// used to store the value of the area of the rectangle

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the length of your rectangle: ");
       if(in.hasNextDouble()){//checks if input is valid
        lengthRectangle = in.nextDouble();
       }
       else{//runs if input is invalid
        System.out.println("invalid value");
        }
        System.out.print("Please enter the width of your rectangle: ");
       if(in.hasNextDouble()){//checks if input is valid
        widthRectangle = in.nextDouble();
       }
       else{//runs if input is invalid
        System.out.println("invalid value");
       }
       perimRectangle = (2*lengthRectangle) + (2*widthRectangle);//calculates the perimeter of the rectangle and stores the value in perimRectangle
       areaRectangle = lengthRectangle * widthRectangle;//calculates the area of the rectangle and stores the value in areaRectangle
       hypoRectangle = (lengthRectangle*lengthRectangle) + (widthRectangle*widthRectangle); //I'm not sure how to find the square root of a value in Java
       

       System.out.println("The perimeter of your rectangle is: "+perimRectangle);//displays the value stored in perimRectangle
       System.out.println("The area of your rectangle is: "+areaRectangle);//displays the value stored in areaRectangle
       System.out.println("The diagonal of your rectangle is the square root of : "+hypoRectangle);//displays the value stored in hypoRectangle

    }
}
