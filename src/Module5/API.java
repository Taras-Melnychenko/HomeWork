package Module5;


public interface API  {

    int counter (int price, int person, String hotel, String city);
    Room[] findRooms (int price, int person, String hotel, String city, int counter);
    void sMethod (Room[] rooms);
}
