package demo.a;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/6.
 * JavaEE_Framework_1702A.
 * 高层应用类
 * 强耦合
 * 松散耦合
 */
public class Business {
    private FloppyWriter floppyWriter;
//    private UsbWriter usbWriter;

//    public Business(UsbWriter usbWriter) {
//        this.usbWriter = usbWriter;
//    }


    public Business(FloppyWriter floppyWriter) {
        this.floppyWriter = floppyWriter;
    }

    public void write() {
        floppyWriter.writerToFloppy();
//        usbWriter.writeToUsb();
    }
}
