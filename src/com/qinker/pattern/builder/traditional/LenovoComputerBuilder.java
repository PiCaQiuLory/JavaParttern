package com.qinker.pattern.builder.traditional;

/**
 * Description //todo
 *
 * @author lory
 * @version //todo
 * @ClassName LenovoComputerBuilder
 * @date 2021.02.20 14:06
 */
public class LenovoComputerBuilder extends ComputerBuilder{

    private Computer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        this.computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
