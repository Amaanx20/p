public class Driver {
    public static void main(String[] args) {
        // Create an array to store Subject instances
        Subject[] subjectArray = new Subject[5];

        // Instantiate subjects with different tutors and rooms
        subjectArray[0] = new Maths();
        subjectArray[0].setTutor("Dr. Smith");
        subjectArray[0].setRoom("Room 101");

        subjectArray[1] = new Physics();
        subjectArray[1].setTutor("Prof. Johnson");
        subjectArray[1].setRoom("Lab A");

        subjectArray[2] = new Chemistry();
        subjectArray[2].setTutor("Dr. Brown");
        subjectArray[2].setRoom("Room 202");

        subjectArray[3] = new Geography();
        subjectArray[3].setTutor("Ms. Green");
        subjectArray[3].setRoom("Room B");

        subjectArray[4] = new Languages(); // No tutor and room set

        // Iterate through array and print subject details
        for (Subject subject : subjectArray) {
            try {
                System.out.println(subject.toString());
                System.out.println("Credit: " + subject.getCredit());
                System.out.println("Tutor: " + subject.getTutor());
                System.out.println("Room: " + subject.getRoom());
            } catch (NoTutorException | NoRoomException e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
