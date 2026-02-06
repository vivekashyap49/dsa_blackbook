import java.util.Scanner;
import java.util.Stack;

public class q40_PrintBracketNumber {

    public static void printBracketNumbers(String str) {

        Stack<Integer> stack = new Stack<>();
        int num = 0;

        for (char ch : str.toCharArray()) {

            if (ch == '(') {
                num++;
                stack.push(num);
                System.out.print(num + " ");
            } else if (ch == ')') {
                int top = stack.pop();
                System.out.print(top + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        printBracketNumbers(str);

        sc.close();
    }
}
