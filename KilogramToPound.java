

public class KilogramToPound {


 int i = 1;

public static void main(String[] args)
{


    String output = "";                       
    System.out.println("kilograms | pounds");
    System.out.println("--------+-----------");
    for (int i = 1; i <= 199; i ++)
    {            
       // Every table line in between
    	 System.out.println("| " + i + " | " + (2.2 * i) + " |");
        }
    System.out.println(output);
    } //end method
} // end class