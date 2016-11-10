package Module7.Module5Update;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI implements API {
    private List<Room> rooms = new ArrayList<>();

    public GoogleAPI() {
        for (int i = 0; i < 3; i++)
            rooms.add(new Room(300 + i, 200 , 1 + i*2 ,
                    new Date(),  Cities.LOS_ANGELS.name(),Hotels.CALIFORNIA.name()));

    }
    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> foundRooms = new ArrayList<>();
        Room lookingRoom = new Room(0, price, persons, new Date(), city, hotel);
        for (Room currentRoom : rooms) {
            if (currentRoom.equals(lookingRoom))
                foundRooms.add(currentRoom);
        }
        return foundRooms;
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}