package org.xiyang.spring.learn.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * @author: qiushui
 * @date: 2019-02-21 15:44
 */
@Slf4j
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    public MyInstantiationAwareBeanPostProcessor() {
        super();
        log.info("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】【构造器】");
    }

    // 实例化Bean之前调用
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        log.info("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】实例化Bean之前调用 beanName [{}]",beanName);
        return null;
    }

    // 实例化Bean之后调用
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        log.info("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】实例化Bean之后调用 beanName [{}]",beanName);
        return true;
    }

    // 初始化Bean之前调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】初始化Bean之前调用 beanName [{}]",beanName);
        return bean;
    }

    // 初始化Bean之后调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】初始化Bean之后调用 beanName [{}]",beanName);
        return bean;
    }

    // 设置某个属性时调用
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
                                                    String beanName) throws BeansException {
        log.info("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】实例化Bean之后，设置某个属性时调用 beanName [{}]",beanName);
        return pvs;
    }
}
