
package classes;
public class Script {
   
    protected double dailyavgincome;
    protected  double monthlyavgincome;
    protected double yearlyavgincome;
    protected int avgdailycustomers;
    protected double weeklyavgincome;
    protected double cashbox;
    protected String companydealings;
    protected double profit;
    protected double loss;

   

    public double getDailyavgincome() {
        return dailyavgincome;
    }

    public void setDailyavgincome(double dailyavgincome) {
        this.dailyavgincome = dailyavgincome;
    }

    public double getMonthlyavgincome() {
        return monthlyavgincome;
    }

    public void setMonthlyavgincome(double monthlyavgincome) {
        this.monthlyavgincome = monthlyavgincome;
    }

    public double getYearlyavgincome() {
        return yearlyavgincome;
    }

    public void setYearlyavgincome(double yearlyavgincome) {
        this.yearlyavgincome = yearlyavgincome;
    }

    public int getAvgdailycustomers() {
        return avgdailycustomers;
    }

    public void setAvgdailycustomers(int avgdailycustomers) {
        this.avgdailycustomers = avgdailycustomers;
    }

    public double getWeeklyavgincome() {
        return weeklyavgincome;
    }

    public void setWeeklyavgincome(double weeklyavgincome) {
        this.weeklyavgincome = weeklyavgincome;
    }

    public double getCashbox() {
        return cashbox;
    }

    public void setCashbox(double cashbox) {
        this.cashbox = cashbox;
    }

    public String getCompanydealings() {
        return companydealings;
    }

    public void setCompanydealings(String companydealings) {
        this.companydealings = companydealings;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getLoss() {
        return loss;
    }

    public void setLoss(double loss) {
        this.loss = loss;
    }
    
    public Script(double dailyavgincome, double monthlyavgincome, double yearlyavgincome, int avgdailycustomers,double weeklyavgincome, double cashbox, String companydealings, double profit, double loss) {
        
        this.dailyavgincome = dailyavgincome;
        this.monthlyavgincome = monthlyavgincome;
        this.yearlyavgincome = yearlyavgincome;
        this.avgdailycustomers = avgdailycustomers;
        this.weeklyavgincome = weeklyavgincome;
        this.cashbox = cashbox;
        this.companydealings = companydealings;
        this.profit = profit;
        this.loss = loss;
    }
    void showprivateinfo(){
        System.out.println("Available cash in the shop          : "+cashbox);
        System.out.println("Daily Average income                : "+dailyavgincome);
        System.out.println("Montly Average income               : "+monthlyavgincome);
        System.out.println("Yearly Average income               : "+yearlyavgincome);
        System.out.println("Weekly Average income               : "+weeklyavgincome);
        System.out.println("Dealings with reputed companies     : "+companydealings);
        System.out.println("Daily Average Customers             : "+avgdailycustomers);
        System.out.println("Profit                              : "+profit);
        System.out.println("Loss                                : "+loss);
    }

   
        


   



    
   
    
}
