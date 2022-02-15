import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        System.out.print("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        BMI user = new BMI(weight, height);

        //user.calculateBMI();
        user.bmiInterpretation();

        input.close();
    }
}
