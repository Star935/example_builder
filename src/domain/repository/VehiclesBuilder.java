package domain.repository;

import domain.entity.Vehicle;

public interface VehiclesBuilder {
        VehiclesBuilder setType(String type);
        VehiclesBuilder setWheels(int wheels);
        VehiclesBuilder setColor(String color);
        VehiclesBuilder setModel(String model);
        Vehicle build();
}


