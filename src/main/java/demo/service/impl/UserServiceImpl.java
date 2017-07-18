package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.User;
import demo.service.UserService;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.jasypt.util.password.StrongPasswordEncryptor;
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

    @Autowired
    private StrongPasswordEncryptor encryptor;

    @Override
    @Autowired
    @Qualifier("userDaoImpl")
    public void setGenericDao(GenericDao<User> genericDao) {
        super.genericDao = genericDao;
    }

    @Override
    public User signIn(User user) {
//        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        String plainPassword = user.getPassword();
        user = genericDao.query("queryByUsername",user.getUsername());
        if (user != null) {
            String encryptedPassword = user.getPassword();
            if(encryptor.checkPassword(plainPassword,encryptedPassword)){
                genericDao.modify("updateLastTime", user.getId());
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean signUp(User user) {
        if (genericDao.query("queryByUsername", user.getUsername()) == null) {
//            StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
            user.setPassword(encryptor.encryptPassword(user.getPassword()));
            genericDao.create(user);
        }
        return false;
    }
}
