package abstractfactory;

import commonfactory.MailSender;
import commonfactory.Sender;

/**
 * Created by skll on 2017/3/23.
 */
public class MailProvider implements Provider{

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
