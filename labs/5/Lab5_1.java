
import java.util.Scanner;
public class Lab5_1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double[] list = new double[10];
for(int i =0; i<list.length; i++){
System.out.printf("Enter the number for index %d : ",i);
list[i] = sc.nextDouble();
}
int a= indexOfSmallestElement(list);
double e = list[a];
System.out.println();
System.out.printf("The smallest element is %.2f and its index is %d.\n",e,a);

}

    private static int indexOfSmallestElement(double[] list) {
        double currentValue = list[0];
int smallestIndex = 0;
for (int j=1; j < 10 ; j++) {
if (list[j] < currentValue)
{
currentValue = list[j];
smallestIndex = j;
}
}  
return smallestIndex;
 
    }
}
