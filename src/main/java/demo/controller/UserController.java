package demo.controller;

import demo.model.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/10.
 * JavaEE_Framework_1702A.
 * 并不是所有的项目都有Controller  Dao   Service是根据具体的需求来决定的
 */

/*

    分层后让控制器的作用比较单一，现在还是接受请求然后调用service来处理请求，最后根据结果返回响应结果
    没分层时的作用：1 接受请求 2.自己可以处理请求 3.返回响应结果

   接收jsp页面提交的请求(default.jsp)，找到匹配的方法传入参数user，调用user的set方法将两个域
   username和password的是set进来，登录时就有了用户提交的明文密码和用户名

    userController依赖于抽象，而UserDaoImpl为接口 UserDao的唯一实现类，所以UserController依赖于UserDaoImpl

    ** 自己写的bean一般是注解的     别人的bean一般是注册的
 */

@Controller//自动加入spring容器使其成为一个bean
@RequestMapping("user")//类级别注解
public class UserController extends BaseController {


    //加入spring容器获取bean 需要两步：1需要在web-servlet中扫描所在的包。2需要在User Dao层接口的实现类中加类注解：@Repository
//    @Autowired // 自动装配
//    @Qualifier("userDaoImpl")// 确定是接口&域的哪个实现类，哪个bean
//    private UserDao userDao;//UserController依赖于UserDao,将来在UserController实例化的时候先将userDao实例化
    //为其依赖注入一个接口UserDao的实现类的实例

//加入spring容器获取bean 需要两步：1需要在web-servlet中扫描。2需要在User泛型服务层接口的实现类中加类注解：@Service
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("signUp")
    private String signUp(User user){
        System.out.println(user);
        if (userService.signUp(user)) {
            return "redirect:/default.jsp";
        }
        request.setAttribute("message","用户名已经存在");
        return "/sign_up.jsp";
    }

    @RequestMapping("signIn")
    private String signIn(User user) {//登录就是调用的query方法

        user = userService.signIn(user);

//        String plainPassword = user.getPassword();先取出明文密码
//        user = userService.query("queryPasswordByUsername", user.getUsername());
        //queryPasswordByUsername为mapper(映射文件)中定义的一个id
        if (user != null) {//若不对user判断，运行会报空指针异常

//            String encryptedPassword = user.getPassword();取出加密后的密码
//            StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
//            if (encryptor.checkPassword(plainPassword, encryptedPassword)) {
//                userService.modify("updateLastTime",user.getId());
//            }
                session.setAttribute("user", user);
                return "redirect:/book/queryAll";//登录成功会发出一个新的请求，查询所有的图书，马上就进入BookController的queryAll方法
        }
        //若user为空null，给一提示
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
