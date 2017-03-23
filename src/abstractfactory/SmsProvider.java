package abstractfactory;

import commonfactory.Sender;
import commonfactory.SmsSender;

/**
 * Created by skll on 2017/3/23.
 */
public class SmsProvider implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
