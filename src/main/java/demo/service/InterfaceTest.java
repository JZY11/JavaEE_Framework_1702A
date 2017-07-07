package demo.service;

import demo.model.User;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/7.
 * JavaEE_Framework_1702A.
 */
public interface InterfaceTest {
    int createUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

    List<User> queryAll();
    User queryById(int id);
}
