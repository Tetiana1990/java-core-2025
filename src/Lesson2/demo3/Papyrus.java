package Lesson2.demo3;




public class Papyrus {
    private String material;
    private int age;

    public Papyrus(int age, String material) {
        this.age = age;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "age=" + age +
                ", material='" + material + '\'' +
                '}';
    }
}
