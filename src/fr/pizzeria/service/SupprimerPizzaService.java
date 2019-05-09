package fr.pizzeria.service;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class SupprimerPizzaService extends MenuService {
	
	Scanner questionUser = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemoDao pizzaDao) {
		// TODO Auto-generated method stub
		
		System.out.println("Suppression d'une pizza ");
		
		
		System.out.println("Veuillez choisir le code de la pizza à supprimer:  ");
		//questionUser.nextLine();
		String suppr_code = questionUser.nextLine();
		
		boolean exist = pizzaDao.pizzaExists(suppr_code) ;
		
		
		if (exist == true) {
		
			pizzaDao.deletePizza(suppr_code) ;
		
		}
		
	}

}
