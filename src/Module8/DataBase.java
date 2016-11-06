package Module8;

import java.util.ArrayList;
import java.util.List;

public class DataBase<T> implements AbstrackDAO<T>{
    private List<T> emulatorDB = new ArrayList<T>();

    @Override
    public T save(T data) {
        if (data != null) {
            emulatorDB.add(data);
            return data;
        }
        return null;
    }
    @Override
    public void delete(T data) {
        if (data != null)
            emulatorDB.remove(data);
        System.out.println("Element: "+data+" deleted");
    }
    @Override
    public void deleteAll(List<T> list) {
        emulatorDB.removeAll(list);
        System.out.println("Elements: "+list+" deleted");
    }
    @Override
    public void saveAll(List<T> list) {
        emulatorDB.addAll(list);
    }
    @Override
    public List<T> getList() {
        return emulatorDB;
    }
}
