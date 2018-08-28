package com.example.app2;

import android.util.Log;

/**
 * autour : lbing
 * date : 2018/8/28 10:41
 * className :
 * version : 1.0
 * description :
 */


public enum EnumInstance {
    INSTANCE;

    public void doSomething(){
        Log.e("TAG","xxx");
    }

    /**
     * 上面其中方法，在反序列化的时候,就不能保证单例，但是枚举及时是反序列化也能保证不会生成新的实例。
     * 并且枚举默认是线程安全的。
     */
    }
