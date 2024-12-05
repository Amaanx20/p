import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameManager {

    List<String> names = new ArrayList<String>();

    public void addName(String name) {
        names.add(name);
    }
    public void printnames() {
        for (String name: names)
            System.out.println(name);
    }
    public void removelongnames(){
        Iterator<String> iter = names.listIterator();

        while(iter.hasNext());
        String name = iter.next();
        if (name.length() > 15 )
        iter.remove();
    }


}