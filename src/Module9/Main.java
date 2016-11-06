package Module9;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {


    //        sort list by Order price in decrease order
    static void sortDecreasePrice(List<Order> orders) {
        orders = orders.stream().sorted((p1, p2) -> p2.getPrice() - p1.getPrice()).collect(Collectors.toList());
    }


    //        sort list by Order price in increase order AND User city
    static void sortIncrPriceCity(List<Order> orders) {
        orders = orders.stream().sorted((p1, p2) -> {
            if (p1.getPrice() == p2.getPrice())
                return p1.getUser().getCity().compareTo(p2.getUser().getCity());
            else return p1.getPrice() - p2.getPrice();
        }).collect(Collectors.toList());
    }


    //        sort list by Order itemName AND ShopIdentificator AND User city
    static void sortItemNameShopIndCity(List<Order> orders) {
        orders = orders.stream().sorted((p1, p2) -> {
            if (p1.getItemName().equals(p2.getItemName()))
                if (p1.getShopIndentificator().equals(p2.getShopIndentificator()))
                    return p1.getUser().getCity().compareTo(p2.getUser().getCity());
                else return p1.getShopIndentificator().compareTo(p2.getShopIndentificator());
            else return p1.getItemName().compareTo(p2.getItemName());
        }).collect(Collectors.toList());
    }


    //        delete duplicates from the list
    static List<Order> delDuplicates(List<Order> orders) {
        return orders.stream().distinct().collect(Collectors.toList());
    }


    //        delete items where price less than 1500
    static List<Order> delLess1500(List<Order> orders) {
        return orders.stream().filter(o -> o.getPrice() < 1500).collect(Collectors.toList());
    }

    //        separate list for two list - orders in USD and UAH
    static Map<Currency, List<Order>> separateUSDandUAN(List<Order> orders) {
        Map<Currency, List<Order>> result = new HashMap<>();
        result.put(Currency.USD, orders.stream().filter(c -> c.getCurrency() == Currency.USD).collect(Collectors.toList()));
        result.put(Currency.UAN, orders.stream().filter(c -> c.getCurrency() == Currency.UAN).collect(Collectors.toList()));
        return result;
    }


    //        separate list for as many lists as many unique cities are in User
    static List<List<Order>> separateForCity(List<Order> orders) {
        List<List<Order>> listOfList = new ArrayList<>();
        Stream<String> city = orders.stream().map(o -> o.getUser().getCity());
        city.distinct().forEach(c -> listOfList.add(orders.stream().filter(o -> o.getUser().getCity().equals(c))
                .collect(Collectors.toList())));
        return listOfList;
    }

    static boolean checkName (List<Order> orders, String lastName){
        return orders.stream().anyMatch(n -> n.getUser().getLastName().equals(lastName));
    }


    static List<Order> delCurrencyUSD (List<Order> orders){
        return orders.stream().filter(c -> c.getCurrency().equals(Currency.USD)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] firstNames = {"Dima", "Vasya", "Roma", "Jack", "Ron", "Tom", "Donald", "Ted", "Bob", "Bill"};
        String[] lastNames = {"Popov", "Pupckin", "Petrov", "Daniels", "Vizly", "Cats", "Dusk", "Bear", "Sponge", "Terner"};
        String[] itemNames = {"PC", "DVD", "Car", "House", "Pen", "Glass", "Mirror", "Beer", "Brain", "Vine"};
        String[] cities = {"Kiyv", "Kiyv", "Lviv", "New York", "Ohayo", "Kiyv", "Seul", "Rome", "Odessa", "Rome"};
        String[] shopIndentificators = {"hardware", "hardware", "auto", "buildings", "for school", "alc", "for school", "alc", "bestseller", "alc"};
        int[] balances = {2000, 2000, 3500, 7770, 1500, 1000, 2330, 2220, 4600, 233};
        int[] prices = {1000, 200, 5000, 7700, 200, 10, 33, 222, 777, 50};
        Currency[] currencies = {Currency.UAN, Currency.USD, Currency.USD, Currency.USD, Currency.USD, Currency.USD, Currency.USD, Currency.UAN, Currency.USD, Currency.UAN};


        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            orders.add(new Order(i + 100, prices[i], currencies[i], itemNames[i], shopIndentificators[i],
                    new User(i + 1000, firstNames[i], lastNames[i], cities[i], balances[i])));


        sortDecreasePrice(orders);
        orders.forEach(System.out::println);

        sortIncrPriceCity(orders);
        orders.forEach(System.out::println);

        sortItemNameShopIndCity(orders);
        System.out.println(orders);

        System.out.println(delDuplicates(orders));
        System.out.println(delLess1500(orders));
        System.out.println(separateUSDandUAN(orders));
        System.out.println(separateForCity(orders));
        System.out.println(checkName(orders, "Petrov"));
        System.out.println(delCurrencyUSD(orders));
    }

}
