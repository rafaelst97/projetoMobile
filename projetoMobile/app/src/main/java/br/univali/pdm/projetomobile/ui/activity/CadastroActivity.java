package br.univali.pdm.projetomobile.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

import br.univali.pdm.projetomobile.R;
import br.univali.pdm.projetomobile.ui.activity.br.univali.pdm.projetomobile.ui.model.Usuario;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button botaoConcluirCadastro = findViewById(R.id.cadastro_concluir);
        EditText insertNome = findViewById(R.id.cadastro_insert_nome);
        EditText insertSobrenome = findViewById(R.id.cadastro_insert_sobrenome);
        EditText insertEmail = findViewById(R.id.cadastro_insert_email);
        EditText insertCpf = findViewById(R.id.cadastro_insert_cpf);
        EditText insertMatricula = findViewById(R.id.cadastro_insert_matricula);
        EditText insertSenha = findViewById(R.id.cadastro_insert_senha);
        EditText insertConfirmacaoSenha = findViewById(R.id.cadastro_insert_confirmacao_senha);
        TextView campoNome = findViewById(R.id.cadastro_nome);
        TextView campoSobrenome = findViewById(R.id.cadastro_sobrenome);
        TextView campoEmail = findViewById(R.id.cadastro_email);
        TextView campoCpf = findViewById(R.id.cadastro_cpf);
        TextView campoMatricula = findViewById(R.id.cadastro_matricula);
        TextView campoSenha = findViewById(R.id.cadastro_senha);
        TextView campoConfirmacaoSenha = findViewById(R.id.cadastro_confirmacao_senha);

        botaoConcluirCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean validacaoCampos = true;
                boolean senhaValida = false;

                ArrayList<String> camposVazios = new ArrayList<String>();
                ArrayList<EditText> inserts = new ArrayList<EditText>();
                ArrayList<TextView> campos = new ArrayList<TextView>();
                Collections.addAll(inserts, insertNome, insertSobrenome, insertEmail, insertCpf, insertMatricula, insertSenha, insertConfirmacaoSenha);
                Collections.addAll(campos, campoNome, campoSobrenome, campoEmail, campoCpf, campoMatricula, campoSenha, campoConfirmacaoSenha);

                for(int i= 0; i < inserts.size(); i++){
                    if (TextUtils.isEmpty(inserts.get(i).getText().toString())){
                        camposVazios.add(campos.get(i).getText().toString());
                        validacaoCampos = false;
                    }
                }

                if (camposVazios.size() > 0) {
                    Toast.makeText(CadastroActivity.this, camposVazios.toString(), Toast.LENGTH_SHORT).show();
                }else if (insertSenha.getText().toString().equals(insertConfirmacaoSenha.getText().toString())){
                    senhaValida = true;
                }

                if (validacaoCampos == true && senhaValida == true){
                    Usuario user = new Usuario(insertEmail.getText().toString(), insertSenha.getText().toString());
                    finish();
                }else if (senhaValida == false){
                    Toast.makeText(CadastroActivity.this, "Senhas não conferem", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}