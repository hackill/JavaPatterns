package hackill.pattern.factory;

import hackill.pattern.Log;

/**
 * @author hackill
 * @date on 17/8/23 14:32
 */

public class SmsSender implements Sender {

    private static final String TAG = "SmsSender";

    @Override
    public void send() {
        Log.i(TAG, "send: sms sender");
    }
}
