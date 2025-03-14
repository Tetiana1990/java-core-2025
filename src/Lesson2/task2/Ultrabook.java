package Lesson2.task2;

public class Ultrabook extends Laptop{
    private double weight;

    public Ultrabook(String brand, String processor, int batteryLife, double weight) {
        super(brand, processor, batteryLife);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "weight=" + weight +
                '}';
    }
}
