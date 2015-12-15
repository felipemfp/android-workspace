package com.example.aula05;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SlaveActivity extends Activity {

	private final String Tag = "Slave";
	private EditText editText1;
	private TextView textView1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slave);

		editText1 = (EditText) findViewById(R.id.editText1);
		textView1 = (TextView) findViewById(R.id.textView1);
		Log.i(Tag, "onCreate");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(Tag, "onStart");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(Tag, "onRestart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(Tag, "onResume");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(Tag, "onPause");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i(Tag, "onStop");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(Tag, "onDestroy");
	}

	public void button1Click(View v) {
		textView1.setText(editText1.getText().toString() + "\n"
				+ textView1.getText().toString());
	}

	public void button2Click(View v) {
		Intent i = new Intent();
		i.putExtra("ret", textView1.getText().toString());
		setResult(RESULT_OK, i);
		finish();
	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(savedInstanceState);
		savedInstanceState.putCharSequence("texto", textView1.getText()
				.toString());
		Log.i(Tag, "onSaveInstanceState");
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
		textView1.setText(savedInstanceState.getCharSequence("texto"));
		Log.i(Tag, "onRestoreInstanceState");
	}
}
