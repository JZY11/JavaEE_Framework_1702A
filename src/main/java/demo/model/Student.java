package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/31.
 * JavaEE_Framework_1702A.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Student {
    private Integer id;
    private String name;
    private int age;
    private double height;
    private boolean married;
}
