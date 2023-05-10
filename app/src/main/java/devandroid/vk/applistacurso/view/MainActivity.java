package devandroid.vk.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.vk.applistacurso.R;
import devandroid.vk.applistacurso.controller.PessoaController;
import devandroid.vk.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    PessoaController controller;

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    EditText txtNome;
    EditText txtSobrenome;
    EditText txtCurso;
    EditText txtContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    //teste pra essa porra
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new PessoaController(MainActivity.this);
        controller.toString();

        pessoa = new Pessoa();
        controller.buscar(pessoa);
        // Atribuir contrudo, dados, valores ao objeto.  Conforme o modelo, Template


        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtCurso = findViewById(R.id.txtCurso);
        txtContato = findViewById(R.id.txtContato);

        txtNome.setText(pessoa.getPrimeiroNome());
        txtSobrenome.setText(pessoa.getSobrenome());
        txtCurso.setText(pessoa.getCursoDesejado());
        txtContato.setText(pessoa.getTelefoneContato());

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNome.setText("");
                txtSobrenome.setText("");
                txtCurso.setText("");
                txtContato.setText("");

                controller.limpar();
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Volte sempre", Toast.LENGTH_LONG ).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(txtNome.getText().toString());
                pessoa.setSobrenome(txtSobrenome.getText().toString());
                pessoa.setCursoDesejado(txtCurso.getText().toString());
                pessoa.setTelefoneContato(txtContato.getText().toString());
                Toast.makeText(MainActivity.this, "Salvo "+pessoa.toString(), Toast.LENGTH_LONG ).show();

                controller.salvar(pessoa);
            }
        });

        Log.i("POOAndroid","Objeto pessoa: "+pessoa.toString());
    }
}