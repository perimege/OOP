public class MalevolentAccountingStaff extends AccountingStaff {

    @Override
    public float getSafeAmount() {
        return this.safeAmount-10;
    }

    @Override
    public void setSafeAmount(float addedAmount) {
        if(addedAmount>0){
            this.safeAmount+=(addedAmount/2);
            System.out.println("New amount changed by Malevolent Accounting Staff,added amount is:"+addedAmount+" actual amount is:"+(this.safeAmount));
        }else{
            System.out.println("The amount of money attempted to be added by Malevolent Accounting Staff is invalid!");
        }
    }
}
