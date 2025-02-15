import java.util.*;

public class Car implements Comparable<Car>{
    private String name;
    private Integer speed;
    private Integer price;
    public Car(String name, Integer speed, Integer price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }
    public int compareTo(Car car) {
        return this.price.compareTo(car.price);
    }
    public String getName() {
        return name;
    }
    public Integer getSpeed() {
        return speed;
    }
    public Integer getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Comparator<Car> comp = new Comparator<Car>() {
            public int compare(Car car1, Car car2) {
                return car1.getSpeed().compareTo(car2.getSpeed());
            }
        };
        Set<Car> cars = new TreeSet<Car>(comp);
        Collections.addAll(cars, new Car("pride", 200, 300),
                new Car("samand", 180, 700));
        Set<Car> cars1 = new TreeSet<>(cars);
        for (Car car : cars) {
            System.out.println(car.name);
        }
        System.out.println("");
        for (Car car : cars1) {
            System.out.println(car.name);
        }
    }
}
