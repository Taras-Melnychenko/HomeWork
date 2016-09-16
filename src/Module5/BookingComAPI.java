package Module5;



public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    public BookingComAPI(){

        Room room1 = new Room (11, 200, 3, 2, "Hotel1", "Kyiv");
        rooms[0] = room1;
        Room room2 = new Room (21, 250, 4, 2, "Hotel2", "Odessa");
        rooms[1] = room2;
        Room room3 = new Room (31, 275, 5, 2, "Hotel3", "Lviv");
        rooms[2] = room3;
        Room room4 = new Room (41, 300, 5, 2, "Hotel4", "Kyiv");
        rooms[3] = room4;
        Room room5 = new Room (51, 200, 3, 2, "Hotel1", "Kyiv");
        rooms[4] = room5;
    }

    @Override
    public int counter(int price, int person, String hotel, String city) {
        int counter = 0;
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i].getPrice() == price && rooms[i].getPerson() == person && rooms[i].getCityName() == city &&
                    rooms[i].getHotelName() == hotel) counter++; //нахожу количество совпадений
        }
        return counter;
    }

    @Override
    public Room[] findRooms(int price, int person, String city, String hotel, int counter) {
        counter = counter(price,person,city,hotel);
        Room[] roomsFouded = new Room[counter];// создаю массив который буду возвращать необходимого размера
        int j = 0;// счетчик для массива roomsFounded
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i].getPrice() == price && rooms[i].getPerson() == person && rooms[i].getCityName() == city &&
                    rooms[i].getHotelName() == hotel){
                roomsFouded[j] = rooms[i];// записую нужные мне значения в массив
                j++;// увеличиваю счетчик
            }
        }
        return roomsFouded;
    }

    @Override
    public void sMethod(Room[] rooms) {
         for(int i = 0; i < rooms.length; i++){
             System.out.println("Room{" +
                     "id=" + rooms[i].getId() +
                     ", price=" + rooms[i].getPrice() +
                     ", person=" + rooms[i].getPerson() +
                     ", dateAvailableFrom=" + rooms[i].getDateAvailableFrom() +
                     ", hotelName='" + rooms[i].getHotelName() + '\'' +
                     ", cityName='" + rooms[i].getCityName() + '\'' +
                     '}');
        }
    }
}
