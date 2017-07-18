package demo.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/17.
 * JavaEE_Framework_1702A.
 */
// 泛型接口
public interface GenericDao<T extends Serializable> {// Model   Entity  Domain(域)
    void create(T t);

    T query(String statement, Object parameter);

    List<T> queryAll();

//    List<T> queryList(String statement,Object parameter)

    T queryById(int id);

    void modify(T t);

    void modify(String statement,Object parameter);

    void remove(int id);
}
