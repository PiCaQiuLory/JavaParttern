package com.qinker.pattern.singleton.Hungry;

/**
 * Description 饿汉式单例模式
 *
 * @author lory
 * @version //todo
 * @ClassName HungrySingle
 * @date 2021.02.20 10:40
 */
public class HungrySingle {

    private static final HungrySingle instance = new HungrySingle();

    private HungrySingle(){}

    public static HungrySingle getInstance(){
        return instance;
    }
}
