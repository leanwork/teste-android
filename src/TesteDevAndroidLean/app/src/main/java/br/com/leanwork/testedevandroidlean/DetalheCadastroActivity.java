package br.com.leanwork.testedevandroidlean;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class DetalheCadastroActivity extends AppCompatActivity {

    public static String ExtraTipoCadastro = "TipoCadastro";
    public static String ExtraIdCadastro = "IDCadastro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cadastro);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tipoCadastro = extras.getString(ExtraTipoCadastro);
            long idCadastro = extras.getLong(ExtraIdCadastro);

            ((TextView) findViewById(R.id.tvMensagem))
                    .setText("Novo Cadastro de " + tipoCadastro + "!\nBora Exibir os detalhes?");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
