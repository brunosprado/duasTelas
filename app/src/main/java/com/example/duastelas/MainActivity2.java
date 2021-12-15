package com.example.duastelas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private Button buttonTela1;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonTela1 = findViewById(R.id.buttonTela1);
        buttonVoltar = findViewById(R.id.buttonVoltar);
        Log.i("Teste","OnCreate acessado | Activity 2");
    }

    public void onClickBotaoTela1(View v) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickBotaoVoltar(View v) {
        finish();
    }
}