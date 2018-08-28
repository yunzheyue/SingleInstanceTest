package com.example.app2;

/**
 * autour : lbing
 * date : 2018/8/28 09:36
 * className :
 * version : 1.0
 * description :
 */

public class HungryInstance {
    //饿汉式  static 强调的是一个  final强调的是不可修改  线程安全，调用的时候反应快
    private static final HungryInstance instance = new HungryInstance();

//    私有化构造函数  防止直接进行调用构造方法创建对象
    private HungryInstance() {
    }

    public static HungryInstance getInstance() {
        return instance;
    }
    /**
     * 优点
     * 线程安全，调用的时候反应快
     * 缺点
     * 类加载时就进行初始化 导致内存
     */
}
