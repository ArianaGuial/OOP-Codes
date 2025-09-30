abstract class Vehicle
{
    public abstract void startEngine();
}

interface Refuelable
{
    void refuel();
}

class Car extends Vehicle implements Refuelable
{
    public void startEngine()
    {
        System.out.println("\nCar started with key ignition");
    }
    public void refuel()
    {
        System.out.println("Car refueled with gasoline");
    }
}

class Motorbike extends Vehicle implements Refuelable
{
    public void startEngine()
    {
        System.out.println("\nMotorbike started with key ignition");
    }
    public void refuel()
    {
        System.out.println("Motorbike refueled with petrol");
    }
}

public class VehiclesDemo
{
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Motorbike();

        myCar.startEngine();
        ((Refuelable) myCar).refuel();

        myBike.startEngine();
        ((Refuelable) myBike).refuel();
    }
}
