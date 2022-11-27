package j13_object;

public class Car {
    private  String model;
    private  String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {// tostring은 object것을 오버라이드 한것.
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
