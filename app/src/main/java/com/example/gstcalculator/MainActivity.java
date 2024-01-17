package com.example.gstcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private TextView display;
    private EditText input1;
    private   EditText input2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        display=findViewById(R.id.display);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
    }
    public void calculate(View view){
        String a=input1.getText().toString();
        String c=input2.getText().toString();
        double e=Double.parseDouble(a);
        double d=Double.parseDouble(c);
        double per=e*d;
        double tot=per/100;
        double gstAmount = tot;
        double total_amount=e+tot;
        String displayText= "GST in Item is : " + gstAmount +"\n" + "The Net Total Amount : "+total_amount;
        display.setText(displayText);
      }
    public void clear(View view)
    {
        input1.setText(" ");
        input2.setText(" ");
        display.setText(" ");
    }
}