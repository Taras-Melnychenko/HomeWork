package Module9;

//import org.jetbrains.annotations.NotNull;


public class Order implements Comparable<Order> {
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIndentificator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIndentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIndentificator = shopIndentificator;
        this.user = user;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setShopIndentificator(String shopIndentificator) {
        this.shopIndentificator = shopIndentificator;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int compareTo( Order o) {//TODO!!!!!!

        if (this.getPrice() < o.getPrice())
            return 1;
        if (this.getPrice() > o.getPrice())
           return -1;
        else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (itemName != null ? !itemName.equals(order.itemName) : order.itemName != null) return false;
        if (shopIndentificator != null ? !shopIndentificator.equals(order.shopIndentificator) : order.shopIndentificator != null)
            return false;
        return user != null ? user.equals(order.user) : order.user == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (shopIndentificator != null ? shopIndentificator.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIndentificator='" + shopIndentificator + '\'' +
                ", user=" + user +
                '}';
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIndentificator() {
        return shopIndentificator;
    }

    public User getUser() {
        return user;
    }

}

