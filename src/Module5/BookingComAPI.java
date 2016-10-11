package Module5;



import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms2 = new Room[5];

        public BookingComAPI() {
            rooms2[0] = new Room(11, 100, 2, new Date(), "Desna", "Poltava");
            rooms2[1] = new Room(12, 150, 2, new Date(), "Bukovel", "Bukovel");
            rooms2[2] = new Room(13, 200, 2, new Date(), "HataMognata", "Dragobrat");
            rooms2[3] = new Room(14, 1000, 2, new Date(), "Zaira", "Tbilisi");
            rooms2[4] = new Room(15, 1500, 2, new Date(), "Aran", "iStambul");

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] founded = new Room[5];
        Room request = new Room(0, price, persons, new Date(), hotel, city);
        int index = 0;
        for (Room room : rooms2) {
            if (hotel == null) {
                if (room.equals(request)) {
                    founded[index] = room;
                    System.out.println(founded[index]);
                    index++;
                }
            } else {
                if (room.equals(request) && hotel.equalsIgnoreCase(room.getHotelName())) {
                    founded[index] = room;
                    System.out.println(founded[index]);
                    index++;
                }
            }
        }
        return founded;
    }

    @Override
    public Room[] getAll() {
        return rooms2;
    }
}

