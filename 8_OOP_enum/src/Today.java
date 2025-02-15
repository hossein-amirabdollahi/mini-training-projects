public class Today {
    enum Day {
        Monday(1), Tuesday(2), Wednesday(3),
        Thursday(4), Friday(5), Saturday(6),
        Sunday(7);

        private final int dayNumber;

        Day(int dayNumber) {
            this.dayNumber = dayNumber;
        }

        public int getDayNumber() {
            return dayNumber;
        }
    }

    public static void main(String[] args) {
        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println("The "+day.getDayNumber()+ "st of the week is "+ day);
        }
        Day day = Day.Friday;
        System.out.println("Today is: " + day + " and it's the "
                +day.getDayNumber() + "st day on the week.");
    }
}
