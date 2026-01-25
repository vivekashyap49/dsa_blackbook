public class q26_primeInaRange {
    public static void main(String[] args) {
        int a = 12;
        int b = 25;
        primeInaRange(a,b);
    }
    public static void primeInaRange(int a, int b){
        if(a>=b || a<0 ||b<0){
            System.out.println("Provide valid input");
        }
        for(int num=a;num<=b;num++){
            if(num<=1) continue;
            boolean isPrime = true;
            int i=2;
            while(i*i<=num){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
            }if(isPrime){
                System.out.print(num+" ");
            }
        }

    }

}
