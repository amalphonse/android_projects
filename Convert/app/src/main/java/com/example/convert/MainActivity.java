package com.example.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    Button button;
    TextView tv1,tv2,tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText)findViewById(R.id.txtNumber1);
        button = (Button)findViewById(R.id.btnAdd);
        tv1 = (TextView)findViewById(R.id.textView1);
        tv2  = (TextView)findViewById(R.id.textView2);
        tv_result = (TextView)findViewById(R.id.txtResult);
    }

    public void  convert(View view){
        BigInteger i = BigInteger.parseInt(edit1.getText().toString());
        BigInteger sum = divide(i,2.2);
        tv_result.setText(" The sum of numbers is " + Double.toString(sum));
        tv_result.setVisibility(TextView.VISIBLE);
    }
}

