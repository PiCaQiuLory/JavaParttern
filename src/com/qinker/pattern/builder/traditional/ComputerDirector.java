package com.qinker.pattern.builder.traditional;

/**
 * Description //todo
 *
 * @author lory
 * @version //todo
 * @ClassName Director
 * @date 2021.02.20 14:07
 */
public class ComputerDirector {

    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setKeyboard();
        builder.setDisplay();
    }
}
