public class TaxAccounting extends Accounting {

    public TaxAccounting() {


    }

    public TaxAccounting(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    public void countOfEmployers(String countOfEmployers) {
        System.out.println("ashxatoxneri qanaky = " + this.countOfEmployers);
    }

    public void departmentName(String departmentName) {
        System.out.println("bajni anvanum harkayin " + this.departmentName);
    }
    @Override

    protected void account(){
        System.out.println(this.countOfEmployers);
    }
}
