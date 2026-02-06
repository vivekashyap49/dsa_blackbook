public class q10_mazeProblem {
    public static void main(String[] args) {
        int input1 = 5;                // size of array
        int input2 = 0;                // starting index
        int[] input3 = {2, 3, 1, 2, 1}; // maze steps array

        int result = zigzagExit(input1, input2, input3);
        System.out.println(result); // Expected Output: 2
    }
    public static int zigzagExit(int input1,int input2,int[] input3){
        int n = input1;
        int current = input2;
        boolean[] visited = new boolean[n];
        boolean moveRight = true;
        while (true){
            //loop detected
            if(visited[current]){
                return -1;
            }
            visited[current] = true;
            int steps = input3[current];
            int next;
            if(moveRight){
                next=current+steps;
            }else{
                next=current-steps;
            }
            //out of bound check
            if(next < 0 || next >=n){
                return input3[current];
            }
            current = next;
            moveRight = !moveRight;
        }
    }
}
