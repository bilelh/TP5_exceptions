package fr.pizzeria.model;

public class Pizza {
	
	public int id ;
	public String code ;
	public String libelle ;
	public double prix ;
	public static int id_pizza = 0 ;
	
	public Pizza (String code , String libelle , double prix) {
		this.id = id_pizza++ ;
		this.code = code ;
		this.libelle = libelle ;
		this.prix = prix ;
	}
	
	public Pizza (int id , String code , String libelle , double prix) {
		this.id = id ;
		if (id > id_pizza) {
			id_pizza = id;
		}
		this.code = code ;
		this.libelle = libelle ;
		this.prix = prix ;
	}

}
