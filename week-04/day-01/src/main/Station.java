package main;

public class Station {
    int gasAmount;


    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public int refill(Car car) {
        this.gasAmount -= (car.capacity - car.gasAmount);
        car.gasAmount += (car.capacity - car.gasAmount);
        return car.capacity;
    }

}
