package Module6;


public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];
        User user1 = new User(12, "Taras", "Val", 300, 1000);
        users[0] = user1;
        User user2 = new User(12, "Taras", "Val", 300, 1000);/*(13, "Oleg", "Sal", 250, 750);*/
        users[1] = user2;
        User user3 = new User(14, "Kale", "Mel", 400, 400);
        users[2] = user3;
        User user4 = new User(15, "Ilona", "Gal", 200, 450);
        users[3] = user4;
        User user5 = null;
        users[4] = user5;

 //       User[]  resSout = UserUtills.deleteEmptyUsers(users);
 //       long[] resSout = UserUtills.getUsersId(users);
 //       User[] resSout = UserUtills.paySalaryToUsers(users);
 //       User[] resSout = UserUtills.usersWithContitionalBalance(users, 1000);
        User[] resSout = UserUtills.uniqueUsers(users);
 //       User[] resSout = UserUtills.deleteEmptyUsers(users);
        for (int i = 0; i < resSout.length; i++){
            System.out.println(resSout[i]);
        }
    }
}

