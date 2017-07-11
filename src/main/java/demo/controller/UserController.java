package demo.controller;

import demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/10.
 * JavaEE_Framework_1702A.
 */
@Controller
@RequestMapping
public class UserController {
    @RequestMapping("create")
    private String create(User user){
        //todo save user ...?
        System.out.println("create: " + user);
        return "redirect:/default.jsp";
    }
}
