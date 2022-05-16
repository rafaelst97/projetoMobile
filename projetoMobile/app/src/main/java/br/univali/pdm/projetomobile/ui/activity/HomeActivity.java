package br.univali.pdm.projetomobile.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.univali.pdm.projetomobile.R;
import br.univali.pdm.projetomobile.ui.fragment.FeedFragment;
import br.univali.pdm.projetomobile.ui.fragment.NoticiasFragment;
import br.univali.pdm.projetomobile.ui.fragment.PrevisaoFragment;

public class HomeActivity extends AppCompatActivity {

    private Button botaoNoticias;
    private Button botaoPrevisao;
    private Button botaoFeed;

    private NoticiasFragment noticiasFragment;
    private FeedFragment feedFragment;
    private PrevisaoFragment previsaoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botaoNoticias = findViewById(R.id.botao_noticias);
        botaoFeed = findViewById(R.id.botao_feed);
        botaoPrevisao = findViewById(R.id.botao_previsao);

        previsaoFragment = new PrevisaoFragment();
        noticiasFragment = new NoticiasFragment();
        feedFragment = new FeedFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.perfil_frame_conteudo, previsaoFragment);
        transaction.commit();

        botaoPrevisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previsaoFragment = new PrevisaoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.perfil_frame_conteudo, previsaoFragment);
                transaction.commit();
            }
        });

        botaoNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noticiasFragment = new NoticiasFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.perfil_frame_conteudo, noticiasFragment);
                transaction.commit();
            }
        });

        botaoFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feedFragment = new FeedFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.perfil_frame_conteudo, feedFragment);
                transaction.commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_configuracoes, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.item_configuracoes:

                startActivity(new Intent(HomeActivity.this, ConfiguracoesActivity.class));
                
                break;
                
            case R.id.item_perfil:

                startActivity(new Intent(HomeActivity.this, PerfilActivity.class));
                
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}