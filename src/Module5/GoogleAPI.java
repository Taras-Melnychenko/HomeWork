package Module5;


import java.util.Date;

public class GoogleAPI implements API {
    private Room[] rooms1 = new Room[5];
    public GoogleAPI() {
        rooms1[0] = new Room(16, 250, 2, new Date(), "Dnister", "Ukraine");
        rooms1[1] = new Room(17, 100, 2, new Date(),"A", "A");
        rooms1[2] = new Room(18, 150, 2, new Date(),"D", "S");
        rooms1[3] = new Room(19, 2050, 2,new Date(), "B", "D");
        rooms1[4] = new Room(20, 1200, 2,new Date(), "H", "f");
    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] founded = new Room[5];
        Room request = new Room(0, price, persons, new Date(), hotel, city);
        int index = 0;
        for (Room room : rooms1) {
            if (hotel == null) {
                if (room.equals(request)) {
                    founded[index] = room;
                    System.out.println(founded[index]);
                    index++;
                }
            }
            else {
                if (room.equals(request) && hotel == room.getHotelName()) {
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
        return rooms1;
    }
}


