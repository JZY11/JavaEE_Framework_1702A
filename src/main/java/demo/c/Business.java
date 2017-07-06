package demo.c;

import demo.b.DeviceWriter;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/6.
 * JavaEE_Framework_1702A.
 * 高层应用类 和 底层实现类的 松散耦合
 * 解耦合 *****
 */
public class Business {
    private demo.b.DeviceWriter deviceWriter;

    public Business(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void write() {
        deviceWriter.writerToDevice();
    }
}
