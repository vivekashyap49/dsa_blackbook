import java.text.DecimalFormat;

public class q22_fuelConsumptionOfTruck {
    public static void main(String[] args) {
        float liters = 20;
        float distance = 150;
        CalculateFuel(liters,distance);
    }
    public static void CalculateFuel(float liters, float distance){
        if(liters < 0 || distance <0 ){
            System.out.println("Invalid input");
            return;
        }
        float litersPer100Km = (liters/distance)*100;
        float miles = distance*0.6214f;
        float gallons = liters * 0.2642f;
        float milesPerGallon = miles/gallons;
        /*DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("Liters/100KM: "+df.format(litersPer100Km));
        System.out.println();
        System.out.println("Miles/gallons: "+df.format(milesPerGallon));*/
        System.out.printf("%.2f",litersPer100Km);
        System.out.println();
        System.out.printf("%.2f",milesPerGallon);
    }

}
