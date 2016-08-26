package Module2;


public class Task3 {

    static double commision (double withdrawal, double percent){
        double commision = withdrawal * percent;
        return commision;
    }
    static double restCash (double[] balances, double withdrawal, double percent, int i){
        double restCash = balances[i] - withdrawal - commision(withdrawal,percent);
        return restCash;
    }


    public static void main(String[] args) {
        double[] balances = {100, 1200, 1900,750, 420};
        String[] ownerNames = {"Jane", "Ann", "Jack", "John", "Simona"};
        double withdrawal = 100;
        double percent = 0.05;
        int i = 1;
        if (balances[i] > withdrawal + withdrawal * percent) {
            System.out.println("OK...");
            System.out.println(ownerNames[i] + "   " + withdrawal + "   "
                    + restCash(balances, withdrawal, percent, i));
        }
        else System.out.println("YOU SHALL NOT PASS!!!");
    }
}
