import java.util.Scanner;

public class Lab_06_04_MetricConverter {
    public static void main(String[] args) throws Exception {
        double measurementMeters = 0;
        double measurementFeet = 0;
        double measurementMiles = 0;
        double measurementInches =0;

        Scanner in = new Scanner(System.in);

        System.out.print("What is your measurement in meters?: ");
        if(in.hasNextDouble()){
        measurementMeters = in.nextDouble();

        measurementFeet = measurementMeters/3.281;
        measurementInches = measurementMeters/39.37;
        measurementMiles = measurementMeters/1609.34;

        System.out.println("Your measurement in feet is approximately: "+measurementFeet);
        System.out.println("Your measurement in inches is approximately: "+measurementInches);
        System.out.println("Your measurement in miles is approximately: "+measurementMiles);
        }
        else{
            System.out.println("invalid value");
        }
    }
}
