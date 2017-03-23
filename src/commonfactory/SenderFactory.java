package commonfactory;

/**
 * Created by dell on 2017/3/23.
 */
public class SenderFactory {
    public Sender createSender(String type) {
        if (type.equals("mail")) {
            return new MailSender();
        }else if(type.equals("sms")){
            return new SmsSender();
        }
        System.out.print("请输入正确的类型");
        return null;
    }
}
