package demo.dao.impl;

import demo.dao.BookDao;
import demo.model.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/14.
 * JavaEE_Framework_1702A.
 */
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book,Integer> implements BookDao{
}
