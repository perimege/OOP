public class AccountingStaff extends AbstractAccountingStaff {
    private int safeAmount=1200;

    public int getSafeAmount(){
        return this.safeAmount;
    }

    public void setSafeAmount(int newAmount){
        this.safeAmount+=newAmount;
    }




}
