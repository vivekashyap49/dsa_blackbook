public class q14_printerWaitingTime {
    public static void main(String[] args) {
        System.out.println(findWaitingTime(4, 5));   // Output: 15
        System.out.println(findWaitingTime(3, 10));  // Output: 0
    }
    public static int findWaitingTime(int input1,int input2){
        int N = input1;
        int X =input2;
        int totalPrintTime = (N-1)*10;
        int arrivalTime = (N-1)*X;
        int waitingTime=totalPrintTime-arrivalTime;
        return Math.max(waitingTime,0);
    }
}
