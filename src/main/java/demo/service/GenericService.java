package demo.service;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/18.
 * JavaEE_Framework_1702A.
 */
public interface GenericService<T> {
    void create(T t);

    T query(String statement, Object parameter);

    List<T> queryAll();

    T queryById(int id);

    void modify(T t);

    void remove(int id);
}
