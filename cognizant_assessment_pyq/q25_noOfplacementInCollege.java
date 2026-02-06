public class q25_noOfplacementInCollege {
    public static void main(String[] args) {
       int cse = 90;
       int ece = 90;
       int mech =72;
       HighestPlacement(cse,ece,mech);
    }
    public static void HighestPlacement(int cse, int ece, int mech){
        if(cse <0 || ece <0 || mech <0){
            System.out.println("Invalid input");
        }
        int max = Math.max(cse,Math.max(ece,mech));
        System.out.println("Highest placement");
        if(cse==max){
            System.out.println("CSE");
        }
        if(ece==max){
            System.out.println("ECE");
        }
        if(mech==max){
            System.out.println("MECH");
        }
    }
}
