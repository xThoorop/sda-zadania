package day_06_03_2024.zadanie_38.objects;

import java.util.concurrent.atomic.AtomicInteger;

public class Results {



    private AtomicInteger result;


    public Results() {
        this.result = new AtomicInteger(0);
    }


    public AtomicInteger getResult() {
        return result;
    }
    public void addResult(int i) {
        this.result.addAndGet(i);
    }
    public void setResult(int i) {
        this.result.set(i);
    }
}
