import java.util.Arrays;
import java.util.Scanner;

public class Bai65 {
    public static void main(String[] args) {
        
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        int A[] = new int[n]; 
        for (int i = 0; i < n; i++) { 
            A[i] = input.nextInt(); 
        }
        Arrays.sort(A);
        for(int i = 0; i < n; i++) {
            System.out.print(A[i] + " "); 
        }
        System.out.println();
        for(int i =0;i<n;i++){
          sum= sum +A[i];
        }
        System.err.println("Sum:"+sum);
        double Aver=sum/n;
        System.out.println("Average:"+Aver);
        input.close(); 
    }
}
