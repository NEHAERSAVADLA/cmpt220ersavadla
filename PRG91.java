
public class PRG91 {

    public static void main(String[] args) {


        RECTANGLE[] rectangles = new RECTANGLE[2];
        rectangles[0] = new RECTANGLE(4,40);
        rectangles[1] = new RECTANGLE(3.5, 35.9);

        for (int i = 0; i < 2; i++){
            System.out.println("RECTANGLE " + (i+1) +":");
            System.out.print("Area = " + rectangles[i].getArea());
            System.out.println(" Perimeter = " +  rectangles[i].getPerimeter() +"\n");
        }
    }
}
    

