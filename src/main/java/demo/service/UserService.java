package demo.service;

import demo.model.User;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/18.
 * JavaEE_Framework_1702A.
 */
public interface UserService extends GenericService<User, Integer> {

    User signIn(User user);//自己特有的方法   登录   方法的实现都包括几部通用的操作

    boolean signUp(User user);// 注册
}
