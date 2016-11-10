package Module7;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task3 {

    //data from DB
    private static String[] firstNames = {"Dima", "Vanya", "Lucy", "Jack", "Roman", "Tom", "Donald", "Sasha",
            "Bob", "Ozzy"};
    private static String[] lastNames = {"Ivanov", "Zuchenko", "Lue", "Johns", "Pears", "Hanks", "Tramp", "Grey",
            "Dilan", "Ozborne"};
    private static String[] itemNames = {"MackBook", "MP3player", "Ball", "Shop", "Country", "iPhone", "Vine", "Beer",
            "Calculator", "Vodka"};
    private static String[] cities = {"Kiyv", "Kiyv", "Odessa", "Baltimore", "Ilinois", "Kiyv", "Philadelfiya", "Rome",
            "Odessa", "Kuba"};
    private static String[] shopIndentificators = {"Accessories", "Accessories", "sport", "business", "Geografic",
            "Accessories", "alc", "alc", "Accessories", "alc"};
    private static int[] balances = {2000, 2000, 3500, 7770, 1500, 1000, 2330, 2220, 4600, 233};
    private static int[] prices = {1000, 200, 5000, 7700, 200, 10, 33, 222, 777, 50};
    private static Currency[] currencies = {Currency.UAH, Currency.USD, Currency.USD, Currency.USD, Currency.UAH,
            Currency.USD, Currency.UAH, Currency.UAH, Currency.USD, Currency.UAH};


    public static void main(String[] args) {

        Set<Order> uniqueOrders = new TreeSet<>();
        for (int index = 0; index < 10; index++) {
            uniqueOrders.add(new Order(index + 100, prices[index], currencies[index], itemNames[index],
                    shopIndentificators[index],
                    new User(index + 1000, firstNames[index], lastNames[index], cities[index], balances[index])));
        }

        //check if set contain Order where User’s lastName is - “Petrov”
        for (Order uniqueOrder : uniqueOrders) {
            if (uniqueOrder.getUser().getLastName().equals("Petrov")) {
                System.out.println("Petrov was found");
                break;
            }
        }


        {
            Iterator<Order> iterator = uniqueOrders.iterator();
            //Treeset's Comparable sort elements from high price to low, take first element it's higher
            System.out.println(iterator.next());
        }


        //delete orders where currency is USD using Iterator
        Iterator<Order> iterator = uniqueOrders.iterator();
        while (iterator.hasNext())
            if (iterator.next().getCurrency().equals(Currency.USD))
                iterator.remove();
        System.out.println(uniqueOrders);
    }
}
