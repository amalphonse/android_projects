package com.example.alphy.sum;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    //Declaring  the widgets we are using in this app
    EditText edit1,edit2;
    Button button;
    TextView tv1,tv2,tv3,tv_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Finding views for the widgets based on their id's in the layout xml file.
        edit1 = (EditText)findViewById(R.id.txtNumber1);
        edit2 = (EditText)findViewById(R.id.txtNumber2);
        button = (Button)findViewById(R.id.btnAdd);
        tv1 = (TextView)findViewById(R.id.textView1);
        tv2  = (TextView)findViewById(R.id.textView2);
        tv3 = (TextView)findViewById(R.id.textView3);
        tv_result = (TextView)findViewById(R.id.txtResult);
    }

    //Implementing the onclick method add()
    public void  add(View view){
        int i = Integer.parseInt(edit1.getText().toString());
        int j = Integer.parseInt(edit2 .getText().toString());
        int sum = i +  j;
        tv_result.setText(" The sum of numbers is " + Integer.toString(sum));
        tv_result.setVisibility(TextView.VISIBLE);
    }
}
