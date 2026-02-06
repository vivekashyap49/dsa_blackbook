import java.util.Scanner;

public class q49_StackImplementation {

    static class Stack {
        int[] arr;
        int top;
        int capacity;

        Stack(int size) {
            capacity = size;
            arr = new int[size];
            top = -1;
        }

        void push(int x) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        int peek() {
            if (top == -1) {
                return -1;
            }
            return arr[top];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        sc.close();
    }
}
