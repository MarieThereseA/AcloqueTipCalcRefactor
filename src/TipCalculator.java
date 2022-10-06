public class TipCalculator {

    //Declaring variables
    private int numpeople; // number of people in the party
    private double totalBillBeforeTip = 0.0; // Total cost without tip
    private double tipPercentage;


    public TipCalculator(int people, double tipPercent) {
        people = numpeople;
        tipPercent = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public double getTipPercentage(){
        return tipPercentage;
    }

    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }

    public double tipAmount(){
        return totalBillBeforeTip * (tipPercentage / 100);
    }

    public double totalBill(){
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip / numpeople;
    }

    public double perPersonTipAmount(){
        return tipAmount() / numpeople;
    }

    public double perPersonTotalCost(){
        return totalBill() / numpeople;
    }

}
