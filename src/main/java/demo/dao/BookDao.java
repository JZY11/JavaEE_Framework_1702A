package demo.dao;

import demo.model.Book;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/14.
 * JavaEE_Framework_1702A.
 */
public interface BookDao {

    void create(Book book);

    List<Book> queryAll();

    Book queryById(int id);

    void modify(Book book);

    void remove(int id);
}
