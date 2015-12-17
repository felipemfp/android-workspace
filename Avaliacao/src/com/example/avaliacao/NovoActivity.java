package com.example.avaliacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.example.avaliacao.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NovoActivity extends Activity {
	private EditText n_assunto;
	private EditText n_local;
	private EditText n_data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_novo);

		n_assunto = (EditText) findViewById(R.id.n_assunto);
		n_local = (EditText) findViewById(R.id.n_local);
		n_data = (EditText) findViewById(R.id.n_data);

		n_data.setText(getData());
	}

	public void btnAdicionarClick(View v) {
		if (validarCompromisso()) {
			Intent data = new Intent();

			data.putExtra("assunto", n_assunto.getText().toString());
			data.putExtra("local", n_local.getText().toString());
			data.putExtra("data", n_data.getText().toString());

			setResult(RESULT_OK, data);

			finish();
		}
	}

	public void btnCancelarClick(View v) {
		setResult(RESULT_CANCELED);
		finish();
	}

	private Boolean validarCompromisso() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setPositiveButton("OK", null);
		builder.setTitle(R.string.app_name);

		if (n_assunto.getText().toString().isEmpty()) {
			builder.setMessage(R.string.infoAssunto);
			AlertDialog dialog = builder.create();
			dialog.show();
			return false;
		}

		if (n_local.getText().toString().isEmpty()) {
			builder.setMessage(R.string.infoLocal);
			AlertDialog dialog = builder.create();
			dialog.show();
			return false;
		}

		if (n_data.getText().toString().isEmpty()) {
			builder.setMessage(R.string.infoData);
			AlertDialog dialog = builder.create();
			dialog.show();
			return false;
		}

		return true;
	}

	private String getData() {
		String format = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.US);
		return String.format("%s", sdf.format(new Date()));
	}
}
