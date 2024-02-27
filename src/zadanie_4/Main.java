package zadanie_4;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage(1,"hej");
        storage.addToStorage(1,"czesc");
        storage.addToStorage(1,"witaj");
        storage.addToStorage(1,"dzien dobry");
        storage.addToStorage(3,"abc");
        storage.addToStorage(4,"abcd");
        storage.addToStorage(5,"abcde");
        storage.addToStorage(5,"abcde");
        storage.addToStorage(5,"abcde");
        storage.addToStorage(7,"abcde");
        storage.addToStorage(6,"abcde");
        //storage.printValues(5);
        storage.findValues("abcde");
    }

    }
