abstract class Subject {
    public String Name;
    public String Description;
    public String Room;
    public String Tutor;

    public Subject(String Name, String Description) {
        this.Name = Name;
        this.Description = Description;
    }

    public abstract int getCredit(); // Fixed method name

    public String getTutor() throws NoTutorException {
        if (Tutor == null) {
            throw new NoTutorException("Tutor is not set for " + Name);
        }
        return Tutor;
    }

    public String getRoom() throws NoRoomException {
        if (Room == null) {
            throw new NoRoomException("Room is not set for " + Name);
        }
        return Room;
    }

    public void setTutor(String tutor) { // Fixed method to accept a parameter
        this.Tutor = tutor;
    }

    public void setRoom(String room) { // Fixed method to accept a parameter
        this.Room = room;
    }

    @Override
    public String toString() {
        return "Subject: " + Name + "\nDescription: " + Description; // Improved formatting
    }
}
