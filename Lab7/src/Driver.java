public class Driver {
    public static void main(String[] args) {
        NameManager manager = new NameManager();
        manager.addName("M.Mickleson");
        manager.addName ("Johnua Taylor Biggs");
        manager.addName ("P.Smith");
        manager.addName ("Peter Jonathan Smythton");
        manager.addName ("P.Thompson");
        manager.printnames(); // should print all names
        manager.removelongnames();
        manager.printnames(); // should now have longer names removed

    }
}
