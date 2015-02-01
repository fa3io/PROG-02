package br.com.unitri.aula05.exercicio1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Contador extends Thread {

	private int idCliente;
	private Socket cliente;

	public Contador(int idCliente, Socket cliente) {
		this.idCliente = idCliente;
		this.cliente = cliente;
	}
	

	@Override
	public void run() {

		System.out.println("[Conexao aberta de " + cliente.getInetAddress().toString() + "]");
		System.out.println("[Enviando dados ....]");

		ObjectOutputStream saida;

		try {
			saida = new ObjectOutputStream(cliente.getOutputStream());
			saida.flush(); // Envia Cabecalho de preparo do outro endpoint
			// saida.writeObject("SOH"); //Star of Header

			saida.writeObject("Servidor basico conectado");
			saida.writeObject("Procesando Dados....");
			for (int i = 0; i < 1000000000; i++) {
				
			}
			saida.writeObject("Dados de conexo " + cliente.toString());
			saida.writeObject("Tchau!!!");
			System.out.println("[Dados Enviados!]" + idCliente);
			saida.writeObject("EOT"); // End Of Transfer
			cliente.close();
			System.out.println("[Conexao Encerrada!]");
		} catch (IOException e) {

		}
	}

}
