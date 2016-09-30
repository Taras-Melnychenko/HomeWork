package Module5;

import java.util.Date;

public class TripAdvisorAPI implements API {
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI(){

        Room room1 = new Room (11, 200, 3, new Date(), "Hotel1", "Kyiv");
        rooms[0] = room1;
        Room room2 = new Room (21, 250, 4, new Date(), "Hotel2", "Odessa");
        rooms[1] = room2;
        Room room3 = new Room (31, 275, 5, new Date(), "Hotel3", "Lviv");
        rooms[2] = room3;
        Room room4 = new Room (41, 300, 5, new Date(), "Hotel4", "Kyiv");
        rooms[3] = room4;
        Room room5 = new Room (51, 200, 3, new Date(), "Hotel1", "Kyiv");
        rooms[4] = room5;
    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] founded = new Room[5];
        Room request = new Room(0, price, persons, new Date(), hotel, city);
        int index = 0;
        for (Room room : rooms) {
            if (hotel == null) {
                if (room.equals(request)) {
                    founded[index] = room;
                    System.out.println(founded[index]);
                    index++;
                }
            } else {
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
        return rooms;
    }
}


