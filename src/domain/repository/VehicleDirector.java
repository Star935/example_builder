package domain.repository;

import domain.entity.Vehicle;

public class VehicleDirector {
    private VehiclesBuilder builder;

    public VehicleDirector(VehiclesBuilder builder) {
        this.builder = builder;
    }

    public Vehicle constructCar(String type, int wheels, String color, String model) {
        return builder.setType(type)
                .setWheels(wheels)
                .setColor(color)
                .setModel(model)
                .build();
    }

    public Vehicle constructMoto(String type, int wheels, String color, String model) {
        return builder.setType(type)
                .setWheels(wheels)
                .setColor(color)
                .setModel(model)
                .build();
    }
}
