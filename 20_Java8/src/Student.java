public class Student {
    public static void main(String[] args) {
        Person student1 = new Person() {
            @Override
            public int age() {
                return 20;
            }

            @Override
            public String name() {
                return "Mamad";
            }
        };
        System.out.println(student1.name());
    }

    public static class Person {
        public String name() {
            return "Mamad";
        }
    }
}



