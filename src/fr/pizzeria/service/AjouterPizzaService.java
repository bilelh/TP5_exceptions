package fr.pizzeria.service;
import java.util.Scanner;

import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {
	
	Scanner questionUser = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemoDao pizzaDao) throws SavePizzaException {
		// TODO Auto-generated method stub
		
		System.out.println("Ajout d'une nouvelle pizza  ");
			// L'UTILISATEUR RENSEIGNE LE CODE, LE NOM ET LE PRIX DE LA NOUVELLE PIZZA
		System.out.println("Veuillez saisir le code:  ");
		String newCode = questionUser.nextLine();
		
		System.out.println("Veuillez saisir le nom (sans espace):  ");
		String newLibelle = questionUser.nextLine();
		
		System.out.println("Veuillez saisir le prix (avec une virgule):  ");
		double newPrix = questionUser.nextDouble();
		questionUser.nextLine();
		
			// EXCEPTION POUR PIZZA DEJA EXISTANTE
		if(pizzaDao.pizzaExists(newCode)) {
			throw new SavePizzaException(" Le code de la pizza existe déjà");
		}	
		
			// AJOUT DE LA NOUVELLE PIZZA
		Pizza newPizza = new Pizza (newCode , newLibelle , newPrix) ;
		pizzaDao.saveNewPizza(newPizza);
		
		
		
		
		
	}

}
