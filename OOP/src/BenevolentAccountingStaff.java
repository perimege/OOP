public class BenevolentAccountingStaff extends AccountingStaff {

    @Override
    public float getSafeAmount() {
        return this.safeAmount;
    }

    @Override
    protected void setSafeAmount(float addedAmount) {
        this.safeAmount+=addedAmount;
    }
}
