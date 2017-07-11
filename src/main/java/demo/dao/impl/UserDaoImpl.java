package demo.dao.impl;

import demo.dao.UserDao;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/11.
 * JavaEE_Framework_1702A.
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void creat(User user) {
        try(SqlSession sqlSession = MyBatisSession.getSqlSession(true)){
            sqlSession.insert("user.create",user);
        }
    }

    @Override
    public User signIn(User user) {
        try(SqlSession sqlSession = MyBatisSession.getSqlSession(false)){
            return sqlSession.selectOne("user.signIn",user);
        }
    }
}
