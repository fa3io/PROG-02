package br.com.unitri.aula05.exercicio1;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ClienteBasico {

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("[Forneca IP ou nome de Dominio]");
			System.exit(0);
		}
		try{
			
			System.out.println("Conectando ao servidor....");
			Socket cliente = new Socket(args[0], 1234);
			System.out.println("Conexao aceita de : " + cliente.getInetAddress().toString() + " ]");
			System.out.println("Recebendo mensagens.....");
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String msg;
			
			do {
				msg = (String) entrada.readObject();
				System.out.println(msg);
				
			} while (!msg.equals("EOT"));
				cliente.close();
				System.out.println("[Conexao encerrada...]");
		}catch(Exception erro){
			System.out.println("Erro! \n" + erro.getLocalizedMessage());
		}
	}

}
