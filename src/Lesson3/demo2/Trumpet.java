package Lesson3.demo2;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Trumpet implements Instrument{
    private double diameter;

    @Override
    public void play() {
        System.out.println("Playing a trumpet with a diameter " + diameter + "cm");
    }
}
