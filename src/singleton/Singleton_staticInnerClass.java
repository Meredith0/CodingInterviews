package singleton;
/**
 * @author : Meredith
 * @date : 2019-06-05 20:21
 * @description : 静态内部类
 */
public class Singleton_staticInnerClass {

    private Singleton_staticInnerClass() {}

    public static Singleton_staticInnerClass getInstance() {
        return InnerClass.Instance;
    }

    private static class InnerClass {
        private static Singleton_staticInnerClass Instance = new Singleton_staticInnerClass();
    }

}

