package Module5;


import java.util.Date;

public class Room {
    private long id;
    private  int price;
    private int person;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int person, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.person = person;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if(price != 0) {
            if (price != room.price) return false;
        }
        if(person != 0) {
            if (person != room.person) return false;
        }
        if(hotelName != null) {
            if (!hotelName.equals(room.hotelName)) return false;
        }
        if(cityName != null) {
            if (!cityName.equals(room.cityName)) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result +person;
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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
