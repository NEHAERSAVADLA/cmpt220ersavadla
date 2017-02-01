import java.util.Scanner ; 
public class FutureDate {
public static void main (String[] args) {

Scanner Input = new Scanner(System.in);
System.out.print("Enter today's day: ");
int today = Input.nextInt();
System.out.print("Enter the number of days elapsed since today: ");
int future = Input.nextInt ();
future = (today + future)% 6 ; //to get remainder and make it vary from 0 - 6 
String todayText = null ; 
String futureText = null;

//Converting input integers into days in text for variable today
switch (today) {
case 0 : todayText = "Sunday" ; break;
case 1 : todayText = "Monday"; break;
case 2 : todayText = "Tuesday"; break;
case 3 : todayText = "Wednesday";break;
case 4 : todayText = "Thrusday"; break;
case 5 : todayText = "Friday"; break;
case 6 : todayText = "Saturday"; break;
}

//Converting input integers into days in text for variable future
switch (future) {
case 0 : futureText = "Sunday" ; break;
case 1 : futureText = "Monday"; break;
case 2 : futureText = "Tuesday"; break;
case 3 : futureText = "Wednesday";break;
case 4 : futureText = "Thrusday"; break;
case 5 : futureText = "Friday"; break;
case 6 : futureText = "Saturday"; break;
}

System.out.println("Today is " + todayText + " and the future day is " + futureText);

}
}