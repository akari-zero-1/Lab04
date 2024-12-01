//bai2.2.5
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = input.nextDouble();
        System.out.print("Nhap b: ");
        double b = input.nextDouble();

        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = (b != 0) ? a / b : Double.NaN;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (b != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("ERROR!");
        }

        input.close();
    }
}
