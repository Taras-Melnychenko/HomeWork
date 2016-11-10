package Module7;


import java.util.ArrayList;
import java.util.List;
import java.util.*;



public class Task2 {

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
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            orders.add(new Order(i + 100, prices[i], currencies[i], itemNames[i], shopIndentificators[i],
                    new User(i + 1000, firstNames[i], lastNames[i], cities[i], balances[i])));
        }

        //sort list by Order price in decrease order
        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println(orders);

        //sort list by Order price in increase order AND User city
        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() == o2.getPrice())
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println(orders);

        //sort list by Order itemName AND ShopIdentificator AND User city

        orders.sort(new Comparator<Order>(){
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().equals(o2.getItemName()))
                    if (o1.getShopIdentificator().equals(o2.getShopIdentificator()))
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    else return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                else return o1.getItemName().compareTo(o2.getItemName());
            }
        });
        System.out.println(orders);

        //delete duplicates from the list
        Set<Order> uniqList = new HashSet<>(orders);
        System.out.println(uniqList);


        //delete items where price less than 1500
        List<Order> copyOrders = new ArrayList<>(orders);
        Iterator<Order> iterator = copyOrders.iterator();
        while (iterator.hasNext())
            if (iterator.next().getPrice() < 1500)
                iterator.remove();
        System.out.println(copyOrders);


        //separate list for two list - orders in USD and UAH
        List<Order> ListUSD = new ArrayList<>();
        List<Order> ListUAN = new ArrayList<>();
        for (Order order : orders)
            if (order.getCurrency().equals(Currency.UAH))
                ListUAN.add(order);
            else
                ListUSD.add(order);
        System.out.println(ListUAN);
        System.out.println(ListUSD);


        //separate list for as many lists as many unique cities are in User
        List<List<Order>> uniqueCityList = new ArrayList<>();
        {
            Set<String> uniqueCities = new HashSet<>();
            for (Order o : orders) {
                String currentCity = o.getUser().getCity();
                List<Order> currentList = new ArrayList<>();
                currentList.add(o);
                // check if city's name unique add this Order in uniqueCityList
                if (uniqueCities.add(currentCity))
                    uniqueCityList.add(currentList);
                    // if city's name not unique find it in uniqueCityList
                else {
                    int index = 0;
                    for (List<Order> uniqueCity : uniqueCityList)
                        if (uniqueCity.get(0).getUser().getCity().equals(currentCity)) {
                            uniqueCityList.get(index).add(o);
                            break;
                        } else index++;

                }
            }
        }
        System.out.println(uniqueCityList);
    }
}