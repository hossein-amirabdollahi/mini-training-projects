public class Person {
    private String name;
    private int age;
    private Long nationalID;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getNationalID() {
        return nationalID;
    }
    public void setNationalID(Long nationalID) {
        this.nationalID = nationalID;
    }

    public void display() {
        System.out.println("\nName: " + name + "\nAge: " + age
                + "\nNationalID: " + nationalID);
    }
}
