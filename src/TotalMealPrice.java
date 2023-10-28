public class TotalMealPrice {
    public static void calculateTotalMealPrice(double listedPrice, double tipRate, double faxRate){
        double tip = tipRate * listedPrice;
        double fax = faxRate * listedPrice;
        double result = listedPrice + tip + fax  ;
        System.out.print("Your total meal price is " + result);
    }
    public static void main(String[] args) {
        calculateTotalMealPrice(15, .2, .08);
    }
}
