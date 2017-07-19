package demo.dao;

import demo.model.Book;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/14.
 * JavaEE_Framework_1702A.
 */
public interface BookDao extends GenericDao<Book, Integer> {

    /*
DAO 接口的模板 template 模板\ ['templeɪt\;\ -plɪt]
package demo.dao;
import demo.model.{model};
public interface {model}Dao extends GenericDao<{model}> {}
 */
}
