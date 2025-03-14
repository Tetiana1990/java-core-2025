package Lesson2.task2;

public class Laptop extends PC{
    private int batteryLife;

    public Laptop(String brand, String processor, int batteryLife) {
        super(brand, processor);
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryLife=" + batteryLife +
                '}';
    }
}
