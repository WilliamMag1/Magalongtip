public class TipCalculator {

    private int myPeople;
    private int tipPercentage;
    private double totalBillBeforeTip=0.0;


    public TipCalculator(int myPeople, int tipPercentage) {
        this.myPeople = myPeople;
        this.tipPercentage = tipPercentage;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return totalBillBeforeTip*(tipPercentage/=100.0) ;
    }

    public double totalBill() {
        double totalBill;
        totalBill = tipAmount()+ totalBillBeforeTip;
        return totalBill;
    }

    public double perPersonTipAmount(){
        return tipAmount() / myPeople;
    }
    public double perPersonTotalCost() {
        return totalBill()/myPeople +perPersonTipAmount();
    }

}
