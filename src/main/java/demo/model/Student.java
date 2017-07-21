package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/21.
 * JavaEE_Framework_1702A.
 */
@Data
@AllArgsConstructor@NoArgsConstructor
public class Student implements Serializable {
    private Integer id;
    private String name;
    private int age;
    private double height;
    private boolean married;
    private String address;
}
