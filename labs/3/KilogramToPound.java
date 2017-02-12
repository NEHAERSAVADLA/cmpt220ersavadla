

public class KilogramToPound {


 int i = 1;

public static void main(String[] args)
{
   // JA: The problem asked for two tables side by side, each with one direction of the conversion
   // JA: The kilograms->pounds incremented by 2 and the pounds->kilograms by 5

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