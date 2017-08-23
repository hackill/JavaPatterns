package hackill.pattern.factory.abstr;

/**
 * @author hackill
 * @date on 17/8/23 15:10
 */
public class TestMain {

    /**
     * 抽象工厂模式
     * <p>
     * <p>
     * 特点：对工厂进行抽象，让工厂创建对象进行分离。
     * 对后续多个工厂进行拓展，不需要更改之前的工厂
     *
     * @param args
     */
    public static void main(String[] args) {

        Provider provider = new SmsFactory();
        provider.produce().send();

    }
}
