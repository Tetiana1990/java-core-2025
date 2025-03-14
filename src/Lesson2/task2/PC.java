package Lesson2.task2;

public class PC {
    private String brand;
    private String processor;

    public PC(String brand, String processor) {
        this.brand = brand;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "PC{" +
                "brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
