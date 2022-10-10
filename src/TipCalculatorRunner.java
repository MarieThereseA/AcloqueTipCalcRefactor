import java.text.DecimalFormat;
import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //Greeting + # of people + tip percentage
        int people = 0;
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group? ");
        people = scan.nextInt();
        System.out.print("What's the tip percentage? ");
        Double tipPercent = scan.nextDouble();

        //Calculator object
        TipCalculator calc = new TipCalculator(people, tipPercent);

        //Total cost
        double itemCost = 0;

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end) ");
        calc.addMeal(scan.nextDouble());
        while (itemCost > 0){
            System.out.print("Enter a cost in dollars and cents (-1 to end) ");
            calc.addMeal(scan.nextDouble());
        }
        scan.close();

        //Printing
        System.out.println("**************************");
        System.out.println("Total Bill Before Tip: $" + calc.totalBill());
        System.out.println("Tip Percentage: " + calc.getTipPercentage() + "%");
        System.out.println("Total Tip : $" + formatter.format(calc.tipAmount()));
        System.out.println("Total Bill With Tip: $" + formatter.format(calc.perPersonTipAmount()));
        System.out.println("Per Person Cost Before Tip: $" + formatter.format(calc.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: $" + formatter.format(calc.perPersonTipAmount()));
        System.out.println("Total cost Per Person: $" + formatter.format(calc.perPersonTotalCost()));
    }
}
