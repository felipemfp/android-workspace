package com.example.aula02;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	private Button btnCalcular;
	private EditText txtBase;
	private EditText txtAltura;
	private EditText txtArea;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        txtBase = (EditText)findViewById(R.id.txtBase);
        txtAltura = (EditText)findViewById(R.id.txtAltura);
        txtArea =(EditText)findViewById(R.id.txtArea);
        
        btnCalcular.setOnClickListener(btnCalcularListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public OnClickListener btnCalcularListener = new OnClickListener(){
    	
    	@Override
    	public void onClick(View v) {
    		double base = Double.parseDouble(txtBase.getText().toString());
    		double altura = Double.parseDouble(txtAltura.getText().toString());
    		double area = base * altura / 2;
    		txtArea.setText(String.format("%f", area));
    	}
    	
    };
    
}
