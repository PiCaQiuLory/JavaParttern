package com.qinker.pattern.builder.traditional;

/**
 * Description //todo
 *
 * @author lory
 * @version //todo
 * @ClassName ComputerMakeDemo
 * @date 2021.02.20 14:08
 */
public class ComputerMakeDemo {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder builder = new MacComputerBuilder("I5处理器", "三星125");
        director.makeComputer(builder);
        Computer macComputer = builder.getComputer();
        System.out.println("mac computer:" + macComputer.toString());

        ComputerBuilder lenovoBuilder = new MacComputerBuilder("I7处理器","海力士222");
        director.makeComputer(lenovoBuilder);
        Computer lenovoComputer = lenovoBuilder.getComputer();
        System.out.println("lenovo computer:" + lenovoComputer.toString());
    }
}
