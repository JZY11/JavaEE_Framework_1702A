package demo.b;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/6.
 * JavaEE_Framework_1702A.
 */
public class UsbWriter implements DeviceWriter{

    @Override
    public void writerToDevice() {
        System.out.println("writer to USB ...");
    }
}
