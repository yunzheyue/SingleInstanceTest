package com.example.app2;

/**
 * autour : lbing
 * date : 2018/8/28 09:56
 * className :
 * version : 1.0
 * description :
 */


public class DoubleCheckLockInstance {
    private static DoubleCheckLockInstance doubleCheckLockInstance = null;

    //私有化构造器
    private DoubleCheckLockInstance() {

    }
    //使用双检查锁机制，减少懒汉式的对资源的消耗
    public static DoubleCheckLockInstance getDoubleCheckLockInstance() {
//        第一层判空是为了避免不必要的同步，
        if (doubleCheckLockInstance == null) {
            synchronized (DoubleCheckLockInstance.class) {
//                第二层判空是为了创建实例
                if(doubleCheckLockInstance==null){
                    doubleCheckLockInstance = new DoubleCheckLockInstance();
                }
            }
        }
        return doubleCheckLockInstance;
    }
    /**
     * 两次判空的原因是由于java的机制决定的。
     * instance =new Instance() 一般做三件事：
     * ①给instance实例分配内存
     * ②调用Instance()的构造器，初始化成员字段
     * ③将instance指向分配的内存空间，这时候instance才不为null
     *  但是java在执行的时候②③步骤是不确定的，有可能在调用③的时候，正好切换线程，这时候instance已经不为null，
     *  调用的时候就会出错。
     */


    /**
     * DCL模型是使用最多的单例实现方式，一般情况下都能满足需求
     * 优点：
     * 资源利用率高，第一次使用的时候进行实例化，
     * 缺点:
     * ①第一次加载比较慢
     * ②由于java内存模型，可能加载失败，高并发后可能出现问题，但是概率很小，
     */

}
