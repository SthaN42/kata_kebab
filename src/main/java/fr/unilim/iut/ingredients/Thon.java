package fr.unilim.iut.ingredients;

import fr.unilim.iut.visiteur.VisiteurRegime;

public class Thon extends Ingredient {
	@Override
	public void accepter(VisiteurRegime visiteur) {
		visiteur.visiter(this);
	}
}
