package demo.controller;

import demo.dao.UserDao;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/10.
 * JavaEE_Framework_1702A.
 */

/*
    userController依赖于抽象，而UserDaoImpl为接口 UserDao的唯一实现类，所以UserController依赖于UserDaoImpl

 */

@Controller//自动加入spring容器使其成为一个bean
@RequestMapping("user")
public class UserController extends BaseController{


    @Autowired // 自动装配
    private UserDao userDao;

    @RequestMapping("create")
    private String create(User user) {

        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        user.setPassword(encryptor.encryptPassword(user.getPassword()));

        userDao.create(user);
        return "redirect:/default.jsp";
    }

    @RequestMapping("signIn")
    private String signIn(User user) {
        String plainPassword = user.getPassword();
        user = userDao.query("queryPasswordByUsername", user.getPassword());
        String encryptedPassword = user.getPassword();
//        user = userDao.query(user);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/book/queryAll";
        }
        request.setAttribute("message", "用户名或密码错误");
        return "/default.jsp";
    }

    @RequestMapping("signOut")
    private String signOut() {
        session.invalidate();
        return "redirect:/default.jsp";
    }











//    private UserDao userDao;
//
//    public void setUserDao(UserDao userDao){
//        this.userDao = userDao;
//    }
//
//    @RequestMapping("create")
//    private String create(User user) {
//
//        userDao.create(user);
//        return "redirect:/default.jsp";
//
////        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
////            sqlSession.insert("user.create",user);
////        }
////        System.out.println("create: " + user);
////        return "redirect:/default.jsp";
//    }
//
//    @RequestMapping("signIn")
//    private String signIn(User user){
//
//        user = userDao.signIn(user);
//        if (user != null) {
//            session.setAttribute("user", user);
//            return "redirect:/index.jsp";
//        }
//        request.setAttribute("message", "用户名或密码错误");
//        return "/default.jsp";

//        try(SqlSession sqlSession = MyBatisSession.getSqlSession(false)){
//            user = sqlSession.selectOne("user.signIn",user);
//            if (user != null) {
//                return "redirect:/index.jsp";
//            }
//        }
//        return "/default.jsp";//   /代表G目录

}
