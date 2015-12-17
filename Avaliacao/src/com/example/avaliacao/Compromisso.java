package com.example.avaliacao;

import java.util.HashMap;

public class Compromisso {
	private String _assunto;
	private String _local;
	private String _data;
	
	public Compromisso(String assunto, String local, String data) {
		set_assunto(assunto);
		set_local(local);
		set_data(data);
	}

	public String get_assunto() {
		return _assunto;
	}

	public void set_assunto(String _assunto) {
		this._assunto = _assunto;
	}

	public String get_local() {
		return _local;
	}

	public void set_local(String _local) {
		this._local = _local;
	}

	public String get_data() {
		return _data;
	}

	public void set_data(String _data) {
		this._data = _data;
	}
	
	public HashMap<String, String> get_map() {
		HashMap<String, String> item = new HashMap<String, String>();
		item.put("assunto", get_assunto());
		item.put("local", get_local());
		item.put("data", get_data());
		return item;
	}
			
}
