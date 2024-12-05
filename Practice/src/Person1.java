public class Person1 {
    String name;
    int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Error...The number cannot be less than zero");
            this.age = age;
        }else {
            this.age = age;
        }
    }
}
