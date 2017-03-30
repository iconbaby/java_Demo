import abstractfactory.Builder;
import abstractfactory.MailProvider;
import abstractfactory.SmsProvider;

import adapter.*;
import com.slkk.thread.TestTread;
import commonfactory.SenderFactory;
import commonfactory.Sender;
import decorator.Decorator;
import decorator.Source;
import decorator.Sourceble;
import multifactory.MultiSenderFactory;
import multifactory.StaticFactory;
import proxy.Agent;
import proxy.Rentble;
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
        /*建造者模式*/
//        Builder builder = new Builder();
//        builder.produceMailSender(10);

        /*适配器模式*/
//        Sportable adapter = new Adapter();
//        adapter.run();
//        adapter.eat();

        /*对象适配器模式*/
//        Sportable sportable = new Wraper(new Animal());
//        sportable.run();

        /*接口适配器*/
//        Bird parrot = new Parrot();
//        parrot.eat();

        /*装饰器模式*/
//        Sourceble decotator = new Decorator(new Source());
//        decotator.run();

        /*代理模式*/
//        Rentble agent = new Agent();
//        agent.rent();
        /*线程相关*/

        TestTread testTread = new TestTread();
        testTread.test();

    }

    public class Prototype implements Cloneable {
        public Object clone() throws CloneNotSupportedException {
            Prototype proto = (Prototype) super.clone();
            return proto;

        }
    }
}
