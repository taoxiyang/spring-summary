package org.xiyang.spring.learn.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author: qiushui
 * @date: 2019-02-21 15:46
 */
@Slf4j
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        System.out.println("【容器级接口】【MyBeanPostProcessor实现类】【构造器】");
    }

    // 初始化Bean之前调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("【容器级接口】【BeanPostProcessor实现类】初始化Bean之前调用 beanName [{}]", beanName);
        return bean;
    }

    // 初始化Bean之后调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("【容器级接口】【BeanPostProcessor实现类】初始化Bean之后调用 beanName [{}]", beanName);
        return bean;
    }
}