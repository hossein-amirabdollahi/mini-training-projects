import java.util.Comparator;

public class CanCompare {
    public static void main(String[] args) {
        Student student1 = new Student("Hossein", 28, 18);
        Student student2 = new Student("Michael", 25, 20);
        Comparator<Student> comparator = new StudentComparator();
        System.out.println(comparator.compare(student1, student2));
        System.out.println(student1.compareTo(student2));

    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (s1.getAge() < s2.getAge()) ? 1
                : ((s1.getAge() == s2.getAge()) ? 0 : -1);
    }
}
