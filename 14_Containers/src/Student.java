public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int score;
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student student) {
        return ((this.score < student.score) ? -1
                : ((this.score == student.score) ? 0 : 1));
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getScore() {
        return score;
    }
}
