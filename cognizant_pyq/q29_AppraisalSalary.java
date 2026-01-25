public class q29_AppraisalSalary {
    public static void main(String[] args) {
        double salary1 = 8000;
        double rating1 = 3;
        AppraisalSalary(salary1, rating1); // 8800

        double salary2 = 7500;
        double rating2 = 4.3;
      AppraisalSalary(salary2, rating2); // 9750
    }
    public static void AppraisalSalary(double salary, double rating ){
        if(salary<0 || rating <1 || rating>5){
            System.out.println("Invalid Input");
            return;
        }
        if(rating>=1 && rating<=3){
            salary=salary+0.1*salary;
        }
        else if(rating>=3.1 && rating<=4){
            salary=salary+0.25*salary;
        }
        else if(rating>=4.1 && rating<=5){
            salary=salary+0.3*salary;
        }
        System.out.println((int) salary);
    }
}
