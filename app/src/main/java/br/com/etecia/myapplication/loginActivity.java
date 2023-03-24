package br.com.etecia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {
    Button btnAbrirSplash

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnAbrirSplash = findViewById(R.id.btnAbrirSplash);

        btnAbrirSplash.setOnClickListener();

    }
}