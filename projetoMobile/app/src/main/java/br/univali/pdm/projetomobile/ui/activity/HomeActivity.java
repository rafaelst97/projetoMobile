package br.univali.pdm.projetomobile.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import br.univali.pdm.projetomobile.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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

                Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show();
                
                break;
                
            case R.id.item_perfil:

                Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show();
                
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}