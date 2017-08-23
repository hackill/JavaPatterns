package hackill.pattern.factory.abstr;

import hackill.pattern.factory.Sender;
import hackill.pattern.factory.SmsSender;

/**
 * @author hackill
 * @date on 17/8/23 14:33
 */

public class SmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }

}
