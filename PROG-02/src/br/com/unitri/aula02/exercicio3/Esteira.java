package br.com.unitri.aula02.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Esteira {
	
	private List<Item >esteira = new ArrayList<>();
	
	public  void add(Item item){	
			if (esteira.size() < 5) {
				esteira.add(item);
				System.out.println("Item "+ item +" Adicionado.");
		}else {
			System.out.println("Esteira cheia item Descartado !!");
		}
	}
	
	public void remove(){
		
			if (esteira.size() > 0) {
				Item item  = esteira.get(1);
				esteira.remove(1);
				System.out.println("Item " + item  + "removido..." );
		}else{
			System.out.println("Droga esteira vazia !!!");
		}	
	}
	public void statusEsteira(){
		for (Item item : esteira) {
			System.out.println(item);
		}
		
		esteira.forEach(System.out::println);
		
	}

}
