package com.qinker.pattern.prototype.demo;

/**
 * Description 用原型模式生成“三好学生”奖状。
 * 分析：同一学校的“三好学生”奖状除了获奖人姓名不同，其他都相同，属于相似对象的复制，同样可以用原型模式创建，然后再做简单修改就可以了。
 * @author lory
 * @version //todo
 * @ClassName ProtoTypeCitation
 * @date 2021.02.20 11:17
 */
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1 = new Citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院");
        obj1.display();
        Citation obj2 = (Citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}

/**
 * 奖状类
 */
class Citation implements Cloneable {
    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display(){
        System.out.println(name + info + college);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功!");
        return super.clone();
    }
}
