public class RECTANGLE {
 
    private double width;
    private double height;

    public RECTANGLE() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public RECTANGLE(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height; 
    }

    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

}
 
