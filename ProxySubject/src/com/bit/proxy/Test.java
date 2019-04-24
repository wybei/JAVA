package com.bit.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//真实业务接口
interface ISbuject{
    public void eat(String name,int num);
}
class RealSubject implements ISbuject{

    @Override
    public void eat(String name, int num) {
        System.out.println("i want to eat"+num+"liang"+name);
    }
}
/*
动态代理类
*/
class ProxySubject implements InvocationHandler{
    // 绑定任意接口的对象，使用Object描述
    private Object object;
    /*
     * 将真实接口与代理类绑定
     * @return 返回一个代理对象(这个对象是根据接口定义动态创建生成的代理对象)
     */
    public Object bind(Object realObject){
        // 保存真实主题对象
        this.object=realObject;
        return Proxy.newProxyInstance(realObject.getClass().getClassLoader(),
                object.getClass().getInterfaces(),this);
    }

    public void beforeHander(){
        System.out.println("[ProxySubject] 方法处理前");
    }
    public void afterHander(){
        System.out.println("[ProxySubject] 方法处理后");
    }

    @Override
    //参数：proxy代理类对象
    //     method真实类方法
    //     args真实方法参数
    //     Object返回真实接口的对象
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.beforeHander();
        Object obj=method.invoke(this.object,args);
        this.afterHander();
        return obj;
    }
}
public class Test {
    public static void main(String[] args) throws Exception{
        ISbuject subject= (ISbuject) new ProxySubject().bind(new RealSubject());
        subject.eat("过桥米线",5);
    }
}
