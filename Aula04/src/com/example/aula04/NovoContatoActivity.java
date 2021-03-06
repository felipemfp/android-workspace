package com.example.aula04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NovoContatoActivity extends Activity {
	private Button btnInserir;
	private Button btnCancelar;
	private EditText editNome;
	private EditText editTelefone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_novo_contato);

		btnInserir = (Button) findViewById(R.id.nc_btnInserir);
		btnCancelar = (Button) findViewById(R.id.nc_btnCancelar);

		editNome = (EditText) findViewById(R.id.nc_editNome);
		editTelefone = (EditText) findViewById(R.id.nc_editTelefone);
	}

	public void buttonClick(View v) {
		if (v == btnInserir) {
			Intent ret = new Intent();
			String nome = editNome.getText().toString();
			String telefone = editTelefone.getText().toString();
			ret.putExtra("nome", nome);
			ret.putExtra("telefone", telefone);
			setResult(RESULT_OK, ret);
			finish();
		} else if (v == btnCancelar) {
			setResult(RESULT_CANCELED);
			finish();
		}
	}
}
