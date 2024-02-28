package day_28_02_2024.zadanie_7.exceptions;

import java.util.EmptyStackException;

public class EmptyMagazineException extends RuntimeException{


    private String message;


    public EmptyMagazineException(){
        this.message = "zabraklo amunicji w magazynku";
    }

    public String getMessage() {
        return message;
    }
}
