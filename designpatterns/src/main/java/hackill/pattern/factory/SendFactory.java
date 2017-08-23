package hackill.pattern.factory;

/**
 * @author hackill
 * @date on 17/8/23 14:33
 */

public class SendFactory {


    /**
     * ======================================================简单工厂方式======================================================
     * 简单 工厂设计模式
     *
     * @param i
     * @return
     */
//    public Sender produce(int i) {
//        if (i == 0) {
//            return new SmsSender();
//        } else if (i == 1) {
//            return new MailSender();
//        } else {
//            throw new RuntimeException("type is wrong");
//        }
//    }

    /**
     * ======================================================多工厂方式======================================================
     */
//    public Sender produceSms() {
//        return new SmsSender();
//    }
//
//    public Sender produceMail() {
//        return new MailSender();
//    }


    /**
     * ======================================================静态工厂方式======================================================
     */
    public static Sender produceSms() {
        return new SmsSender();
    }

    public static Sender produceMail() {
        return new MailSender();
    }


}
