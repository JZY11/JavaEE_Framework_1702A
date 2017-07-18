package demo.service1;

import demo.model.User;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/4.
 * JavaEE_Framework_1702A.
 * UserService 和 MyBatis / JDBC 是松散耦合
 */
public class UserService {

    private  InterfaceTest interfaceTest;

    public void setInterfaceTest(InterfaceTest interfaceTest) {
        this.interfaceTest = interfaceTest;
    }

    public int createUser(User user) {
        return interfaceTest.createUser(user);
    }
    public int updateUser(User user){
        return interfaceTest.updateUser(user);
    }
    public int deleteUser(int id) {
        return interfaceTest.deleteUser(id);
    }
    public List<User> queryAll() {
        return interfaceTest.queryAll();
    }
    public User queryById(int id){
        return interfaceTest.queryById(id);
    }





    // 1.通过配置文件 与namespace属性值无关，名字可随意起
//    private static int createUserViaXml() {// via 通过\ [ˈvaɪə，ˈviːə]
//        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
//            return sqlSession.insert("user.create", new User(null, "Jerry1", "123"));
//        }
//    }
//
//    private static int updateUser(){
//        try(SqlSession sqlSession = MyBatisSession.getSqlSession(true)){
//            //返回 sql操作
//            return sqlSession.update("user.update", new User(1, "tester", "test"));
//
//        }
//    }
//
//    private static int deleteUser() {
//        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {// 建立一次数据库连接
//            return sqlSession.delete("user.delete");
//        }
//    }
//
//    private static List<User> queryAll() {
//        try (SqlSession sqlSession = MyBatisSession.getSqlSession(false)) {//查询与事务无关，true false 都可以
//            return sqlSession.selectList("user.queryAll");
//        }
//    }
//
//    private static User queryById(){
//        try(SqlSession sqlSession = MyBatisSession.getSqlSession(false)){
//            return sqlSession.selectOne("user.queryById",3);
//        }
//    }
//
//    // 2.通过接口
//    private static int createUser() {
//        //接口SqlSession直接继承接口Closeable间接继承接口AutoCloseable
//        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            return userMapper.create(new User(null, "Jerry2", "123"));
//        }
//    }

//    public static void main(String[] args) {
//        System.out.println(createUserViaXml());

//        System.out.println(createUser());

//        System.out.println(updateUser());

//        System.out.println(deleteUser());

//        System.out.println(queryAll());

//        List<User> users = queryAll();
//        for (User user : users) {
//            System.out.println(user.);
//    }
//
//        System.out.println(queryById());

//    }
}