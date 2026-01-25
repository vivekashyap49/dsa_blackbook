public class q27_maxMarksIneachSem {
    public static void main(String[] args) {
        int noOfSem=3;
        int[] subPerSem={3,4,2};
        int[][] marks={{50,60,70},{90,98,76,67},{89,76}};
        maxMarks(noOfSem,subPerSem,marks);
    }
    public static void  maxMarks(int noOfSem,int[] subPerSem, int[][] marks){

        for(int i=0;i<noOfSem;i++){
            int max=-1;
            for(int j=0;j<subPerSem[i];j++){
                int mark=marks[i][j];
                if(mark<0 || mark>100){
                    System.out.println("You have entered invalid mark");
                    return;
                }
                if(mark>max){
                    max=mark;
                }
            }
            System.out.println("Maximum mark in" +(i+1)+"semester:"+ max);
        }
    }
}
