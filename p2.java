import java.util.*;

public class p2 {

    public static void main(String[] args) {
        System.out.println("Enter the weight in pounds :");
        try (Scanner obj = new Scanner(System.in)) {
            double w = obj.nextDouble();
            System.out.println("Enter the height in inches :");
            double h = obj.nextDouble();
            // convert pound into kg
            double weight = (w * (0.454));
            System.out.println("The weight in kg :" + weight);
            // conver inch into meter
            double height = (h * (0.0254));
            System.out.println("The squre of height in meter" + height);
            double BMI = (weight / (height * height));
            System.out.println("The BMI is :" + BMI);
        }
    }
}
