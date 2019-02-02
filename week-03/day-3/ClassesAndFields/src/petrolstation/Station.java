package petrolstation;

public class Station {
    int gasAmount;

public void refill (Car car){
    car.gasAmount= car.capacity;
    this.gasAmount = this.gasAmount-car.capacity;
}
}
