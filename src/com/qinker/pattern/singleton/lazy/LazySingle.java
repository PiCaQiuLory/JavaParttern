package com.qinker.pattern.singleton.lazy;

/**
 * Description 懒汉单例模式
 * 如果编写的是多线程程序，则不要删除下例代码中的关键字 volatile 和 synchronized，否则将存在线程非安全的问题。
 * 如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
 * @author lory
 * @version //todo
 * @ClassName LazySingle
 * @date 2021.02.20 10:37
 */
public class LazySingle {

    /**
     * 保证instance在所有线程当中同步
     */
    private static volatile LazySingle instance = null;

    private LazySingle(){}

    public static synchronized LazySingle getInstance(){
        if (instance == null){
            instance = new LazySingle();
        }
        return instance;
    }
}
