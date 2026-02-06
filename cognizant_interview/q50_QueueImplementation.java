import java.util.Scanner;

public class q50_QueueImplementation {

    static class Queue {
        int[] arr;
        int front, rear, capacity;

        Queue(int size) {
            capacity = size;
            arr = new int[size];
            front = 0;
            rear = -1;
        }

        void enqueue(int x) {
            if (rear == capacity - 1) {
                System.out.println("Queue Overflow");
                return;
            }
            arr[++rear] = x;
        }

        int dequeue() {
            if (front > rear) {
                System.out.println("Queue Underflow");
                return -1;
            }
            return arr[front++];
        }

        int front() {
            if (front > rear) {
                return -1;
            }
            return arr[front];
        }

        boolean isEmpty() {
            return front > rear;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.front());

        sc.close();
    }
}
