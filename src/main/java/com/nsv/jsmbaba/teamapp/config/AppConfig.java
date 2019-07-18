package com.nsv.jsmbaba.teamapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@EnableTransactionManagement //To Enable Transaction Management in case of Java Config
//@EnableAspectJAutoProxy
public class AppConfig {

    //@Bean
    public PlatformTransactionManager transactionManager(){
        HibernateTransactionManager hibernateTransactionManager= new HibernateTransactionManager();
        //We need to set the sessionFactory to transactionManager
        //hibernateTransactionManager.setSessionFactory(sessionFactory());
        return hibernateTransactionManager;
    }
}
