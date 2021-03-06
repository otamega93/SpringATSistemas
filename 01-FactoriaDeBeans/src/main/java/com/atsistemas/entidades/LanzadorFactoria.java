package com.atsistemas.entidades;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atsistemas.entidades.Factoria.Coche;

public class LanzadorFactoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_Factorias.xml");
				
		Singleton instanciaDirecta = Singleton.getInstance();
		
		System.out.println("instanciaDirecta: " + instanciaDirecta);
		
		Singleton instanciaSpring = context.getBean("singleton", Singleton.class);
		
		System.out.println("instanciaSpring: " + instanciaSpring);
		
		Coche ferrari = context.getBean("ferrari", Coche.class);
		
		System.out.println("ferrari: " + ferrari);

	}

}
