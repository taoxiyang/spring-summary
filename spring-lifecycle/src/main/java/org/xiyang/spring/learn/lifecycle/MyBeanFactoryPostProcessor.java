package org.xiyang.spring.learn.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author: qiushui
 * @date: 2019-02-21 15:45
 */
@Slf4j
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        super();
        log.info("【工厂级接口】【BeanFactoryPostProcessor实现类】【构造器】");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
        log.info("【工厂级接口】【BeanFactoryPostProcessor实现类】Spring容器加载之后，所有Bean实例化之前调用");
        // 重写Person Bean的phone属性
        BeanDefinition bd = arg0.getBeanDefinition("person");
        bd.getPropertyValues().addPropertyValue("phone", "110");
    }


}
