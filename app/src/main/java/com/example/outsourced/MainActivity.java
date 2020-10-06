package com.example.outsourced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tela_de_prestador = (Button) findViewById(R.id.tela_de_prestador);

        tela_de_prestador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.activity_tela_de_login_prestador);

            }
        });
    }

    public void btRegistro(View view) {
        setContentView(R.layout.activity_tela_de_cadastro_prestador);

    }

    public void tela_servico(View view) {
        setContentView(R.layout.activity_tela_de_solicitar);

    }

    public void btnAvanca(View view) {
        setContentView(R.layout.tela_de_login_cliente);
    }

    public void btRegistroClient(View view) {
        setContentView(R.layout.tela_de_cadastro_cliente);
    }

    public void btLoginClient(View view) {
        setContentView(R.layout.activity_tela_maps);
    }

    public void ConfirmarCadastro (View view) {
        setContentView(R.layout.activity_perfil);

    }
}
