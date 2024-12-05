public class studentdetails {
    private String name;
    private double grade;

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            this.grade = grade;
        } else {
            System.out.println("Grade is invalid please enter a grade between 0.0 - 100.0");
        }
    }
    public void printstudentdetails() {
        System.out.println("Name..." + name);
        System.out.println("Grade..."+ grade);
    }

}



