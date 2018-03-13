package com.example.talatec.sumaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText varTxtNum1;
    EditText varTxtNum2;
    TextView varTxtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        varTxtNum1 = (EditText) findViewById(R.id.edtxtNum1);
        varTxtNum2 = (EditText) findViewById(R.id.edtxtNum2);
        varTxtResultado = (TextView) findViewById(R.id.txtTotal);
    }

    public void suma(View v){
        int num1 = Integer.parseInt(varTxtNum1.getText().toString());
        int num2 = Integer.parseInt(varTxtNum2.getText().toString());
        int resultado = num1 + num2;
        varTxtResultado.setText("El resultado es: "+resultado);
    }

}
