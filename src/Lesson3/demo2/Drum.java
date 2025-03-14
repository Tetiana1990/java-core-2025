package Lesson3.demo2;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Drum implements Instrument{
    private int size;

    @Override
    public void play() {
        System.out.println("Plays a drum the size of " + size);
    }
}
