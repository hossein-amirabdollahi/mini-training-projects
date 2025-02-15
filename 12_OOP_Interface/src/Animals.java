public class Animals {
}

interface Move{
    void move();
}

interface Fly extends Move{
    void fly();
}

interface Run extends Move{
    void run();
}

interface Swim extends Move{
    void swim();
}

class Bird implements Fly {

    @Override
    public void move() {
        this.fly();
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}

class Airplane implements Fly {

    @Override
    public void move() {
        this.fly();
    }

    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }
}

