package fr.pizzeria.service;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {
	
	Scanner questionUser = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemoDao pizzaDao) {
		// TODO Auto-generated method stub
		
		System.out.println("Ajout d'une nouvelle pizza  ");
		
		System.out.println("Veuillez saisir le code:  ");
		//questionUser.nextLine();
		String newCode = questionUser.nextLine();
		
		System.out.println("Veuillez saisir le nom (sans espace):  ");
		String newLibelle = questionUser.nextLine();
		
		System.out.println("Veuillez saisir le prix (avec une virgule):  ");
		double newPrix = questionUser.nextDouble();
		questionUser.nextLine();
		
		Pizza newPizza = new Pizza (newCode , newLibelle , newPrix) ;
		
		pizzaDao.saveNewPizza(newPizza);
		
		
		
		
		
	}

}
