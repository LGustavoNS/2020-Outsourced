package com.example.outsourced;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class tela_de_login_prestador extends AppCompatActivity {

    private EditText tLogin, tSenha;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_login_prestador);
        Button btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tLogin = findViewById(R.id.tLogin);
                TextView tSenha = findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                Toast.makeText(getApplicationContext(), "Bem-Vindo" + tLogin, Toast.LENGTH_SHORT).show();
                if (login.equals(tLogin) && senha.equals(tSenha)) {
                    alert("login realizado com sucesso");
                } else {
                    alert("login ou senha incorretos");
                }
            }
        });
    }

    private void alert(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }

}