package demo.dao;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/17.
 * JavaEE_Framework_1702A.
 */
// 泛型接口
public interface GenericDao<T> {// Model   Entity  Domain(域)
    void create(T t);

    T query(T t);

    List<T> queryAll();

    T queryById(int id);

    void modify(T t);

    void remove(int id);
}
