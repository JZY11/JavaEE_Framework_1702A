package demo.b;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/6.
 * JavaEE_Framework_1702A.
 */
public class Service {
    public static void main(String[] args) {
        Business business = new Business(new FloppyWriter());
        business.write();
    }
}
