//bai2.2.6 
import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         System.out.println("Nhap lua chon cua ban vao:");
         int number =input.nextInt();
         if (number==1) {
            System.out.println("linear equation");
            System.out.println("Nhap a: ");
            double a =input.nextDouble();
            System.out.println("nhap b:");
            double b =input.nextDouble();
            if (a==0) {
                if (b==0) {
                    System.out.println("phuong trinh vo nghiem!");
                }
                else{
                    System.out.println("phuong trinh vo nghiem!");
                }
                
            }else{
                double x =-b/a;
                System.out.println("nghiem cua phuong trinh la :" +x);
            }
            
         }else if (number ==2) {
            System.out.println("linear system");
            System.out.print("Nhap a11: ");
            double a11 = input.nextDouble();
            System.out.print("Nhap a12: ");
            double a12 = input.nextDouble();
            System.out.print("Nhap b1: ");
            double b1 = input.nextDouble();
            System.out.print("Nhap a21: ");
            double a21 = input.nextDouble();
            System.out.print("Nhap a22: ");
            double a22 = input.nextDouble();
            System.out.print("Nhap b2: ");
            double b2 =input.nextDouble();
            
            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;
            if (D==0) {
                if (D1==0&&D2==0){
                    System.out.println("Vo so nghiem!");

                }else{
                    System.out.println("Vo nghiem,!");
                }   
            }else{
                double x1 = D1 / D;
                double x2 = D2 / D;
                System.out.println("x1="+x1+"x2="+x2);
            }
         }else if (number ==3) {
            System.out.println(" quadratic equation for degree two");
            System.out.print("Nhap a: ");
           double a = input.nextDouble();
            System.out.print("Nhap b: ");
             double b = input.nextDouble();
            System.out.print("Nhap c: ");
            double c = input.nextDouble();
            if (a==0) {
                if (b==0) {
                    if (c==0) {
                        System.out.println("vo so nghiem!");                       
                    }else{
                        System.out.println("Vo nghiem!");
                    }    
                }else{
                    double x=-b/c;
                    System.out.println("x= "+x);
                }
                
            }else{
                double delta =b*b-4*a*c;
                if (delta <0) {
                    System.out.println("Vo nghiem");
                }
                else if(delta ==0){
                    double x = -b / (2 * a);
                    System.out.println("x= "+x);
                }else{
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("x1="+x1+"x2="+x2);
                }
            }
            
         }else{
            System.out.println("nhap lai!");
         }
         input.close();
    }
}
