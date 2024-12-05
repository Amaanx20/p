package src;

public class Chemistry extends Subject {
    public Chemistry() {
        super("Chemistry", "Chemistry Subject");
    }

    @Override
    public int getCredit() {
        return 100;
    }
}
