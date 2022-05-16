package br.univali.pdm.projetomobile.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import br.univali.pdm.projetomobile.R;
import br.univali.pdm.projetomobile.ui.activity.br.univali.pdm.projetomobile.ui.model.Usuario;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Usuario user = new Usuario();

        TextView perfilNomeUsuario = findViewById(R.id.perfil_nome);
        TextView perfilEmail = findViewById(R.id.perfil_email);
        TextView perfilCpf = findViewById(R.id.perfil_cpf);
        TextView perfilMatricula = findViewById(R.id.perfil_matricula);
        perfilNomeUsuario.setText(user.getNome() + " " + user.getSobrenome());
        perfilEmail.append(user.getEmail());
        perfilCpf.append(user.getCpf());
        perfilMatricula.append(user.getMatricula());
    }
}