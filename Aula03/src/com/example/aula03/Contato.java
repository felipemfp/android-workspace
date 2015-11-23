package com.example.aula03;
public class Contato {

	private String _nome;
	private String _telefone;

	public Contato(String nome, String telefone) {
		_nome = nome;
		_telefone = telefone;
	}

	public String getNome() {
		return _nome;
	}

	public void setTelefone(String telefone) {
		_telefone = telefone;
	}

	@Override
	public String toString() {
		return "@" + _nome + ": " + _telefone;
	}

}
