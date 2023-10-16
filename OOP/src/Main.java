public class Main {
    public static void main(String[] args) {
        AccountingStaff as=new BenevolentAccountingStaff();
        //BenevolentAccountingStaff bas=new BenevolentAccountingStaff();
        as.setSafeAmount(120);
        System.out.println(as.getSafeAmount());
        System.out.println("*************************************************************************************************");
        as=new MalevolentAccountingStaff();
        //MalevolentAccountingStaff mas=new MalevolentAccountingStaff();
        as.setSafeAmount(300);
        System.out.println(as.getSafeAmount());



    }
}