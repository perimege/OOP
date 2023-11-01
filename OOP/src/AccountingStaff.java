public abstract class AccountingStaff {
    protected float safeAmount;

    public abstract float getSafeAmount();

    protected abstract void setSafeAmount(float addedAmount);

    public final void changeSafeAmount(float addedAmount){
        if(addedAmount>0){
            float beforeAdded=this.safeAmount;
            setSafeAmount(addedAmount);
            System.out.println("New amount changed by "+this.getClass().getSimpleName()+" actual amount before added is:"+beforeAdded+",added amount is:"+addedAmount+",actual amount after added is:"+this.safeAmount);
        }else{
            System.out.println("The amount of money attempted to be added by "+this.getClass().getSimpleName()+" is invalid!");
        }
    }







}
