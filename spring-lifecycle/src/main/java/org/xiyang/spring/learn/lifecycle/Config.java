package org.xiyang.spring.learn.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: qiushui
 * @date: 2019-02-21 16:00
 */
@Configuration
public class Config {

    @Bean
    public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
        return new MyBeanFactoryPostProcessor();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean
    public MyInstantiationAwareBeanPostProcessor myInstantiationAwareBeanPostProcessor(){
        return new MyInstantiationAwareBeanPostProcessor();
    }

    @Bean
    public Person person(){
        Person person = new Person();
        person.setAddress("address");
        person.setPhone(100);
        person.setName("tao");
        return person;
    }

}
