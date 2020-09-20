package com.example.numbers;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;
        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot)){
                return true;
            }else{
                return false;
            }
        }
        public boolean isTriangular(){
            int x = 1;
            int trianglenum = 1;
            while (trianglenum < number){
                x++;
                trianglenum = trianglenum + x;
            }
            if(trianglenum == number) {
                return true;
            } else {
                return false;
            }

        }


    }

    public void CheckNumber(View view){
        EditText Numbertest = (EditText) findViewById(R.id.Numbertest);

        Number Mynumber = new  Number();
        Mynumber.number =Integer.parseInt(Numbertest.getText().toString());
        String message = "";
        if (Mynumber.isSquare()){
            if(Mynumber.isTriangular()){
                message = Mynumber.number + " is both triangle and square";
            }else{
                message = Mynumber.number + "is square but not triangle";
            }
        }else {
            if(Mynumber.isTriangular()){
                message = Mynumber.number + " is triangle but not square";
            }else {
                message = Mynumber.number + "is nighter triangle nor square";
            }
        }
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}