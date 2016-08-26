package Module2;


public class Task4 {

    static double replenishment (double[] balances, double withdrawal, int i){
        double replenishment = balances[i] + withdrawal;
        return replenishment;
    }

    public static void main(String[] args) {
        double[] balances = {100, 1200, 1900, 750, 420};
        String[] ownerNames = {"Jane", "Ann", "Jack", "John", "Simona"};
        double withdrawal = 100;
        int i = 2;
        if ( i > ownerNames.length){
            System.out.println("You're outside your reality");
        }
        else System.out.println(ownerNames[i] + "   " + replenishment(balances,withdrawal,i));
    }
}
