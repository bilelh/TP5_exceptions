package fr.pizzeria.service;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza;

public abstract class MenuService {

	public abstract void executeUC (PizzaMemoDao pizzaDao) throws UpdatePizzaException ;
	
}
