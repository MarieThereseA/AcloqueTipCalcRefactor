public class TipCalculator {

    //Declaring variables
    private int people; // number of people in the party
    private double totalBillBeforeTip = 0.0; // Total cost without tip
    private double tipPercent;


    public TipCalculator(int people, double tipPercent) {
        this.people = people;
        this.tipPercent = tipPercent;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public double getTipPercentage(){
        return tipPercent;
    }

    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }

    public double tipAmount(){
        return totalBillBeforeTip * (tipPercent / 100);
    }

    public double totalBill(){
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip / people;
    }

    public double perPersonTipAmount(){
        return tipAmount() / people;
    }

    public double perPersonTotalCost(){
        return totalBill() / people;
    }

}
