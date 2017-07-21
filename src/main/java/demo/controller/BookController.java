package demo.controller;

import demo.dao.BookDao;
import demo.model.Book;
import demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/14.
 * JavaEE_Framework_1702A.
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    //    private BookDao bookDao;
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "create")
    private String create(Book book){
        bookService.create(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("queryAll")
    private String queryAll() {
        session.setAttribute("books", bookService.queryAll());
        return "redirect:/index.jsp";
    }

    @RequestMapping("queryById/{id}")
    private String queryById(@PathVariable int id){
        session.setAttribute("book", bookService.queryById(id));
        return "redirect:/edit.jsp";
    }

    @RequestMapping("modify")
    private String modify(Book book) {
        bookService.modify(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("remove/{id}")
    private String remove(@PathVariable int id) {
        bookService.remove(id);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("removeBooks")
    private String remove(int[] ids){
        System.out.println(Arrays.toString(ids));
        for (int id : ids) {
            bookService.remove(id);
        }
        return "redirect:/book/queryAll";
    }
}
