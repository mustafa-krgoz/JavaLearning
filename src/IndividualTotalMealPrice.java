
    public class IndividualTotalMealPrice {
        public static double calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate){
            double tip = tipRate * listedPrice;
            double tax = taxRate * listedPrice;
            double result = tip + tax + listedPrice;
            return result;
        }
        public static void main(String[] args) {
            double groupTotalMealCost = calculateTotalMealPrice(100, .2, .08);
            System.out.println(groupTotalMealCost);

            double individualTotalMealCost = groupTotalMealCost / 5;
            System.out.println(individualTotalMealCost);
        }

    }
