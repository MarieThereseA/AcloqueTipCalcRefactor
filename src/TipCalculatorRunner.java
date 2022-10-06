import java.text.DecimalFormat;
import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");


        //Declaring variables
        double totalCost = 0; // Total cost without tip
        double tipPercent = 0;
        String totalTip;
        String totalTipCost; // Total cost including tip
        String perCost; //Total cost per person without tip
        String perTipCost; //Total cost per person including tip
        String perTip; //total tip per person

        //Greeting + # of people + tip percentage
        int people = 0;
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group? ");
        people = scan.nextInt();
        System.out.print("What's the tip percentage? ");
        tipPercent = scan.nextDouble();

        //Total cost
        double itemCost = 0;

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end) ");
        totalCost += scan.nextDouble();
        while (itemCost != -1){
            System.out.print("Enter a cost in dollars and cents (-1 to end) ");
            itemCost = scan.nextDouble();
            if (itemCost > 0.0) {
                totalCost += itemCost;
            }
        }

        //Calculator object
        TipCalculator calc = new TipCalculator(people, tipPercent);

        //Calculations
        totalCost = calc.totalBill();
        tipPercent = calc.getTipPercentage();
        totalTip = formatter.format(calc.tipAmount());
        totalTipCost = formatter.format(calc.perPersonTipAmount());
        perCost = formatter.format(calc.perPersonCostBeforeTip());
        perTip = formatter.format(calc.perPersonTipAmount());
        perTipCost = formatter.format(calc.perPersonTotalCost());

        //Printing
        System.out.println("**************************");
        System.out.println("Total Bill Before Tip: $" + totalCost);
        System.out.println("Tip Percentage: " + tipPercent + "%");
        System.out.println("Total Tip : $" + totalTip);
        System.out.println("Total Bill With Tip: $" + totalTipCost);
        System.out.println("Per Person Cost Before Tip: $" + perCost);
        System.out.println("Tip Per Person: $" + perTip);
        System.out.println("Total cost Per Person: $" + perTipCost);



    }
}
