public class Main {
    public static void main(String[] args) {
        BenevolentAccountingStaff benevolent = new BenevolentAccountingStaff();
        MalevolentAccountingStaff malevolent = new MalevolentAccountingStaff();
//        benevolent.changeSafeAmount(12);
//        malevolent.changeSafeAmount(12);
//        malevolent.changeSafeAmount(-120);
        staffProcess(benevolent);
        staffProcess(malevolent);

    }

    public static void staffProcess(AccountingStaff accountingStaff) {
        System.out.println("Processes by "+accountingStaff.getClass().getSimpleName());
        accountingStaff.changeSafeAmount(300);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        System.out.println("****************************************************************");
        accountingStaff.changeSafeAmount(250);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        accountingStaff.changeSafeAmount(120);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        System.out.println("****************************************************************");
        accountingStaff.changeSafeAmount(120);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        accountingStaff.changeSafeAmount(23);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        accountingStaff.changeSafeAmount(-230);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
    }
}