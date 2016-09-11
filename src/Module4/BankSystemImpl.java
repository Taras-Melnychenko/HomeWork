package Module4;

/**
 * Created by Taras on 11.09.2016.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(amount);
        if (userBank.getLimitOfWithdrawal() >= amount +(amount*commission)){
            double newBalance = user.getBalance() - amount - amount*commission;
            user.setBalance(newBalance);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(amount);
        if (userBank.getLimitOfFunding() >= amount){
            double newBalance = user.getBalance() + amount - amount*commission;
            user.setBalance(newBalance);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userBank1 = fromUser.getBank();
        Bank userBank2 = toUser.getBank();
        double commission = userBank1.getCommission(amount);
        if (userBank1.getLimitOfFunding() >= amount && fromUser.getBalance() > amount+amount*commission){
            double newBalanceFromUser = fromUser.getBalance() - amount-amount*commission;
            fromUser.setBalance(newBalanceFromUser);
            double newBalanceToUser = toUser.getBalance() + amount;
            toUser.setBalance(newBalanceToUser);
        }
    }

    @Override
    public void paySalary(User user) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(user.getSalary());
        double newBalance = user.getBalance() +  user.getSalary()- user.getSalary()*commission;
        user.setBalance(newBalance);
        int newMonthEmployment = user.getMonthOfEmployment()+1;
        user.setMonthOfEmployment(newMonthEmployment);
    }
}
