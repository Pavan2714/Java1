import java.util.*;

public class p1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of a");
        try (Scanner obj = new Scanner(System.in)) {
            float a = obj.nextFloat();
            System.out.println("Enter the value of b");
            float b = obj.nextFloat();
            System.out.println("Enter the value of c");
            float c = obj.nextFloat();
            System.out.println("Enter the value of d");
            float d = obj.nextFloat();
            System.out.println("Enter the value of e");
            float e = obj.nextFloat();
            System.out.println("Enter the value of f");
            float f = obj.nextFloat();

            float g = a * d - b * c;

            float x = (e * d - b * f) / g;
            float y = (a * f - e * c) / g;

            if (g == 0) {
                System.out.println("The equation has no solution");
            } else {
                System.out.println(x);
                System.out.println(y);
            }

        }
    }
}
