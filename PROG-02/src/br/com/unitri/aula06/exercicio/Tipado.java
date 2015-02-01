package br.com.unitri.aula06.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Tipado {
	
public static void main(String[] args) {
		
		
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(new Integer(1));
		//lista.add("10");
		lista.add(new Integer(10));
		
		Integer i1 = (Integer) lista.get(0);
		Integer i2 = (Integer) lista.get(1);
		
	}

}
