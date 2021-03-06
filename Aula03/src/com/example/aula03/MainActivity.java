package com.example.aula03;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText txtNome;
	private EditText txtTelefone;
	private Button btnInserir;
	private Button btnEditar;
	private Button btnExcluir;
	private TextView txtAgenda;
	private Contatos agenda;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		agenda = new Contatos();

		txtNome = (EditText) findViewById(R.id.txtNome);
		txtTelefone = (EditText) findViewById(R.id.txtTelefone);
		btnInserir = (Button) findViewById(R.id.btnInserir);
		btnEditar = (Button) findViewById(R.id.btnEditar);
		btnExcluir = (Button) findViewById(R.id.btnExcluir);
		txtAgenda = (TextView) findViewById(R.id.txtAgenda);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void buttonClick(View v) {
		Button btn = (Button) v;
		if (btn == btnInserir) {
			agenda.Inserir(txtNome.getText().toString(), txtTelefone.getText()
					.toString());
			txtAgenda.setText(agenda.toString());
		} else if (btn == btnEditar) {
			if (agenda.Editar(txtNome.getText().toString(), txtTelefone
					.getText().toString())) {
				txtAgenda.setText(agenda.toString());
			}
		} else if (btn == btnExcluir) {
			if (agenda.Excluir(txtNome.getText().toString())) {
				txtAgenda.setText(agenda.toString());
			}
		}
	}
}
