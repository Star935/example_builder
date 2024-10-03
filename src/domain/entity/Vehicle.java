package domain.entity;

public class Vehicle {
    private String type;
    private int wheels;
    private String color;
    private String model;

    public Vehicle(String type, int wheels, String color, String model) {
        this.type = type;
        this.wheels = wheels;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}


