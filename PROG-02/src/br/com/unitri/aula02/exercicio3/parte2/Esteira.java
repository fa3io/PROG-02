package br.com.unitri.aula02.exercicio3.parte2;

import java.util.ArrayList;
import java.util.List;

public class Esteira {

	private List<Item> esteira = new ArrayList<>();

	public synchronized void add(Item item) throws InterruptedException {

		if (esteira.size() >= 5) {
			System.out.println(Thread.currentThread().getName() + ": Esteira cheia, Aguardando consumidor");
			wait();
		}
		esteira.add(item);
		System.out.println("Item " + item + " Adicionado.");
		notifyAll();

	}

	public synchronized void remove() throws InterruptedException {

		if (esteira.size() <= 0) {
			System.out.println(Thread.currentThread().getName() + ": Droga esteira vazia, Aguadando produtor...");
			wait();
		}
		Item item = esteira.get(0);
		esteira.remove(0);
		System.out.println("Item " + item + " Sendo removido por " + Thread.currentThread().getName());
		notifyAll();
	}
}
