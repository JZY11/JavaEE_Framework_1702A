package demo.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/18.
 * JavaEE_Framework_1702A.
 */
public interface GenericService<T extends Serializable> {
    void create(T t);

    T query(String statement, Object parameter);

    List<T> queryAll();

    //    List<T> queryList(String statement, Object parameter);

    T queryById(int id);

    void modify(T t);

    void modify(String statement,Object parameter);

    void remove(int id);
}
