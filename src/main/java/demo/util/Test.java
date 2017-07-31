package demo.util;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/21.
 * JavaEE_Framework_1702A.
 */
public class Test {
    public static void main(String[] args) {
        int totalCount = 26;
        int pageSize = 10;
        double p = pageSize;
        System.out.println(totalCount / pageSize);
        System.out.println(Math.ceil(totalCount / p));
    }
}
