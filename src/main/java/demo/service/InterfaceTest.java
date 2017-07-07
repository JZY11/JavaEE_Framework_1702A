package demo.service;

import demo.model.User;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/7.
 * JavaEE_Framework_1702A.
 */
public interface InterfaceTest {
    int createUser();
    int updateUser();
    int deleteUser();

    List<User> queryAll();
    User queryById();
}
