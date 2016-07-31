package com.example.harshit009.calculatorbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText editTextOne,editTextTwo;
 TextView textView;
    String firstNumberString,secondNumberString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextOne=(EditText)findViewById(R.id.editText_FirstNumber);
        editTextTwo=(EditText)findViewById( R.id.editText_SecondNumber);
        textView=(TextView)findViewById(R.id.text_view);

    }
    public void addTwoNumbers(View view){
     firstNumberString=editTextOne.getText().toString();
        secondNumberString=editTextTwo.getText().toString();
      int num1=Integer.parseInt(firstNumberString);
        int num2=Integer.parseInt(secondNumberString);
        int sum=num1+num2;
        textView.setText(""+sum);
    }

    public void subtractTwoNumbers(View view)
    {
        firstNumberString=editTextOne.getText().toString();
        secondNumberString=editTextTwo.getText().toString();
        int num1=Integer.parseInt(firstNumberString);
        int num2=Integer.parseInt(secondNumberString);
        int subtract=num1-num2;
        textView.setText(""+subtract);

    }
    public void multiplyTwoNumbers(View view)
    {
        firstNumberString=editTextOne.getText().toString();
        secondNumberString=editTextTwo.getText().toString();
        int num1=Integer.parseInt(firstNumberString);
        int num2=Integer.parseInt(secondNumberString);
        int multiply=num1*num2;
        textView.setText(""+multiply);

    }
    public void divideTwoNumbers(View view)
    {
        firstNumberString=editTextOne.getText().toString();
        secondNumberString=editTextTwo.getText().toString();
        int num1=Integer.parseInt(firstNumberString);
        int num2=Integer.parseInt(secondNumberString);
        int div=num1/num2;
        textView.setText(""+div);

    }
}
