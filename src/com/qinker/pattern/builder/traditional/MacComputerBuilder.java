package com.qinker.pattern.builder.traditional;

/**
 * Description //todo
 *
 * @author lory
 * @version //todo
 * @ClassName MacComputerBuilder
 * @date 2021.02.20 14:04
 */
public class MacComputerBuilder extends ComputerBuilder{
    private Computer computer;

    public MacComputerBuilder(String cpu, String ram) {
        this.computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
