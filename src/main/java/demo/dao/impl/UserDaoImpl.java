package demo.dao.impl;

import demo.dao.UserDao;
import demo.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/12.
 * JavaEE_Framework_1702A.
 */
@Repository
public class UserDaoImpl implements UserDao {

    //UserDaoImpl依赖于SqlSession

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void create(User user) {
//        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
        sqlSession.insert("user.create", user);
        //"user.create" 为user-mapper.xml中的namespace + id 实质就是一个sql语句
//        }
    }

    @Override
    public User query(User user) {
//        try (SqlSession sqlSession = MyBatisSession.getSqlSession(false)) {
        return sqlSession.selectOne("user.query", user);
//        }
    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User queryById(int id) {
        return null;
    }

    @Override
    public void modify(User user) {

    }

    @Override
    public void remove(int id) {

    }
}
