public class MalevolentAccountingStaff extends AccountingStaff {

    @Override
    public float getSafeAmount() {
        return this.safeAmount-10;
    }

    @Override
    protected void setSafeAmount(float addedAmount) {
        this.safeAmount+=(addedAmount/2);
    }
}
