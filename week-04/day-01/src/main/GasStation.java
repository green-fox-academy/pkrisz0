package main;

public class GasStation {
    public static void main(String[] args) {
        Car limo = new Car(30,110);
        Station mol = new Station(1000);

        System.out.println("the station had this much: " + mol.gasAmount);
        System.out.println("the car now has this much: " + mol.refill(limo));
        System.out.println("the station had this much left: " + mol.gasAmount);
    }
}
