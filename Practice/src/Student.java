public class Student {
    String Name;
    int Grade;

    public Student(String Name, int Grade) {
        this.Grade =Grade;
        this.Name =Name;
    }

    public void printstudentinfo() {
        System.out.print(" Name..." +  Name);
        System.out.print(" Grade..." +  Grade);

    }
}
