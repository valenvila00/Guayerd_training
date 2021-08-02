package testiphonefactory;

import com.guayerd.IPhoneFactory;
import com.guayerd.apple.before.model.IPhone;
import com.guayerd.factory.before.model.IPhone11;
import com.guayerd.factory.before.model.IPhoneX;

public class TestiPhoneFactory {
    public static void main(String[] args) {
        IPhoneFactory Apple = new IPhoneFactory();
        IPhone iphone11 = Apple.orderIPhone("IPhone11");
        System.out.println(iphone11.getColor());
        System.out.println(iphone11.getCameras());
        System.out.println(iphone11.getCapacity());
        System.out.println(iphone11.getModel());
        iphone11.encendiendo();
    }
}
