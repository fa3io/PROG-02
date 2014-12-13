package br.com.unitri.aula03.exercicio1; 

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;  
import java.util.Date;


public class Formatador{

	public String formataBytes(long b){
		DecimalFormat df = new DecimalFormat("###,###,###");
		return df.format(b);
	}

	public String formataData(long dt){

		Date d = new Date(dt);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
		return sdf.format(d);

	}

}
