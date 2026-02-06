import java.util.*;

public class q1_CountUniqueWeights {

    public static int countUniqueWeights(int Y) {

        Set<Long> current = new HashSet<>();
        current.add(0L);

        for (int i = 0; i < Y; i++) {
            Set<Long> next = new HashSet<>();

            for (long w : current) {
                next.add(w + 3);
                next.add(w * 2);
            }

            current = next;
        }

        return current.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        System.out.println(countUniqueWeights(Y));
        sc.close();
    }
}
