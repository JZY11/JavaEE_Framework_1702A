package demo.c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/6.
 * JavaEE_Framework_1702A.
 */
public class Service {
    public static void main(String[] args) {
//        Business business = new Business();
//        business.setDeviceWriter(new UsbWriter());
//        business.write();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.write();
    }
}
