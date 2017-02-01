import java.util.Scanner;

public class Stringlength {
 
  public static void main(String[] args) {
    //declare the String object
	    Scanner input = new Scanner(System.in);
	    System.out.println("enter a string");
	    String a = input.nextLine();
	    String firstcharacter="";
    //length() method of String returns the length of a String.
	    
    int length = a.length();
    System.out.println("The string entered is " + a);
    System.out.println("Length of a String is : " + length);

    firstcharacter=a.substring(0, 1);
    System.out.println("first character of string is:"+firstcharacter);
  }
}