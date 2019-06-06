package singleton;

/**
 * @author : Meredith
 * @date : 2019-06-05 20:07
 * @description : 双重检查锁(线程安全)
 */
public class Singleton_doubleNullCheck {

    //加上volatile 防止指令重排序
    private static volatile Singleton_doubleNullCheck Instance;

    private Singleton_doubleNullCheck() {}

    public static Singleton_doubleNullCheck getInstance() {
        if (null == Instance) {
            synchronized (Singleton_doubleNullCheck.class) {
                if (null == Instance) {
                    Instance = new Singleton_doubleNullCheck();
                }
            }
        }
        return Instance;
    }
}
