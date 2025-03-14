package Lesson3.demo2;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Guitar implements Instrument{
    private int numberOfStrings;


    @Override
    public void play() {
        System.out.println("Play Guitar with " + numberOfStrings + " Strings");
    }
}
