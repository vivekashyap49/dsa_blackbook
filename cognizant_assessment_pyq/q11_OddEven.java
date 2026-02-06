import java.util.*;
public class q11_OddEven {
    public static void main(String[] args) {
        int n=5;
        int[] studentID={0,2,5,4,8};
        int ans=MaxNoOfStudentsInAGroup(n,studentID);
        System.out.println(ans);
    }
    public static int MaxNoOfStudentsInAGroup(int n, int[] studentId){
        int oddCount=0;
        int evenCount=0;
        for(int i=0;i<n;i++){
            if(studentId[i] % 2 ==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        int studentInOneGroup =Math.min(oddCount,evenCount);
        int studentInBothGroup =2*studentInOneGroup;
        return studentInBothGroup;
    }
}
