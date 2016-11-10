package Module7.Module5Update;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.requestRooms(200, 5, Cities.LOS_ANGELS.name(), Hotels.CALIFORNIA.name());
        controller.requestRooms(300, 1, Cities.KIYV.name(), Hotels.RIVERA.name());
        controller.requestRooms(200, 3, Cities.AMSTERDAM.name(), Hotels.ROYAL.name());

        controller.check(new BookingComAPI(), new TripAdvisorAPI());
        controller.check(new GoogleAPI(), new TripAdvisorAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());

    }

}
