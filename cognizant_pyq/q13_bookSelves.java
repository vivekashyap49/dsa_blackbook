
public class q13_bookSelves {
    public static void main(String[] args) {
        int students=4;
        int selfCapacity=4;
        int[] books={5,7,8,10};
        int ans=NoOfFullyFilledBookshelves(students,selfCapacity,books);
        System.out.println(ans);
    }
    public static int NoOfFullyFilledBookshelves(int students, int shelfCapacity, int[] books){
        int totalbook =0;
        for(int i=0;i<students;i++){
          totalbook+=books[i];
        }
        int countBookSelf =totalbook/shelfCapacity;
        return countBookSelf;
    }
}
