package com.skul.backend;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		  entityManagerFactoryRef = "ahmEntityManagerFactory",
		  transactionManagerRef = "ahmTransactionManager",
		  basePackages = { "com.skul.backend.ahm.repository" }
		)
public class AhmDBConfig {
	  @Bean(name = "ahmdataSource")
	  @ConfigurationProperties(prefix = "spring.datasource.ahm")
	  public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	  }
	  
	  @Bean(name = "ahmEntityManagerFactory")
	  public LocalContainerEntityManagerFactoryBean 
	  entityManagerFactory(
	    EntityManagerFactoryBuilder builder,
	    @Qualifier("ahmdataSource") DataSource dataSource
	  ) {
	    return builder
	      .dataSource(dataSource)
	      .packages("com.skul.backend.ahm.domain")
	      .persistenceUnit("ahm")
	      .build();
	  }
	    
	  @Bean(name = "ahmTransactionManager")
	  public PlatformTransactionManager transactionManager(
	    @Qualifier("ahmEntityManagerFactory") EntityManagerFactory 
	    akadentityManagerFactory
	  ) {
	    return new JpaTransactionManager(akadentityManagerFactory);
	  }

}
