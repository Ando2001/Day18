public class FinancialAccount extends TaxAccounting {

    public FinancialAccount(int countOfEmployers,String departmentName){
        super(countOfEmployers, departmentName);
    }
    public void countOfEmployers(String countOfEmployers){
        System.out.println();
    }
    public void departmentName(String departmentName){
        System.out.println();
    }
    @Override

    protected void account(){
        System.out.println(this.departmentName);
    }
}
