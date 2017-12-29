package com.etudiant.m2i;

public class ClasseB {

	private ClasseA obj;

	public ClasseB(ClasseA obj) {
		System.out.println(	"Constructeur ClasseB qui utilise un bean de ClasseA qui dit:");
		obj.afficherMessage();
		this.obj = obj;
	}
	
	public void quiSuisJe() {
		System.out.println(
					"Je suis un bean de classe " + 
					this.getClass().getSimpleName() + 
					" et je contiens un bean de classe " + this.obj.getClass().getSimpleName() +
					" qui dit: "
		);
		obj.afficherMessage();
	}

}
