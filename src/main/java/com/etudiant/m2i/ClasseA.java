package com.etudiant.m2i;

public class ClasseA {
	private static int compteur = 0;
	private int monId;
	
	public ClasseA() {
		monId = compteur++;
	}
		
	public void afficherMessage() {
		System.out.println(
				"je sis un bean de classe " 
						+ getClass().getSimpleName()
						+ " ayant monId=" + monId
				);
	}
	
}
