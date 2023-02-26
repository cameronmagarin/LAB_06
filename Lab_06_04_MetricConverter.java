import java.util.Scanner;

public class Lab_06_04_MetricConverter {
    public static void main(String[] args) throws Exception {
        double measurementMeters = 0;//Stores the value entered for number of meters wanted for conversion
        double measurementFeet = 0;//Stores the value entered for number of feet converted
        double measurementMiles = 0;//Stores the value entered for number of Miles converted
        double measurementInches =0;//Stores the value entered for number of inches converted

        Scanner in = new Scanner(System.in);

        System.out.print("What is your measurement in meters?: ");
        if(in.hasNextDouble()){//checks to see if value is valid
        measurementMeters = in.nextDouble();

        measurementFeet = measurementMeters/3.281;//converts meter value into feet equivalent. I used the recommended conversion to avoid truncation
        measurementInches = measurementMeters/39.37;//converts meter value into inches equivalent. I used the recommended conversion to avoid truncation
        measurementMiles = measurementMeters/1609.34;//converts meter value into mile equivalent. I used the recommended conversion to avoid truncation

        System.out.println("Your measurement in feet is approximately: "+measurementFeet);//displays the value in measurementFeet
        System.out.println("Your measurement in inches is approximately: "+measurementInches);//displays the value in measurementInches
        System.out.println("Your measurement in miles is approximately: "+measurementMiles);//displays the value in measurementMiles
        }
        else{//runs if value is invalid
            System.out.println("invalid value");
        }
    }
}
