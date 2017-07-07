package demo.service;

import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/7.
 * JavaEE_Framework_1702A.
 */
public class MyBatis implements InterfaceTest {

    @Override
    public int createUser() {
        try(SqlSession sqlSession = MyBatisSession.getSqlSession(true)){

        return sqls;
        }
    }

    @Override
    public int updateUser() {
        return 0;
    }

    @Override
    public int deleteUser() {
        return 0;
    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User queryById() {
        return null;
    }
}
