import java.util.*;
public class q6_divisors_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of a number");
        int n = sc.nextInt();
        List<Integer> divisors = getDivisors(n);
        System.out.println(divisors);
        sc.close();
    }
    public static List<Integer> getDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i =1; i*i <= n;i++){
            if(n % i ==0){
                list.add(i);
                if(i!=n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
