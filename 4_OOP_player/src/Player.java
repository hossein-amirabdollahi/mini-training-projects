public class Player {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void shut() {
        System.out.println("Player " + name + " shut up");
    }

    public void tackle() {
        System.out.println("Player " + name + " tackle on ground in " + age + " years old");
    }

    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setAge(30);
        player1.setName("Ali Day");
        player1.tackle();
        player1.shut();
    }
}
