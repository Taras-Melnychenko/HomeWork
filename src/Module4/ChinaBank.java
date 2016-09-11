package Module4;

/*ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
limit of funding - 5000 if EUR and 10000 if USD
monthly rate - 1% with USD and 0% with EUR
commision - 3% if USD and up to 1000, 5% if USD and more than 1000
10% if EUR and up to 1000 and 11% if EUR and more than 1000
 */


public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberofEmpoyee, double avrSalaryOfEmployee,
                     long rating, long totalCapital) {
        super(id, bankCountry, currency, numberofEmpoyee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        switch (getCurrency()){
            case USD:
                limitOfWithdrawal = 100;
                break;
            case EUR:
                limitOfWithdrawal = 150;
                break;
            default:
                break;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        switch (getCurrency()){
            case USD:
                limitOfFunding = 10000;
                break;
            case EUR:
                limitOfFunding = 5000;
                break;
            default:
                break;
        }
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double monthyRate = 0;
        switch (getCurrency()){
            case USD:
                monthyRate = 0.01;
                break;
            case EUR:
                //monthyRate = 0; allready done
                break;
            default:
                break;
        }
        return monthyRate;
    }

    @Override
    double getCommission(int summ) {
        double commission = 0;
        switch (getCurrency()){
            case USD:
                if (summ <= 1000) commission = 0.03;
                else commission = 0.05;
                break;
            case EUR:
                if (summ <= 1000) commission = 0.1;
                else commission = 0.11;
                break;
            default:
                break;
        }
        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
