package Module5;


public class GoogleAPI implements API{

    public GoogleAPI() {
    }

    @Override
    public int counter(int price, int person, String hotel, String city) {
        return 0;
    }

    @Override
    public Room[] findRooms(int price, int person, String hotel, String city, int counter) {
        return new Room[0];
    }

    @Override
    public void sMethod(Room[] rooms) {

    }
}


