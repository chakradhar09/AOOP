abstract class Vehicle {
    public abstract void ride();
}

class Car extends Vehicle {
    @Override
    public void ride() {
        System.out.println("Car ride started!");
    }
}

class Bike extends Vehicle {
    @Override
    public void ride() {
        System.out.println("Bike ride started!");
    }
}

class Scooter extends Vehicle {
    @Override
    public void ride() {
        System.out.println("Scooter ride started!");
    }
}

class VehicleFactory {
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("Scooter")) {
            return new Scooter();
        } else {
            return null;
        }
    }
}
