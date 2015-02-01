package br.com.unitri.aula06.exercicio;

public class TipoNum <T> {

	private int id;
	private T valor;
	
	public TipoNum(int id, T valor) {
		setId(id);
		setValor(valor);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0 ) {
			throw new RuntimeException("Id < que 0");
		}
		this.id = id;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		if (valor == null) {
			throw new RuntimeException("Id < que 0");
		}
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return getId() + ": " + getValor();
	}
}
