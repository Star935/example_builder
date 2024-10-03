package domain.repository.impl;

import domain.entity.Vehicle;
import domain.repository.VehiclesBuilder;

public class ConcreteVehicleBuilder implements VehiclesBuilder {
    private String type;
    private int wheels;
    private String color;
    private String model;

    @Override
    public VehiclesBuilder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public VehiclesBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public VehiclesBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public VehiclesBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Vehicle build() {
        return new Vehicle(type, wheels, color, model);
    }
}
