package demo.controller;

import demo.dao.BookDao;
import demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/14.
 * JavaEE_Framework_1702A.
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    @Autowired
    private BookDao bookDao;

    @RequestMapping("create")
    private String create(Book book){
        bookDao.create(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("queryAll")
    private String queryAll() {
        session.setAttribute("books", bookDao.queryAll());
        return "redirect:/index.jsp";
    }

    @RequestMapping("queryBookById/{id}")
    private String queryBookById(@PathVariable int id){
        session.setAttribute("book", bookDao.queryBookById(id));
        return "redirect:/edit.jsp";
    }

    @RequestMapping("modify")
    private String modify(Book book) {
        bookDao.modify(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("remove/{id}")
    private String remove(@PathVariable int id) {
        bookDao.remove(id);
        return "redirect:/book/queryAll";
    }
}
