public class q23_PuzzlePizza {
    public static void main(String[] args) {
        int pizzas = 10;
        int puffs = 12;
        int coolDrinks = 5;

        generateBill(pizzas, puffs, coolDrinks);
    }
    public static void generateBill(int pizzas, int puffs,int coolDrinks){
        int pizzaPrice =100;
        int puffPrice = 20;
        int coolDrinkPrice =10;
        int totalPrice =(pizzaPrice * pizzas) + (puffPrice * puffs) + (coolDrinkPrice*coolDrinks);
        System.out.println("Bill Details");
        System.out.println("No. of pizzas:" + pizzas);
        System.out.println("No of puffs:"+ puffs);
        System.out.println("No of cooldrinks:" +coolDrinks);
        System.out.println("Total Price="+totalPrice);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
