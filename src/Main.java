import commonfactory.SenderFactory;
import commonfactory.Sender;
import multifactory.MultiSenderFactory;
import multifactory.StaticFactory;

public class Main {

    public static void main(String[] args) {
        /*test common_factory*/
//        SenderFactory factory = new SenderFactory();
//        Sender sms = factory.createSender("sms");
//        sms.send();


        /*test multi_factory*/
//        MultiSenderFactory multiSenderFactory = new MultiSenderFactory();
//        Sender mailSender = multiSenderFactory.createMailSender();
//        mailSender.send();


        /*  test static factory*/
//        Sender mailSender = StaticFactory.createMailSender();
//        mailSender.send();
    }
}
