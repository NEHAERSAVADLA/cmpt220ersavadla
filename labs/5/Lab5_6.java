
import java.util.Scanner;
public class Lab5_6 {
 public static void main(String[] args) {
 
  System.out.print("Enter list: ");
  Scanner input = new Scanner(System.in);
  int a = input.nextInt();
  int[] list = new int[a];
 
  for (int i = 0; i < list.length; i++) {
   list[i] = input.nextInt();
  }
 
  String s = " not ";
  if (isSorted(list))
   s = " already ";
 
  System.out.print("The list is" + s + "sorted");
 
 }
 
 public static boolean isSorted(int[] list) {
 
  int a = list.length - 1;
  boolean isSorted = true;
 
  for (int i = 0; i < a; i++) {
   if (list[i] > list[i + 1]) {
    isSorted = false;
    break;
   }
  }
 
  return isSorted;
 
 }
 
}

