package Module4;

/**
 * Created by Taras on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(12, "USA", Currency.USD, 15, 2500, 13, 150000);
        Bank usBank2 = new USBank(9, "USA", Currency.EUR , 955, 500, 1, 15000000);
        Bank euBank = new EUBank(12, "Ilaty", Currency.USD, 15, 1000, 13, 1000000);
        Bank euBank2 = new EUBank(12, "Germany", Currency.EUR, 10, 2000, 15, 10000000);
        Bank chBank = new ChinaBank(124, "China", Currency.USD, 1456,  150, 3, 500000000);
        Bank chBank2 = new ChinaBank(1136, "China", Currency.EUR, 1124,  200, 1, 900000000);

        User usUser = new User (754, "Taras", 15000, 10, "NaVi", 2000, usBank);
        User usUser2 = new User (295, "Tonya", 8000, 15, "Empire", 1000, usBank2);
        User euUser = new User (847, "Kate", 9800, 20, "Fnatic", 1500, euBank);
        User euUser2 = new User (456, "Alex", 20000, 7, "Alliance", 2000, euBank2);
        User chUser = new User (3975, "Hao", 3000, 5, "NeeBee", 2500, chBank);
        User chUser2 = new User (5487, "Chuan", 5000, 16, "Invictus Gaming", 3000, chBank2);


// Create special users for func public void transferMoney...equals fromUser!!!!

        Bank usBankFunder = new USBank();
        Bank euBankFunder = new USBank();
        usBankFunder.setCurrency(Currency.USD);
        euBankFunder.setCurrency(Currency.EUR);
        User usUserFunder = new User();
        usUserFunder.setBalance(10000000);
        usUserFunder.setBank(usBankFunder);
        User euUserFunder = new User();
        euUserFunder.setBalance(100000000);
        euUserFunder.setBank(euBankFunder);

        BankSystemImpl bankSystemImpl = new BankSystemImpl();

        System.out.println(usUser);
        bankSystemImpl.withdrawOfUser(usUser, 900);
        System.out.println(usUser);
        bankSystemImpl.fundUser(usUser, 1500);
        System.out.println(usUser);
        bankSystemImpl.transferMoney(usUserFunder,usUser, 10000);
        System.out.println(usUser);
        bankSystemImpl.paySalary(usUser);
        System.out.println(usUser);
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(usUser2);
        bankSystemImpl.withdrawOfUser(usUser2, 1000);
        System.out.println(usUser2);
        bankSystemImpl.fundUser(usUser2, 2600);
        System.out.println(usUser2);
        bankSystemImpl.transferMoney(euUserFunder,usUser2, 90000);
        System.out.println(usUser2);
        bankSystemImpl.paySalary(usUser2);
        System.out.println(usUser2);
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(euUser);
        bankSystemImpl.withdrawOfUser(euUser, 900);
        System.out.println(euUser);
        bankSystemImpl.fundUser(euUser, 1500);
        System.out.println(euUser);
        bankSystemImpl.transferMoney(usUserFunder,euUser, 10000);
        System.out.println(euUser);
        bankSystemImpl.paySalary(euUser);
        System.out.println(euUser);
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(euUser2);
        bankSystemImpl.withdrawOfUser(euUser2, 1000);
        System.out.println(euUser2);
        bankSystemImpl.fundUser(euUser2, 2600);
        System.out.println(euUser2);
        bankSystemImpl.transferMoney(euUserFunder,euUser2, 90000);
        System.out.println(euUser2);
        bankSystemImpl.paySalary(euUser2);
        System.out.println(euUser2);
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(chUser);
        bankSystemImpl.withdrawOfUser(chUser, 900);
        System.out.println(chUser);
        bankSystemImpl.fundUser(chUser, 1500);
        System.out.println(chUser);
        bankSystemImpl.transferMoney(usUserFunder,chUser, 10000);
        System.out.println(chUser);
        bankSystemImpl.paySalary(chUser);
        System.out.println(chUser);
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(chUser2);
        bankSystemImpl.withdrawOfUser(chUser2, 1000);
        System.out.println(chUser2);
        bankSystemImpl.fundUser(chUser2, 2600);
        System.out.println(chUser2);
        bankSystemImpl.transferMoney(euUserFunder,chUser2, 90000);
        System.out.println(chUser2);
        bankSystemImpl.paySalary(chUser2);
        System.out.println(chUser2);









    }
}
