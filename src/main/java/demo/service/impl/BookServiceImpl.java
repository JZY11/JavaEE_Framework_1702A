package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.Book;
import demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/18.
 * JavaEE_Framework_1702A.
 */
@Service
public class BookServiceImpl extends GenericServiceImpl<Book,Integer> implements BookService {

    @Override
    @Autowired
    @Qualifier("bookDaoImpl")//指定一下具体的是哪个实现类
    public void setGenericDao(GenericDao<Book,Integer> genericDao) {
        super.genericDao = genericDao;
    }
}
