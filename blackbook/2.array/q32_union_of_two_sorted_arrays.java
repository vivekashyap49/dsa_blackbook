import java.util.Scanner;

public class q32_union_of_two_sorted_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1= new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2= new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        int[] union =unionOfTwoSortedArrays(arr1,arr2);
        for(int i=0;i< union.length;i++){
            System.out.print(union[i] + " ");
        }
        sc.close();
    }
    public static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2){
        int n1= arr1.length;
        int n2= arr2.length;
        int[] temp = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;

        //traverse both arrays until one finishes
        while(i<n1 && j<n2){
            //if current element of arr1 is smaller
            if(arr1[i] < arr2[j]){
                //add only if it is not a duplicate
                if (k==0 || temp[k-1] != arr1[i]){
                    temp[k++] = arr1[i];
                }
                i++;//move pointer of arr1
            }
            //if current element of arr2 is smaller
            else if(arr1[i] > arr2[j]){
                    //add only if it is not a duplicate
                    if(k==0 || temp[k-1] != arr2[j]){
                        temp[k++] = arr2[j];
                    }
                    j++;//move pointer of arr2
            }
            //if both elements are equal
            else{
                //add element only once(to avoid duplicate)
                if(k==0 || temp[k-1] != arr1[i]){
                    temp[k++]=arr1[i];
                }
                //move both pointers
                i++;
                j++;
            }
        }
        //remaining elements of arr1
        while(i<n1){
            if(k==0 || temp[k-1] != arr1[i]){
                temp[k++] = arr1[i];
            }
            i++;
        }
        //remaining elements of arr2
        while(j<n2){
            if( k==0 || temp[k-1] != arr2[j]){
                temp[k++]=arr2[j];
            }
            j++;
        }
        //copy exact size result
        int[] result = new int[k];
        for(int x=0;x<k;x++){
            result[x]=temp[x];
        }
        return result;
    }

}
