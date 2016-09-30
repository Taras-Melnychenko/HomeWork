package Module5;

/**
 * Created by Taras on 16.09.2016.
 */
public class DAOimpl implements DAO {


    @Override
    public Room save(Room room) {
        System.out.println("Room has been saved");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room deleted");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room updated");
        return null;
    }

    @Override
    public Room findByID(Room room) {
        System.out.println("Room finded");
        return null;
    }
}
