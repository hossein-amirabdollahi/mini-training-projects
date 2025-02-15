import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManaging {

    // کلاس برای تعریف ویژگی‌ها و رفتارهای یک عضو
    class Member {
        private static int idCounter = 1; // شمارنده خودکار برای شماره عضویت
        private final int memberId;       // شماره عضویت (غیرقابل تغییر)
        private String name;              // نام عضو
        private int age;                  // سن عضو
        private char gender;              // جنسیت عضو (M یا F)

        // سازنده
        public Member(String name, int age, char gender) {
            this.memberId = idCounter++;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        // متدهای getter و setter
        public int getMemberId() {
            return memberId;
        }

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

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        // نمایش اطلاعات عضو
        public void displayInfo() {
            System.out.println("Member ID: " + memberId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + (gender == 'M' ? "Male" : "Female"));
        }
    }

    // کلاس برای مدیریت اعضای کتابخانه
    class Library {
        private final ArrayList<Member> members = new ArrayList<>(); // لیست اعضا

        // افزودن عضو جدید
        public void addMember(String name, int age, char gender) {
            Member member = new Member(name, age, gender);
            members.add(member);
            System.out.println("Member added successfully with ID: " + member.getMemberId());
        }

        // نمایش اطلاعات یک عضو
        public void displayMember(int memberId) {
            for (Member member : members) {
                if (member.getMemberId() == memberId) {
                    member.displayInfo();
                    return;
                }
            }
            System.out.println("Member not found!");
        }

        // ویرایش اطلاعات یک عضو
        public void editMember(int memberId, String newName, int newAge, char newGender) {
            for (Member member : members) {
                if (member.getMemberId() == memberId) {
                    member.setName(newName);
                    member.setAge(newAge);
                    member.setGender(newGender);
                    System.out.println("Member updated successfully!");
                    return;
                }
            }
            System.out.println("Member not found!");
        }

        // حذف یک عضو
        public void removeMember(int memberId) {
            for (Member member : members) {
                if (member.getMemberId() == memberId) {
                    members.remove(member);
                    System.out.println("Member removed successfully!");
                    return;
                }
            }
            System.out.println("Member not found!");
        }
    }

    // کلاس اصلی برای اجرای برنامه
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Library library = new Library();

            while (true) {
                System.out.println("\nLibrary Management System:");
                System.out.println("1. Add Member");
                System.out.println("2. Display Member");
                System.out.println("3. Edit Member");
                System.out.println("4. Remove Member");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.next();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter gender (M/F): ");
                        char gender = scanner.next().charAt(0);
                        library.addMember(name, age, gender);
                        break;
                    case 2:
                        System.out.print("Enter Member ID: ");
                        int memberId = scanner.nextInt();
                        library.displayMember(memberId);
                        break;
                    case 3:
                        System.out.print("Enter Member ID: ");
                        memberId = scanner.nextInt();
                        System.out.print("Enter new name: ");
                        String newName = scanner.next();
                        System.out.print("Enter new age: ");
                        int newAge = scanner.nextInt();
                        System.out.print("Enter new gender (M/F): ");
                        char newGender = scanner.next().charAt(0);
                        library.editMember(memberId, newName, newAge, newGender);
                        break;
                    case 4:
                        System.out.print("Enter Member ID: ");
                        memberId = scanner.nextInt();
                        library.removeMember(memberId);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid option! Please try again.");
                }
            }
        }
    }

}
