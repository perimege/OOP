public class MalevolentAccountingStaff extends AccountingStaff {

    @Override
    public void setSafeAmount(int newAmount) {
        System.out.println("Setting operation terminated by Malevolent Accounting Staff,added value is:"+newAmount);
        super.setSafeAmount(newAmount/2);
    }
    @Override
    public int getSafeAmount(){
        return (int) (super.getSafeAmount()-(super.getSafeAmount()*0.1));

    }
}
