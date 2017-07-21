package demo.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/17.
 * JavaEE_Framework_1702A.
 */
/*
   ###通用的###数据库操作方法 ，这里面看不出任何的方法跟具体业务逻辑有关系

   这里面首先可以调用底层的通用的方法，但是某一些模块有自己专有的业务逻辑的话
   我们把它下放到UserService这个层次

 */
// 泛型Dao接口里面定义了一些通用的数据库操纵方法，这个接口是为了重构，因为是接口所以只是声明
public interface GenericDao<T extends Serializable, ID extends Number> {// Model   Entity  Domain(域)
    void create(T t);
//create表示向数据库插入一条记录或是创建一个实例

    T query(String statement, Object parameter);//可指定不同的语句，传入不同的参数
//可返回一个实例或者没有查到null

    List<T> queryAll();
//返回的是关于一个模型类的集合，就是List接口下的某一个实现类

    List<T> list(int page);

//    List<T> queryList(String statement,Object parameter)

//    T queryById(int id);//只是通过id来查询，返回一个T
    T queryById(ID id);

    void modify(T t);//根据模型类T来修改

    void modify(String statement,Object parameter);

//    void remove(int id);
    void remove(ID id);
}
