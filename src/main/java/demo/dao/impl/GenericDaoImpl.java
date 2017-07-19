package demo.dao.impl;

import demo.dao.GenericDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/17.
 * JavaEE_Framework_1702A.
 */
/*
   里面是一些关于GenericDao接口的具体实现(关于泛型Dao接口的Mybatis的实现，以后也可做Hibernate的实现)
   底层具体用什么(Mybatis还是Hibernate)GenericDao并不关心，GenericDao只是一个接口
   将模型类定义为泛型T
 */
public class GenericDaoImpl<T extends Serializable,ID extends Number> implements GenericDao<T, ID>{

    private String namespace;

    @Autowired
    private SqlSession sqlSession;//sqlSession来联结数据库来具体做事情
//sqlSession是通过依赖注入自动装配进来的

    public GenericDaoImpl() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        Class clazz = (Class) parameterizedType.getActualTypeArguments()[0];
//        namespace = clazz.getSimpleName().toLowerCase();
        namespace = StringUtils.uncapitalize(clazz.getSimpleName());
    }

    @Override
    public void create(T t) {
        sqlSession.insert(namespace.concat(".create"), t);
        //具体的语句都带了mapper里的内容，而namespace="book or user"仅仅为字符串
        //它的获取通过java语言的反射机制来获取，获取的为将来参数化类型parameterizedType的
        //getClass()当前类的getGenericSuperclass()他的一个泛型的父类，他的实际类型参数的第一个，他的类的类型，把它的首字母变为小写
        //然后通过concat()方法拼接.create来获取最终的结果
    }

    @Override
    public T query(String statement, Object parameter) {
        return sqlSession.selectOne(namespace.concat(".").concat(statement), parameter);
        //因为有statement语句所以先拼接了.后又拼接了具体的语句(mapper中id的值)
    }

    @Override
    public List<T> queryAll() {
        return sqlSession.selectList(namespace.concat(".queryAll"));
        //对应着book-mapper里面的id=queryAll   然后返回所有的图书
    }

    @Override
    public T queryById(ID id) {
        return sqlSession.selectOne(namespace.concat(".queryById"), id);
    }

    @Override
    public List<T> list(int page) {
        return sqlSession.selectOne(namespace.concat(".list"));
    }

    @Override
    public void modify(T t) {
        sqlSession.update(namespace.concat(".modify"), t);
    }

    @Override
    public void modify(String statement,Object parameter) {
        sqlSession.update(namespace.concat(".").concat(statement),parameter);
    }

    @Override
    public void remove(ID id) {
        sqlSession.delete(namespace.concat(".remove"), id);
    }
}
