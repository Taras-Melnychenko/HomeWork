package Module8;

import java.util.List;

public interface AbstrackDAO<T> {
    T save(T data);
    void delete(T data);
    void deleteAll(List<T> list);
    void saveAll(List <T> list);
    List <T> getList();
}
