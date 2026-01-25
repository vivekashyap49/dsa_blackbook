import java.util.Scanner;

public class q30_remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=remove_duplicates_from_sorted_array(arr);
        System.out.println(ans);
        for(int i=0;i<ans;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static int remove_duplicates_from_sorted_array(int[] arr){
        if(arr.length<1) return 0;
        if(arr.length==1) return 1;
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[index]){
                index++;
                arr[index]=arr[i];
            }
        }
        return index+1;
    }
}
