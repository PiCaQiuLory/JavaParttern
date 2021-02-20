## 使用场景
当一个类的构造函数参数个数超过4个，而且这些参数有些是可选的参数，考虑使用构造者（建造者）模式。
## 如何实现
### 变种(varietas)
1. 在Computer中创建一个静态内部类Builder,然后将Computer中的参数都复制到Builder类中。
2. 在Computer中创建一个private的构造函数，参数为Builder类型。
3. 在Builder中创建一个public的构造函数，参数为Computer中必填的那些参数， cpu和ram。
4. 在Builder中创建设置函数，对Computer中那些可选参数进行赋值，返回值为Builder类型的实例。
5. 在Builder中创建一个build()方法，在其中构建Computer的实例并返回。
### 经典(traditional)
UML如图：
![builder](https://pic3.zhimg.com/80/v2-5a7bd484bf046798b86826e95ab894fa_720w.jpg "builder")
如上图所示，builder模式有4个角色。
- Product:最终要生成的对象，例如Computer实例。
- Builder: 构建者的抽象基类（有时会用接口代替）。其定义了构建Product的抽象步骤，其实体类需要实现这些步骤。其会包含一个用来返回最终产品的方法 Product getProduct()。
- ConcreteBuilder: Builder的实现类
- Director：指挥者，决定如何构建最终产品的算法，其会包含一个负责组装的方法 void Construct(Builder builder),在这个方法中通过调用builder的方法，就可以设置builder，等设置完成后，就可以通过builder的getProduct()方法获得最终的产品。