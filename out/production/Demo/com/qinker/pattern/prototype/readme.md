# 原型模式的定义与特点
原型（Prototype）模式定义如下：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的对象。在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无需知道对象创建的细节。例如，Windows操作系统的安装通常比较耗时，如果复制就快了很多。
## 原型模式的优点
 - Java自带的原型模式基于内存二进制流的复制，在性能上比直接new一个对象更加优良。
 + 可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。
## 原型模式的缺点
 - 需要为每一个类都配置一个clone方法
 - clone方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背开闭原则。
 - 当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象的类都必须支持深克隆，实现起来会比较麻烦。
# 原型模式的结构和实现
 1. 模式的结构  
    原型模式包含以下主要角色。
    1. 抽象原型类：规定了具体原型对象必须实现的接口。
    2. 具体原型类： 实现抽象原型类的clone()方法，它是可被复制的对象。
    3. 访问类：使用具体原型类中的clone()方法来复制新的对象；  
  其结构图如图所示。
       ![prototype](http://c.biancheng.net/uploads/allimg/181114/3-1Q114101Fa22.gif "prototype")
 2. 模式的实现  
    原型模式的克隆分为浅克隆和深克隆。
    - 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
    - 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
# 原型模式的应用场景
 - 对象之间相同或者相似，即只是个别的几个属性不同的时候。
 - 创建对象成本较大，例如初始化时间长，占用CPU太多，或者占用网络资源太多等，需要优化资源。
 - 创建一个对象需要繁琐的数据准备或者访问权限等，需要提高性能或者提高安全性。
 - 系统中大量使用该类对象，且各个调用者都需要给他的属性重新赋值。   
   在 Spring 中，原型模式应用的非常广泛，例如 scope='prototype'、JSON.parseObject() 等都是原型模式的具体应用。
# 原型模式的扩展
原型模式可扩展为带原型管理器的原型模式，它在原型模式的基础上增加了一个原型管理器 PrototypeManager 类。该类用 HashMap 保存多个复制的原型，Client 类可以通过管理器的 get(String id) 方法从中获取复制的原型。其结构图如图所示。
![prototypeManager](http://c.biancheng.net/uploads/allimg/181114/3-1Q114102049214.gif "prototypeManager")