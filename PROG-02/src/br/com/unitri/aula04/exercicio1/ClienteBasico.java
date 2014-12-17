package br.com.unitri.aula04.exercicio1;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ClienteBasico {

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("[Forneça IP ou nome de Dominio]");
		}
		try{
			
			System.out.println("Conectando ao servidor....");
			Socket cliente = new Socket(args[0], 123);
			System.out.println("Conexão aceita de : " + cliente.getInetAddress().toString() + " ]");
			System.out.println("Recebendo mensagens.....");
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String msg;
			
			do{
				msg = (String) entrada.readObject();
				System.out.println(msg);
			}while(){
				
				
			}
		}catch(Exception erro){
			
		}
	}

}
