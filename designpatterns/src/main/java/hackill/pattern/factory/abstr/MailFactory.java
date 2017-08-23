package hackill.pattern.factory.abstr;

import hackill.pattern.factory.MailSender;
import hackill.pattern.factory.Sender;

/**
 * @author hackill
 * @date on 17/8/23 15:10
 */

public class MailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
