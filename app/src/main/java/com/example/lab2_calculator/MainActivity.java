package com.example.lab2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String str1 = myTextField1.getText().toString();
        Integer int1= Integer.parseInt(str1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str2 = myTextField2.getText().toString();
        Integer int2= Integer.parseInt(str2);

        String result = Integer.toString(int1+int2);
        goToActivity2(result);
    }

    public void subtractFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String str1 = myTextField1.getText().toString();
        Integer int1= Integer.parseInt(str1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str2 = myTextField2.getText().toString();
        Integer int2= Integer.parseInt(str2);

        String result = Integer.toString(int1-int2);
        goToActivity2(result);
    }

    public void multiplyFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String str1 = myTextField1.getText().toString();
        Integer int1= Integer.parseInt(str1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str2 = myTextField2.getText().toString();
        Integer int2= Integer.parseInt(str2);

        String result = Integer.toString(int1*int2);
        goToActivity2(result);
    }

    public void divideFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String str1 = myTextField1.getText().toString();
        Integer int1= Integer.parseInt(str1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str2 = myTextField2.getText().toString();
        Integer int2= Integer.parseInt(str2);

        String result = Integer.toString(int1/int2);
        goToActivity2(result);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}