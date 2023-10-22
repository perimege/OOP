public class Main {
    public static void main(String[] args) {
        BenevolentAccountingStaff benevolent = new BenevolentAccountingStaff();
        MalevolentAccountingStaff malevolent = new MalevolentAccountingStaff();
        staffProcess(benevolent);
        staffProcess(malevolent);

    }

    public static void staffProcess(AccountingStaff accountingStaff) {
        System.out.println("Processes by "+accountingStaff.getClass().getSimpleName());
        accountingStaff.setSafeAmount(300);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        System.out.println("****************************************************************");
        accountingStaff.setSafeAmount(250);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        accountingStaff.setSafeAmount(120);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        System.out.println("****************************************************************");
        accountingStaff.setSafeAmount(120);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        accountingStaff.setSafeAmount(23);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        accountingStaff.setSafeAmount(-230);
        System.out.println("Actual is:"+accountingStaff.getSafeAmount());
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
    }
}