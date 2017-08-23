package hackill.pattern.factory;


import hackill.pattern.Log;

/**
 * @author hackill
 * @date on 17/8/23 14:32
 */

public class MailSender implements Sender {

    private static final String TAG = "MailSender";

    @Override
    public void send() {
        Log.i(TAG, "send: mail sender");
    }
}
