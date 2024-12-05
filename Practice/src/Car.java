public class Car {
    String Model;
    int Year;

    public Car (String Model, int Year) {
        this. Model = Model;
        this.Year = Year;
    }
    public void displaycarinfo() {
        System.out.print("(Model)..." + Model);
        System.out.print(" (Year)... " + Year);

    }
}
