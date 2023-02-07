package lesson2;

import java.util.LinkedList;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari");
        Car bugatti = new Car("Bugatti");
        Car lambo = new Car("Lamborghini");
        Car ford = new Car("Ford");
        Car fiat = new Car("Fiat");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars);

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars);
        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}


