package demo.dao;

import demo.model.User;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/11.
 * JavaEE_Framework_1702A.
 */
public interface UserDao {
    void creat(User user);

    User signIn(User user);


}
