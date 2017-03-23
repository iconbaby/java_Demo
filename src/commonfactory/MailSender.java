package commonfactory;

/**
 * Created by dell on 2017/3/23.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.print("from MailSender");
    }
}
