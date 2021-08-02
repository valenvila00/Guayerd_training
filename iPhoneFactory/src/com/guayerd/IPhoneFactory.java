package com.guayerd;

import com.guayerd.apple.before.model.IPhone;
import com.guayerd.factory.before.model.IPhone11;
import com.guayerd.factory.before.model.IPhoneX;

public class IPhoneFactory {

    public IPhone orderIPhone(String model) {

        IPhone device = null;

        // pasar de if a lambda usando las flechas ->

        if (model.equals("IPhone11")){
            device = new IPhone11(128, "red");
        } else if (model.equals("IPhoneX")){
            device = new IPhoneX(256, "black");
        } else {
            System.out.println("Model does not exists.");
        }


        return device;
    }
}
