package br.univali.pdm.projetomobile.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.univali.pdm.projetomobile.R;

public class EsqueciSenhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);

        Button botaoRecuperarSenha = findViewById(R.id.esqueci_senha_botao_recuperar);
        botaoRecuperarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EsqueciSenhaActivity.this, "Email enviado com nova senha", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}