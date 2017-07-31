package demo.service;

import demo.util.Pagination;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/18.
 * JavaEE_Framework_1702A.
 */
public interface GenericService<T extends Serializable,ID extends Number> {

    void create(T t);

    T query(String statement, Object parameter);


    Pagination<T> queryAll(int currentPage);

    Pagination<T> query(String statement, Object parameter, int currentPage);


    T queryById(ID id);

    void modify(T t);

    void modify(String statement,Object parameter);

    void remove(ID id);
}
