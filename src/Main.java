import domain.entity.Vehicle;
import domain.repository.VehicleDirector;
import domain.repository.VehiclesBuilder;
import domain.repository.impl.ConcreteVehicleBuilder;

public class Main {
    public static void main(String[] args) {
        VehiclesBuilder builder = new ConcreteVehicleBuilder();
        VehicleDirector director = new VehicleDirector(builder);

        // Construir un coche
        Vehicle car = director.constructCar("carro", 4, "rojito", "carro bonito");
        System.out.println("Car: " + car);

        // Construir un coche
        Vehicle carrito = director.constructCar("carro bonito", 4, "rojito", "carro bonito");
        System.out.println("Car: " + carrito);

        // Construir una bicicleta
        Vehicle moto = director.constructMoto("moto", 2, "azulito", "moto bonita");
        System.out.println("Moto: " + moto);
    }
}