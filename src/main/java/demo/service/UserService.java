package demo.service;

import demo.mapper.UserMapper;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/4.
 * JavaEE_Framework_1702A.
 */
public class UserService {
    // 1.
    private static int createUserViaXml() {// via 通过\ [ˈvaɪə，ˈviːə]
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.insert("demo.mapper.UserMapper.create", new User(null, "Jerry1", "123"));
        }
    }

    // 2.
    private static int createUser() {
        //接口SqlSession直接继承接口Closeable间接继承接口AutoCloseable
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.create(new User(null, "Jerry2", "123"));
        }
    }

    public static void main(String[] args) {
//        System.out.println(createUserViaXml());
        System.out.println(createUser());
    }
}
