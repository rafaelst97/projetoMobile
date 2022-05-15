package br.univali.pdm.projetomobile.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.univali.pdm.projetomobile.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button botaoCadastro = findViewById(R.id.login_cadastro);
        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, CadastroActivity.class));
            }
        });

        Button botaoEsqueciSenha = findViewById(R.id.login_esqueci_senha);
        botaoEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, EsqueciSenhaActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}