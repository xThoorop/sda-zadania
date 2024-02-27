package zadanie_5;

public class Main {



    public static void main(String[] args){
        SDAHashSet<String> sdaHashSet = new SDAHashSet<String>();
        sdaHashSet.add("test");
        sdaHashSet.add("test");
        System.out.println(sdaHashSet.size());
    }
}
