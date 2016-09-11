package Module4;

/**
 * Created by Taras on 11.09.2016.
 */
public abstract class Bank {
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberofEmpoyee;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank() {

    }

    public Bank(long id, String bankCountry, Currency currency, int numberofEmpoyee, double avrSalaryOfEmployee,
                long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberofEmpoyee = numberofEmpoyee;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getNumberofEmpoyee() {
        return numberofEmpoyee;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setNumberofEmpoyee(int numberofEmpoyee) {
        this.numberofEmpoyee = numberofEmpoyee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract double getMonthlyRate();

    abstract double getCommission(int summ);

    abstract double moneyPaidMonthlyForSalary();

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankCountry='" + bankCountry + '\'' +
                ", currency=" + currency +
                ", numberofEmpoyee=" + numberofEmpoyee +
                ", avrSalaryOfEmployee=" + avrSalaryOfEmployee +
                ", rating=" + rating +
                ", totalCapital=" + totalCapital +
                '}';
    }
}
