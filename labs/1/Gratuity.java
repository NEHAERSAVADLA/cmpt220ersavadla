
import java.util.Scanner;

public class Gratuity {

public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

   System.out.print(" Enter the subtotal : ");

   double subtotal  = input.nextDouble();

   System.out.print(" Enter the gratuity rate : ");

   double gratuity = input.nextDouble();

   double caculateGratuity = (gratuity) / subtotal;

   double total = subtotal + caculateGratuity ;

   System.out.println(" The Gratuity is : $" +  caculateGratuity  + " and total is : $" + total);
  }  
}