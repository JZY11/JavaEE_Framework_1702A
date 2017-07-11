package demo.controller;

import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/10.
 * JavaEE_Framework_1702A.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("create")
    private String create(User user) {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            sqlSession.insert("user.create",user);
        }
//        System.out.println("create: " + user);
        return "redirect:/default.jsp";
    }

    @RequestMapping("signIn")
    private String signIn(User user){
        try(SqlSession sqlSession = MyBatisSession.getSqlSession(false)){
            user = sqlSession.selectOne("user.signIn",user);
            if (user != null) {
                return "redirect:/index.jsp";
            }
        }
        return "/default.jsp";//   /代表G目录
    }
}
