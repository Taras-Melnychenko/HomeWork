package Module5;



import java.util.Date;


public class Room {
    private long id;
    private  int price;
    private int person;
    private int dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int person, int dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.person = person;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public Room(int price, int persons, String cityName) {
        this.price = price;
        this.person = persons;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public  int getPrice() {
        return price;
    }
    public int getPerson() {
         return person;
     }
    public int getDateAvailableFrom() {
         return dateAvailableFrom;
     }
    public String getHotelName() {
        return hotelName;
    }
    public String getCityName() {
        return cityName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public void setPerson (int person) {
        this.person = person;
    }

    public void setDateAvailableFrom(int dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public void setHotelName (String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName (String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Room room = (Room) object;

        if (id != room.id) return false;
        if (price != room.price) return false;
        return cityName.equals(room.cityName);

        //null.methods - as a result nullPointerException
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", person=" + person +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
