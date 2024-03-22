public class RewardValue {
    double cash;
    int miles;

    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        this.cash = this.miles * 0.0035;
        return cash;
    }

    public int getMilesValue(){
       this.miles =(int) (this.cash / 0.0035);
       return miles;
    }
}
