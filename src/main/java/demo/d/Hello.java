package demo.d;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/6.
 * JavaEE_Framework_1702A.
 */
public class Hello {

//    private String name;
    private CharSequence name;//CharSequence为String类的接口

//    public void setName(String name) {
//        this.name = name;
//    }

    public void setName(CharSequence name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }
}
