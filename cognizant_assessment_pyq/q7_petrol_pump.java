public class q7_petrol_pump {
    public static void main(String[] args) {
        int input1 = 2;
        int[] input3 = {1, 2, 3, 4, 5};
        int[] input4 = {1, 1, 0, 1, 1};
        int[] result = petrolPump(input1, input3, input4);
        for(int val : result){
            System.out.print(val+" ");
        }
    }
    public static int[] petrolPump(int moves,int[] petrol,int[] availability){
        int n= petrol.length;
        for(int m=0;m<moves;m++){
            for(int i=0;i<n;i++){
               if(availability[i]==1){
                   petrol[i]=petrol[i]*2;
               }
            }
        }
        return petrol;
    }
}
