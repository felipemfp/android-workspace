package com.example.aula03;
import java.util.ArrayList;


public class Contatos extends ArrayList<Contato> {
	private static final long serialVersionUID = 1L;

	public void Inserir(String nome, String telefone) {
		Contato c = new Contato(nome, telefone);
		this.add(c);
	}

	public Boolean Editar(String nome, String telefone) {

		for (Contato c : this) {
			if (c.getNome().equals(nome)) {
				c.setTelefone(telefone);
				return true;
			}
		}

		return false;
	}

	public Boolean Excluir(String nome) {
		for (Contato c : this) {
			if (c.getNome().equals(nome)) {
				this.remove(c);
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		String result = "";

		for (Contato c : this) {
			result += c.toString() + "\n";
		}

		return result;
	}
}
