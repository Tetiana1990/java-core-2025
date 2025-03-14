package Lesson2.task2;

public class Workstation extends Laptop{
    private String gpu;

    public Workstation(String brand, String processor, int batteryLife, String gpu) {
        super(brand, processor, batteryLife);
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "gpu='" + gpu + '\'' +
                '}';
    }
}
