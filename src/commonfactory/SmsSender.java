package commonfactory;

/**
 * Created by dell on 2017/3/23.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("from SmsSender");
    }
}
