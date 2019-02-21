package org.xiyang.spring.learn.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

/**
 * @author: qiushui
 * @date: 2019-02-21 15:39
 */
public class Person implements BeanNameAware, ApplicationContextAware,InitializingBean, DisposableBean{

    private String name;

    private String address;

    private int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("【Bean级接口】【注入属性】注入属性name...");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        System.out.println("【Bean级接口】【注入属性】注入属性address...");
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
        System.out.println("【Bean级接口】【注入属性】注入属性phone...");
    }

    public Person(){
        System.out.println("执行Person构造器");
    }

    // 通过<bean>的init-method属性指定的初始化方法
    @PostConstruct
    public void myInit() {
        System.out.println("【Bean自身方法】【init-method】初始化方法...");
    }

    // 通过<bean>的destroy-method属性指定的初始化方法
    public void myDestory() {
        System.out.println("【Bean自身方法】【destroy-method】销毁方法...");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("【Bean级接口】【BeanNameAware接口】注入beanName...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【DiposibleBean接口】销毁方法...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【Bean级接口】【InitializingBean接口】初始化方法...");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【Bean级接口】【ApplicationContextAware接口】注入Spring容器ApplicationContext...");
    }

    public void sayHello() {
        System.out.println("【Bean自身方法】sayHello...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
