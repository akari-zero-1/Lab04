import java.util.Scanner;

public class Bai63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu cao tam giac (n): ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) { 
            for (int j = i; j < n - 1; j++) {
                System.out.print(" "); 
            }
            for (int j = 0; j < (2 * i + 1); j++) { 
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        input.close(); 
    }
}
