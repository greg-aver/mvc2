package web.madel;

public class Car {
    private String name;
    private int series;
    private int age;

    public Car (String name, int series, int age) {
        this.age = age;
        this.name = name;
        this.series = series;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", series=" + series +
                ", age=" + age;
    }
}
