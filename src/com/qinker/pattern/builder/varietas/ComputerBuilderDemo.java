package com.qinker.pattern.builder.varietas;

/**
 * Description //todo
 *
 * @author lory
 * @version //todo
 * @ClassName ComputerBuilderDemo
 * @date 2021.02.20 14:25
 */
public class ComputerBuilderDemo {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder("因特尔","三星")
                .setKeyboard("罗技")
                .setDisplay("三星24寸")
                .setUsbCount(2)
                .build();
        System.out.println(computer.toString());
    }
}
