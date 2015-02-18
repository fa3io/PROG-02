package br.com.unitri.aula05.exercicio2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClienteArquivo extends JFrame {

	private static final long serialVersionUID = 1L;
	
	//C:\Users\Fábio\Desktop\Teste Servidor\Aula Servidores.txt
	
	JTextField texto;
	JButton btnEnviar;
	Socket cliete;
	Scanner scanner;
	PrintWriter escritor;

	public ClienteArquivo(){
		super("Chat Cliente");
		try{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 80);
		

		
		Container container = new Container();
		JButton btnEnviarButton = new JButton("Enviar");
		texto = new JTextField();
		JPanel painel = new JPanel(new BorderLayout());
		

		

		container.setLayout(new BorderLayout());

		painel.add(BorderLayout.CENTER, texto);
		painel.add(BorderLayout.EAST, btnEnviarButton);
		container.add(BorderLayout.CENTER, painel);
		
		
		getContentPane().add(BorderLayout.NORTH, container);
	
		configRede();
		
		btnEnviarButton.addActionListener((e) -> {
												escritor.println(texto.getText());
												escritor.flush();
												texto.setText("");
												texto.requestFocus();
										});
		
		}catch(Exception erro){
			System.err.println("Erro: " + erro.getMessage());
		}
		setVisible(true);
	}

	public static void main(String[] args){

		new ClienteArquivo();

	}

	public void configRede(){

		try{
			
		cliete = new Socket("192.168.233.1", 5000);
		escritor = new PrintWriter(cliete.getOutputStream());
		
		}catch(Exception erro){
			System.err.println("Erro: " + erro.getMessage());
		}

	}

}
