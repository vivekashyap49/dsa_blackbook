public class q18_DoctorDailyEarnings {

    public static void main(String[] args) {

        int[] ages = {20, 30, 40, 50, 2, 3, 14};

        calculateIncome(ages);
    }

    public static void calculateIncome(int[] ages) {

        if (ages.length > 20) {
            System.out.println("INVALID INPUT");
            return;
        }

        int totalIncome = 0;

        for (int age : ages) {

            if (age <= 0 || age > 120) {
                System.out.println("INVALID INPUT");
                return;
            }

            if (age < 17) {
                totalIncome += 200;
            }
            else if (age <= 40) {
                totalIncome += 400;
            }
            else {
                totalIncome += 300;
            }
        }

        System.out.println("Total Income " + totalIncome + " INR");
    }
}
