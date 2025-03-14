package Lesson3.demo2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(25));
        instruments.add(new Drum(5));
        instruments.add(new Trumpet(10.5));

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
