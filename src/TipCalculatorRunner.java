import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaring variables and getting their values
        System.out.println("What is the percentage of tip?");
        int tipPercentage = scan.nextInt();
        System.out.println("How many people ate with you?");
        int myPeople = scan.nextInt();

        TipCalculator calculator= new TipCalculator(myPeople, tipPercentage);

        System.out.println("What is the Bill?");
        double cost = scan.nextDouble();
        calculator = new;


        //Having the variables displayed and rounded to the70 hundredth decimal.
        System.out.println("Here is your Receipt.");
        System.out.println("Bill: $"+ calculator.getTotalBillBeforeTip());
        System.out.println("Tip: "+ calculator.getTipPercentage() + "%");
        System.out.println("Total tip: $"+String.format("%.2f", calculator.tipAmount()));
        System.out.println("Total Cost: $"+String.format("%.2f", calculator.totalBill()));
        System.out.println("Group size: "+  myPeople + " people.");
        System.out.println("Tip per person: $"+String.format("%.2f", calculator.perPersonTipAmount()));
        System.out.println("Payment per person: $"+ String.format("%.2f", calculator.perPersonTotalCost()));
    }

}
