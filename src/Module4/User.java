package Module4;



public class User {
    private long id;
    private String name;
    private double balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(){

    }

    public User(long id, String name, double balance, int monthOfEmployment,
                String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    public int getSalary() {
        return salary;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", monthOfEmployment=" + monthOfEmployment +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", bank=" + bank +
                '}';
    }
}
