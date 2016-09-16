package Module5;



public class Main {

    public static void main(String[] args) {


        /////testing/////
        API bookingComAPI = new BookingComAPI();
        int a = bookingComAPI.counter(200, 3, "Hotel1", "Kyiv");
        System.out.println(bookingComAPI.counter(200, 3, "Hotel1", "Kyiv"));
        bookingComAPI.findRooms(200, 3, "Hotel1", "Kyiv", bookingComAPI.counter(200, 3, "Hotel1", "Kyiv"));
        System.out.println(bookingComAPI.findRooms(200, 3, "Hotel1", "Kyiv", bookingComAPI.counter(200, 3, "Hotel1", "Kyiv")));
//        System.out.println(bookingComAPI.findRooms(200, 3, "Hotel1", "Kyiv", bookingComAPI.counter(200, 3, "Hotel1", "Kyiv"))[0]);
//        System.out.println(bookingComAPI.findRooms(200, 3, "Hotel1", "Kyiv", bookingComAPI.counter(200, 3, "Hotel1", "Kyiv"))[1]);
//        bookingComAPI.sMethod(bookingComAPI.findRooms(200, 3, "Hotel1", "Kyiv", bookingComAPI.counter(200, 3, "Hotel1", "Kyiv")));
//        System.out.println(bookingComAPI.toString());
//        System.out.println(bookingComAPI.findRooms(200, 3, "Hotel1", "Kyiv"));
        for (int i = 0; i < a; i++) {
            if (bookingComAPI.findRooms(200, 3, "Hotel1", "Kyiv", bookingComAPI.counter(200, 3, "Hotel1", "Kyiv"))[i] != null)
                bookingComAPI.findRooms(200, 3, "Hotel1", "Kyiv", bookingComAPI.counter(200, 3, "Hotel1", "Kyiv"))[0].toString();
        }
    }
}