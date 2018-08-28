package com.example.app2;

/**
 * autour : lbing
 * date : 2018/8/28 09:46
 * className :
 * version : 1.0
 * description :
 */


public class LazyInstance {
    private static LazyInstance lazyInstance = null;

    //    私有化构造函数
    private LazyInstance() {
    }

    //增加同步锁
    public static synchronized LazyInstance getLazyInstance() {
        if (lazyInstance == null) {
            lazyInstance = new LazyInstance();
        }
        return lazyInstance;
    }
/** 增加同步锁 synchronized 这是为了多线程操作的时候保证对象唯一性的手段。
 * 不推荐使用
 * 缺点：
 * ①在第一次使用的时候，速度也会会比较慢。
 * ②在第一次使用的时候就instance对象就已经存在了，以后再调用的时候，仍然会触发同步锁的同步机制，这样
 * 会增加多余资源的开销。
 */

}
