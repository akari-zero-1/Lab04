import java.util.Scanner;
public class Bai66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap kich thuoc matrix: ");
        int n = input.nextInt();
        int A[][]=new int[n][n];
        int B[][]=new int [n][n];
        int sum[][]=new int [n][n];
        for (int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j] = input.nextInt();
            }
        
        }
        System.out.println();
        for (int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                B[i][j] = input.nextInt();
            }
        
        }
        System.out.println();
        for (int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j] = A[i][j]+B[i][j];
            }
        
        }

        
        for (int i =0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        
        }
        input.close(); 
    }
    
  
    
}
