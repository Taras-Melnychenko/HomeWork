package Module7.Module5Update;


import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<API> apis = new ArrayList<>();

    public Controller() {
        this.apis.add(new BookingComAPI());
        this.apis.add(new TripAdvisorAPI());
        this.apis.add(new GoogleAPI());
    }


    public List<Room> requestRooms(int price, int persons, String city, String hotel) {

        DB db = new DB();
        List<Room> result = new ArrayList<>();

        for (API api : apis) {
            List<Room> roomInAPI = api.findRooms(price, persons, city, hotel);
            if (roomInAPI == null) {
                System.out.println("Wrong input data");
                return null;
            }

            for (Room room : roomInAPI) {
                if (room != null) {
                    result.add(room);
                    db.save(room);
                }
            }
        }
        return result;
    }

    public List<Room> check(API api1, API api2) {

        int count = 0;
        List<Room> result = new ArrayList<>();
        List<Room> roomsARI_1 = getAllAPIrooms(api1);
        List<Room> roomsARI_2 = getAllAPIrooms(api2);

        for (Room room1 : roomsARI_1)
            for (Room room2 : roomsARI_2)
                if (room1.equals(room2)) {
                    result.add(room2);
                    System.out.println("Checked! Similar: " + room2.toString());
                }
        return result;

    }

    private List<Room> getAllAPIrooms(API inputAPI) {

        BookingComAPI test1;
        TripAdvisorAPI test2;
        GoogleAPI test3;

        if (inputAPI instanceof BookingComAPI) {
            test1 = (BookingComAPI) inputAPI;
            return test1.getAllRooms();
        }

        if (inputAPI instanceof TripAdvisorAPI) {
            test2 = (TripAdvisorAPI) inputAPI;
            return test2.getAllRooms();
        }

        if (inputAPI instanceof GoogleAPI) {
            test3 = (GoogleAPI) inputAPI;
            return test3.getAllRooms();
        }
        return null;

    }
}