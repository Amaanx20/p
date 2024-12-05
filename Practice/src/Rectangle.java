public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length =length;
        this.width = length;
    }
    public void setDimetions(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return this.length * this.width;
    }
    public void print() {
        System.out.println("Length is..."+length+"Width is..."+width+"Area.."+getArea());
    }
}
