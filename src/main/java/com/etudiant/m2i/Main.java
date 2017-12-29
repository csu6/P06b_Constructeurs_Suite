package com.etudiant.m2i;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext conteneur = new ClassPathXmlApplicationContext("maConfiguration.xml");

		ClasseB objB = conteneur.getBean("idB1", ClasseB.class);
		objB.quiSuisJe();

		System.out.println("-------------------------------------------------------------");
		// Après la création d'un bean de ClasseA disponible,
		// la récupération réussira:
		ClasseA objA = conteneur.getBean("idA1", ClasseA.class);
		objA.afficherMessage();

		System.out.println("-------------------------------------------------------------");
		
		objB = conteneur.getBean("idB2", ClasseB.class);
		objB.quiSuisJe();

		System.out.println("-----------------------  Après récupération de idB3:  --------------------------------------");
		
		objB = conteneur.getBean("idB3", ClasseB.class);
		objB.quiSuisJe();
		
		((ClassPathXmlApplicationContext) conteneur).close();
	}

}
