public class Student extends Person {
    private Long studentID;
    public Long getStudentID() {
        return studentID;
    }
    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public void display() {
        System.out.println("\nname: " + getName()+ "\nage: " + getAge() + "\nnationalID: " + getNationalID()
        + "\nstudentID: " + studentID);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Hossein");
        p.setAge(22);
        p.setNationalID(19416830L);
        p.display();

        Student s = new Student();
        s.setName("Narges");
        s.setAge(21);
        s.setNationalID(93816830L);
        s.setStudentID(1L);
        s.display();
    }
}
