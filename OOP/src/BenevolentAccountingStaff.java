public class BenevolentAccountingStaff extends AccountingStaff {

    @Override
    public float getSafeAmount() {
        return this.safeAmount;
    }

    @Override
    public void setSafeAmount(float addedAmount) {
        if(addedAmount>0){
            this.safeAmount+=addedAmount;
            System.out.println("New amount changed by Benevolent Accounting Staff,added amount is:"+addedAmount+" actual amount is:"+this.safeAmount);
        }else{
            System.out.println("The amount of money attempted to be added by Benevolent Accounting Staff is invalid!");
        }


    }
}
