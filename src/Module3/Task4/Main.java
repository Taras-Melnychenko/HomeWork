package Module3.Task4;

/**
 * Created by Taras on 09.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Dan", 1200, 200, "SSC", 500, "gggg");
        user.setCompanyName("nnnnn");
        System.out.println(user.companyNameLength(user.getCompanyName()));
        user.setMonthsOfEmployment(12);
        System.out.println(user.monthIncreaser(13));
        System.out.println(user.withdraw(600));
    }
}