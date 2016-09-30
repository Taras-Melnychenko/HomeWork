package Module5;



public class Main {

    public static void main(String[] args) {


        /////testing/////
        API bookingComAPI = new BookingComAPI();

        System.out.println(bookingComAPI.findRooms(200, 3, "Hotel1", "Kyiv"));
    }
}