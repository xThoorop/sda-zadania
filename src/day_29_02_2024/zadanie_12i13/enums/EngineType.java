package day_29_02_2024.zadanie_12i13.enums;

public enum EngineType {

    V12(10), V8(8), V6(6), S6(4), S4(2), S3(1);

    private int rank;

    EngineType(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
