import abstractfactory.MailProvider;
import abstractfactory.SmsProvider;
import commonfactory.SenderFactory;
import commonfactory.Sender;
import multifactory.MultiSenderFactory;
import multifactory.StaticFactory;
import singleon.Book;

import java.util.Vector;

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

        /*静态工厂模式*/
//        MailProvider mailProvider = new MailProvider();
//        Sender produce = mailProvider.produce();
//        produce.send();
//
//        SmsProvider smsProvider = new SmsProvider();
//        Sender produce1 = smsProvider.produce();
//        produce1.send();

        /*单例模式*/
//        Book book = Book.getBook();
//        book.writeNo();



    }
}
