public class q5_MaximumGuestsOnCruise {

    public static void main(String[] args) {

        int T = 5;
        int[] E = {7, 0, 5, 1, 3};
        int[] L = {1, 2, 1, 3, 4};

        System.out.println(maxGuests(T, E, L)); // 8
    }

    public static int maxGuests(int T, int[] E, int[] L) {

        int currentGuests = 0;
        int maxGuests = 0;

        for (int i = 0; i < T; i++) {
            currentGuests += E[i];
            currentGuests -= L[i];

            if (currentGuests > maxGuests) {
                maxGuests = currentGuests;
            }
        }

        return maxGuests;
    }
}
