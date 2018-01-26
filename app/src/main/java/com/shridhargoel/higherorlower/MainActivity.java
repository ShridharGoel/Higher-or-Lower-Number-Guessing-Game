package com.shridhargoel.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int x;
    public void guessNum(View view)
    {


        int num1;

            EditText num=(EditText) findViewById(R.id.typeNum);
            num1=Integer.parseInt(num.getText().toString());
            if(num1<x) {
                Toast.makeText(MainActivity.this, "Go higher", Toast.LENGTH_SHORT).show();
                num.setText("");
            }
            else if(num1>x) {
        Toast.makeText(MainActivity.this, "Go lower", Toast.LENGTH_SHORT).show();
        num.setText("");
    }
            else
            {
                Toast.makeText(MainActivity.this, "Correct guess!\n" +"Now guess a new number!" , Toast.LENGTH_SHORT).show();
                num.setText("");
                Random random=new Random();
                x=random.nextInt(20)+1;
            }



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
         x = random.nextInt(20) + 1;
    }
}
