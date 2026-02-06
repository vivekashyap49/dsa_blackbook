public class q28_luckyNumber {
    public static void main(String[] args) {
        int num=1234;
        LuckyNumber(num);
    }
    public static void LuckyNumber(int num){
        if(num < 1000 && num <9999){
            System.out.println("Invalid car number");
            return;
        }
        int sum  = 0;
        int temp = num;
        while(temp > 0){
            sum+=temp % 10;
            temp /= 10;
        }
        if(sum % 3==0||sum % 5==0||sum % 7==0){
            System.out.println("Lucky Number");
        }else{
            System.out.println("Sorry its not my lucky number");
        }

    }
}
