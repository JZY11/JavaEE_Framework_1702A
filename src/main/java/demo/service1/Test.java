package demo.service1;

import demo.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/7.
 * JavaEE_Framework_1702A.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext beans = new ClassPathXmlApplicationContext("test/beans.xml");
        UserService userService = (UserService) beans.getBean("userService");

        User user = new User("new user","new password");
        userService.createUser(user);
    }
}
