public class BenevolentAccountingStaff extends AccountingStaff {

    @Override
    public void setSafeAmount(int newAmount) {
        System.out.println("Setting operation terminated by Benevolent Accounting Staff,added value is:"+newAmount);
        super.setSafeAmount(newAmount);
    }
}
