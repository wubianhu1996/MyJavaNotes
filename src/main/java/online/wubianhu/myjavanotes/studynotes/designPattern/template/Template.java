package online.wubianhu.myjavanotes.studynotes.designPattern.template;

//抽象模版模式
//定义：模板方法模式在一个方法中定义一个算法骨架，并将某些步骤推迟到子类中实现。模板方法模式可以让子类在不改变算法整体结构的情况下，重新定义算法中的某些步骤
//目的：1.使用模版方法模式的目的是避免编写重复代码，以便开发人员可以专注于核心业务逻辑的实现
//2.解决接口与接口实现类之间继承矛盾问题


//1。abstractTemplete(抽象模板）：定义一系列抽象方法，或者实现的方法，或者钩子方法。即：定义流程
//2。ConcreteTemplete(具体模板）：实现父类抽象方法，基于本身不同的模板业务逻辑，实现不同的业务逻辑代码。即：抽象方法实现相同，内部逻辑实现不同

//举例
//client请求商品详情，有模块组装器选择组装返回结果。
//client请求-》模块组装器-》1。2。3。4等等模块-》返回请求
public abstract class Template<T> {
    //组装结果
    public T template(ModelContaner modelContaner) {
        T block = initBlock();
        try {
            this.dowork(modelContaner, block);
        } catch (Exception e) {

        }
        return block;
    }

    //初始化构建返回结果模型
    protected abstract T initBlock();


    protected abstract void dowork(ModelContaner modelContaner,T block);

}
