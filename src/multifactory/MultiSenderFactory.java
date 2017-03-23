package multifactory;

import commonfactory.MailSender;
import commonfactory.Sender;
import commonfactory.SmsSender;

/**
 * Created by dell on 2017/3/23.
 */
public class MultiSenderFactory {
    public Sender creatSmsSender() {
        return new SmsSender();
    }

    public Sender createMailSender() {
        return new MailSender();
    }

}
