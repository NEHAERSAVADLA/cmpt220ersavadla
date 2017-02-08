import java.util.Scanner;

public class Factors
{
  public static void main (String[] args)
  {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("enter the number:");
    int N = scan.nextInt();
    
    for (int i =2;N>1;i++)
    {
      if(N%i == 0)
      {
        System.out.print(i +" ");
        
      N/=i;
      i=1;
      }
    }
  }
}

