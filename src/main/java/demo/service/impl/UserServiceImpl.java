package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.User;
import demo.service.UserService;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/18.
 * JavaEE_Framework_1702A.
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

    @Override
    @Autowired
    @Qualifier("userDaoImpl")
    public void setGenericDao(GenericDao<User> genericDao) {
        super.genericDao = genericDao;
    }
}
