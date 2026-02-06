public class q6_houseLight {
    public static void main(String[] args) {
        int initialPower1 = 2;
        String input1 = "HHCBCHHHHC";
        System.out.println(housesLit(initialPower1, input1)); // Output: 5
        int initialPower2 = 2;
        String input2 = "HBH";
        System.out.println(housesLit(initialPower2, input2)); // Output: 2
        int initialPower3 = 2;
        String input3 = "HHCCHHHHC";
        System.out.println(housesLit(initialPower3,input3));
    }
    public static int housesLit(int power,String s){
        int n=s.length();
        int bulbIndex =s.indexOf('B');

        if(bulbIndex==-1){
            return 0;
        }
        int housesLit =0;
        //left traverse
        int leftPower=power;
        for(int i=bulbIndex-1;i>=0 && leftPower>0;i--){
            char ch =s.charAt(i);
            if(ch=='H'){
                leftPower--;
                housesLit++;
            }if(ch=='C'){
                leftPower++;
            }
        }
        //right traverse
        int rightPower = power;
        for(int i=bulbIndex +1;i<n && rightPower >0;i++){
            char ch =s.charAt(i);
            if(ch=='H'){
                rightPower--;
                housesLit++;
            }if(ch=='C'){
                rightPower++;
            }
        }
        return housesLit;
    }
}
