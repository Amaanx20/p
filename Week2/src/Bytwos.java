public class Bytwos implements Series{
    int val;

    Bytwos(){
        val = 0;
    }
    public int getnext(){
        val += 2;
        return val;
    }
}

