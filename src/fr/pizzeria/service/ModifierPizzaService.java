package fr.pizzeria.service;
import java.util.Scanner;

import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {
	
	Scanner questionUser = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemoDao pizzaDao) throws UpdatePizzaException {
		// TODO Auto-generated method stub
		
		System.out.println("Mise à jour d'une pizza  ");
		
			// CHOIX DU CODE PIZZA PAR L'UTILISATEUR
		System.out.println("Veuillez choisir le code de la pizza à modifier:  ");
		
		String modif_code = questionUser.nextLine();
		
		
			// EXCEPTION POUR CODE INEXISTANT
		if(!pizzaDao.pizzaExists(modif_code)) {
			throw new UpdatePizzaException(" La pizza à modifier n'existe pas");
		}

			// MESSAGE POUR PIZZA EXISTANTE
		System.out.println("la pizza existe  ");
	
			// L'UTILISATEUR RENSEIGNE LE CODE, LE NOM ET LE PRIX DE LA NOUVELLE PIZZA
		System.out.println("Veuillez saisir le nouveau code:  ");
		String newCode = questionUser.nextLine();
		
		System.out.println("Veuillez saisir le nouveau nom (sans espace):  ");
		String newLibelle = questionUser.nextLine();
		
		System.out.println("Veuillez saisir le nouveau prix (avec une virgule):  ");
		double newPrix = questionUser.nextDouble();
		questionUser.nextLine();
		
			// MISE A JOUR DE LA PIZZA
		Pizza newPizza = new Pizza (newCode , newLibelle , newPrix) ;
		pizzaDao.updatePizza(modif_code, newPizza);
			
		
	}

}

