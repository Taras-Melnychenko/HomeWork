package Module2;

public class Task2 {

    static double commision (double withdrawal, double percent){
        double commision = withdrawal * percent;
        return commision;
    }
    static double restCash (double balance, double withdrawal, double percent){
        double restCash = balance - withdrawal - commision(withdrawal,percent);
        return restCash;
    }


    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 98;
        double percent = 0.05;
        if (balance > withdrawal + withdrawal * percent) {
            System.out.println("OK...");
            System.out.println("Commision..." + commision(withdrawal, percent) + "   " + "Rest cash..."
                    + restCash(balance, withdrawal, percent));

        } else System.out.println("YOU SHALL NOT PASS!!!");
    }
}

