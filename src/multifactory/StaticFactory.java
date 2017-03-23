package multifactory;

import commonfactory.MailSender;
import commonfactory.Sender;
import commonfactory.SmsSender;

/**
 * Created by dell on 2017/3/23.
 */
public class StaticFactory {

    public static Sender createMailSender() {
        return new MailSender();
    }

    public static Sender createSmsSender() {
        return new SmsSender();

    }
}
