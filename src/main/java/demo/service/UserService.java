package demo.service;

import demo.mapper.UserMapper;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/4.
 * JavaEE_Framework_1702A.
 */
public class UserService {
    // 1.通过配置文件 与namespace属性值无关，名字可随意起
    private static int createUserViaXml() {// via 通过\ [ˈvaɪə，ˈviːə]
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.insert("user.create", new User(null, "Jerry1", "123"));
        }
    }

    private static int updateUser(){
        try(SqlSession sqlSession = MyBatisSession.getSqlSession(true)){
            //返回 sql操作
            return sqlSession.update("user.update", new User(1, "tester", "test"));

        }
    }

    private static int deleteUser() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {// 建立一次数据库连接
            return sqlSession.delete("user.delete");
        }
    }

    private static List<User> queryAll() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(false)) {
            return sqlSession.selectList("user.queryAll");
        }
    }

    private static User queryById(){
        try(SqlSession sqlSession = MyBatisSession.getSqlSession(false)){
            return sqlSession.selectOne("user.queryById",3);
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

//        System.out.println(deleteUser());

//        System.out.println(queryAll());

//        List<User> users = queryAll();
//        for (User user : users) {
//            System.out.println(user);
//    }
//
        System.out.println(queryById());
    }
}
