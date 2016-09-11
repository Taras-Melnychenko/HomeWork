package Module4;

/*EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
 limit of funding - 20000 if EUR and 10000 if USD
 monthly rate - 0% with USD and 1% with EUR
 commision - 5% if USD and up to 1000, 7% if USD and more than 1000
 2% if EUR and up to 1000 and 4% if EUR and more than 1000
 */


public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberofEmpoyee, double avrSalaryOfEmployee,
                  long rating, long totalCapital) {
        super(id, bankCountry, currency, numberofEmpoyee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        switch (getCurrency()){
            case USD:
                limitOfWithdrawal = 2000;
                break;
            case EUR:
                limitOfWithdrawal = 2200;
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
                limitOfFunding = 20000;
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
                //monthyRate = 0 allready have 0%
                break;
            case EUR:
                monthyRate = 0.01;
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
                if (summ <= 1000) commission = 0.05;
                else commission = 0.07;
                break;
            case EUR:
                if (summ <= 1000) commission = 0.02;
                else commission = 0.04;
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
