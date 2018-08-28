package com.example.app2;

/**
 * autour : lbing
 * date : 2018/8/28 10:27
 * className :
 * version : 1.0
 * description :
 */


public class StaticInnerInstance {
    //静态内存类的单例模式  相当于饿汉式的改进
    private StaticInnerInstance() {
    }

    public static StaticInnerInstance getInstance() {
        return StaticInnerInstanceHolder.staticInnerInstance;
    }

    //    静态内部类
    private static class StaticInnerInstanceHolder {
        private static final StaticInnerInstance staticInnerInstance = new StaticInnerInstance();
    }
    /**
     * 只有在调用getInstance()的时候才进行初始化，节省资源，而且能像饿汉式一样线程安全。
     * 推荐使用
     */
}
