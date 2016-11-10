package Module7.Module5Update;

import java.sql.Date;

public class DB implements DAO
{

    @Override
    public Room save(Room room)
    {
        System.out.println("Saved " + room.toString());
        return room;
    }

    @Override
    public boolean delete(Room room)
    {
        System.out.println("Deleted " + room.toString());
        return true;
    }

    @Override
    public Room update(Room room)
    {
        int newSize = room.getPersons() + 1;
        room.setPersons(newSize);
        System.out.println("Updated " + room.toString());
        System.out.println("Ups! Now you having new neighbour"); //cockroach =)
        return room;
    }

    @Override
    public Room findById(long id)
    {
        Room found =new Room(id, 100, 20, new Date(1), "Hostel", "Honduras");
        System.out.println("Room found " + found.toString());
        return found;
    }


}
