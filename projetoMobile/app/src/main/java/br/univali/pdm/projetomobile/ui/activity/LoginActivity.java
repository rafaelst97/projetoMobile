package br.univali.pdm.projetomobile.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.univali.pdm.projetomobile.R;
import br.univali.pdm.projetomobile.ui.activity.br.univali.pdm.projetomobile.ui.model.Usuario;

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
        
        Button botaoLogin = findViewById(R.id.login_botao_logar);
        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Realize seu Cadastro", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        
        Button botaoLogin = findViewById(R.id.login_botao_logar);
        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario user = new Usuario();
                EditText inputSenha = findViewById(R.id.login_senha);
                EditText inputEmail = findViewById(R.id.login_email);
                
                if (inputEmail.getText().toString().equals(user.getEmail()) && inputSenha.getText().toString().equals(user.getSenha())){
                    Toast.makeText(LoginActivity.this, "Acesso Permitido!", Toast.LENGTH_SHORT).show();    
                }else{
                    Toast.makeText(LoginActivity.this, "Acesso Negado!", Toast.LENGTH_SHORT).show();
                }
                
                
                
            }
        });
    }
}