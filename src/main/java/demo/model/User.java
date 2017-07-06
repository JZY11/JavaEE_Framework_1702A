package demo.model;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.io.Serializable;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/4.
 * JavaEE_Framework_1702A.
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Integer id, String username, String password) {

        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
