package com.atsistemas;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration //<context:annotationConfig>
@ComponentScan("com.atsistemas.persistencia.jpa")
@EnableTransactionManagement
public class ConfiguracionJpa {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

		factoryBean.setDataSource(dataSource);
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		factoryBean.setPackagesToScan("com.atsistemas.entidades");

		return factoryBean;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}

	@Bean
	public DataSource datasource() {
		BasicDataSource ds = new BasicDataSource();

		ds.setUrl("jdbc:derby://localhost:1527/Clientes;create=true");
		ds.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		ds.setUsername("user");
		ds.setPassword("user");
		ds.setDefaultCatalog("User");

		return ds;
	}

}
