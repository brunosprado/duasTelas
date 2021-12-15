package com.example.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonTela2;
    private Button buttonFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTela2 = findViewById(R.id.buttonTela2);
        buttonFechar = findViewById(R.id.buttonFechar);
        Log.i("Teste","OnCreate acessado | Activity 1");
    }

    public void onClickBotaoTela2(View v) {

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void onClickBotaoFechar(View v) {
        System.exit(0);
    }
}