package hackill.pattern.factory.abstr;

import hackill.pattern.factory.Sender;

/**
 * @author hackill
 * @date on 17/8/23 15:07
 */

public interface Provider {

    Sender produce();
}
