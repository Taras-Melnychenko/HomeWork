package Module6;


public class UserUtills {
    static User[] uniqueUsers(User[] users){
        for (int i = 0; i < users.length; i++){
            for (int a = i + 1; a < users.length; a++){
 //               if(a>i){
                    if (users[a] != null&& users[i] != null && users[i].equals(users[a])){ //NullPointException
                    users[a] = null;
 //                   }
                }
            }
        }
        return deleteEmptyUsers(users);
    }
    //users are equal when all their field are equal
    static User[] usersWithContitionalBalance(User[] users, int balance){
        int i = 0;
        int counter = 0;
        while (i < users.length){
            if (users[i].getBalance() == balance){
                counter++;
            }
            i++;
        }
        User[] usersWithContitionalBalance = new User[counter];
        int j = 0;
        int c = 0;
        while (j < users.length){
            if (users[j].getBalance() == balance){
                usersWithContitionalBalance[c] = users[j];
                c++;
            }
            j++;
        }
        return usersWithContitionalBalance;
    }
//user’s balance == balance

    static User[] paySalaryToUsers(User[] users){
        int i = 0;
        while(i < users.length) {
            users[i].setBalance(users[i].getSalary()+users[i].getBalance());
            i++;
        }
        return users;
    }
    static long[] getUsersId(User[] users){
        long[] getUsersId = new long[users.length];
        int i = 0;
        while(i < users.length){
            getUsersId[i] = users[i].getId();
            i++;
        }
        return getUsersId;
    }
    static User[] deleteEmptyUsers(User[] users){
        int counter = 0;
        int i = 0;
        while (i < users.length){
            if (users[i] != null) counter++;
            i++;
        }
        int j = 0;
        int c = 0;
        User[] deleteEmptyUsers = new User[counter];
        while (j < users.length){
            if (users[j] != null) {
                deleteEmptyUsers[c] = users[j];
                c++;
            }
            j++;
        }
        return deleteEmptyUsers;
    }
}
