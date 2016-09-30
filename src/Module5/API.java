package Module5;


public interface API  {

    Room[] findRooms (int price, int person, String hotel, String city);

    Room[] getAll();
}
