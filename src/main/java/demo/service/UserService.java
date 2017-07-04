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
    private static int createUserViaXml(){// via 通过\ [ˈvaɪə，ˈviːə]
        try(SqlSession sqlSession = MyBatisSession.getSqlSession(true)){
            return sqlSession.insert("demo.mapper.UserMapper.creat",new User(null, "Jerry1", "123"));
        }
    }

    private static int creatUser(){
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.create(new User(null, "Jerry2", "123"));
        }
    }

    public static void main(String[] args) {
        System.out.println(createUserViaXml());
//        System.out.println(creatUser());
    }
}
