import java.util.Scanner;

public class Student {
    private String name;
    private long ID;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setID(long ID){
        this.ID = ID;
    }

    public long getID(){
        return ID;
    }

    public void display(){
        System.out.println("The name of the student is: " + name);
        System.out.println("And the ID of the student is: " + ID + "\n");
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setID(i + 1000);
            System.out.print("Enter the name of the student: ");
            students[i].setName(sc.next());
        }

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }

}
