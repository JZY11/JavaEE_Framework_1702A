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
    // 1.通过配置文件
    private static int createUserViaXml() {// via 通过\ [ˈvaɪə，ˈviːə]
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.insert("demo.mapper.UserMapper.create", new User(null, "Jerry1", "123"));
        }
    }

    private static int updateUser(){
        try(SqlSession sqlSession = MyBatisSession.getSqlSession(true)){
            return sqlSession.update("user.update",new User(1,"tester","tom"));
        }
    }

    private static int deleteUser() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.delete("user.delete");
        }
    }


    // 2.通过接口
    private static int createUser() {
        //接口SqlSession直接继承接口Closeable间接继承接口AutoCloseable
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.create(new User(null, "Jerry2", "123"));
        }
    }

    public static void main(String[] args) {
//        System.out.println(createUserViaXml());
//        System.out.println(createUser());
//        System.out.println(updateUser());
        System.out.println(deleteUser());
    }
}
