import java.util.Arrays;

public class q20_stonegame {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 5;
        int[] result=stoneGame(a,b,c);
        System.out.println(Arrays.toString(result));
    }
    public static int[] stoneGame(int a,int b,int c){
        int[] arr={a,b,c};
        Arrays.sort(arr);
        int x=arr[0];
        int y=arr[1];
        int z=arr[2];
        int min;
        int max;
        //min moves
        if(y==x+1 && z==y+1){
            min=0;
        }else if(y-x==2 || z-y==2){
            min=1;
        }else{
            min=2;
        }
        //max moves
        max=z-x-2;
        int[] ans={min,max};
        return ans;
        //return new int[]{min, max};
    }
}
