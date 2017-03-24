package abstractfactory;

import commonfactory.MailSender;
import commonfactory.Sender;
import commonfactory.SmsSender;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/3/24.
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
