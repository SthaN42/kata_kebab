package fr.unilim.iut;

import java.util.List;

import fr.unilim.iut.ingredients.Ingredient;

public class Kebab {
	
	private List<Ingredient> ingredients;
	
	public Kebab(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Ingredient> listerLesIngredients() {
		return this.ingredients;
	}

}
