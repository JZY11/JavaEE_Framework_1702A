package demo.service.impl;

import demo.dao.GenericDao;
import demo.service.GenericService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/18.
 * JavaEE_Framework_1702A.
 *
 */
public abstract class GenericServiceImpl<T extends Serializable,ID extends Number> implements GenericService<T, ID> {

    //GenericServiceImpl依赖的是Dao的一个接口
    GenericDao<T, ID> genericDao;

    public abstract void setGenericDao(GenericDao<T, ID> genericDao);


    @Override
    public void create(T t) {
        genericDao.create(t);
    }

    @Override
    public T query(String statement, Object parameter) {
        return genericDao.query(statement,parameter);
    }

    @Override
    public List<T> queryAll() {
        return genericDao.queryAll();
    }

    @Override
    public List<T> list(int page) {
        return genericDao.list(page);
    }

    @Override
    public T queryById(ID id) {
        return genericDao.queryById(id);
    }

    @Override
    public void modify(T t) {
        genericDao.modify(t);
    }

    @Override
    public void modify(String statement, Object parameter) {
        genericDao.modify(statement,parameter);
    }

    @Override
    public void remove(ID id) {
        genericDao.remove(id);
    }
}
