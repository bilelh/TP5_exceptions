package fr.pizzeria.service;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {
	
	Scanner questionUser = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemoDao pizzaDao) {
		// TODO Auto-generated method stub
		
		System.out.println("Mise à jour d'une pizza  ");
		
		System.out.println("Veuillez choisir le code de la pizza à modifier:  ");
		//questionUser.nextLine();
		String modif_code = questionUser.nextLine();
		
		
		boolean exist = pizzaDao.pizzaExists(modif_code) ;
		
		if (exist == true) {
			System.out.println("la pizza existe  ");
			
			
			System.out.println("Veuillez saisir le nouveau code:  ");
			String newCode = questionUser.nextLine();
			
			System.out.println("Veuillez saisir le nouveau nom (sans espace):  ");
			String newLibelle = questionUser.nextLine();
			
			System.out.println("Veuillez saisir le nouveau prix (avec une virgule):  ");
			double newPrix = questionUser.nextDouble();
			questionUser.nextLine();
			
			//Pizza newPizza = new Pizza (newCode , newLibelle , newPrix) ;
			Pizza newPizza = new Pizza (newCode , newLibelle , newPrix) ;
			pizzaDao.updatePizza(modif_code, newPizza);
			
		} else {
			System.out.println("la pizza n'existe pas  ");
		}
		
		
		
	}

}
