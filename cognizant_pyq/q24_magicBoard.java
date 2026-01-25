public class q24_magicBoard {
    public static void main(String[] args) {
        int[] digits = {65, 66, 67, 68}; // always 4 inputs
        charToInt(digits);
    }
    public static void charToInt(int[] arr){
        for(int i=0;i< arr.length;i++){
            char ch = (char) arr[i];
            System.out.println(arr[i]+"-"+ch);
        }
    }
}
