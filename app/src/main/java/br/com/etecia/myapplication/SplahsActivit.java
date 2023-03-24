package br.com.etecia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplahsActivit extends AppCompatActivity {
    //declarando o objeto
    Button btnAbrirLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splahs_layout);
        //apresemtando oxml para o jave
        btnAbrirLogin = findViewById(R.id.btnAbrirLogin);

        //criar a ação de clique no botão
        btnAbrirLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),loginActivity.class));

            }
        });

    }
}