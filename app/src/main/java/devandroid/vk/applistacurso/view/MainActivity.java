package devandroid.vk.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.vk.applistacurso.R;
import devandroid.vk.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

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

        pessoa = new Pessoa();
        // Atribuir contrudo, dados, valores ao objeto.  Conforme o modelo, Template
        pessoa.setPrimeiroNome("Pablo");
        pessoa.setSobrenome("Gonzaga");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("21965329540");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobrenome("Alvez");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("11998877445");

        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtCurso = findViewById(R.id.txtCurso);
        txtContato = findViewById(R.id.txtContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        txtNome.setText(pessoa.getPrimeiroNome());
        txtSobrenome.setText(pessoa.getSobrenome());
        txtCurso.setText(pessoa.getCursoDesejado());
        txtContato.setText(pessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNome.setText("");
                txtSobrenome.setText("");
                txtCurso.setText("");
                txtContato.setText("");
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
                pessoa.setCursoDesejado(txtCurso.getText().toString());
                Toast.makeText(MainActivity.this, "Salvo "+pessoa.toString(), Toast.LENGTH_LONG ).show();

            }
        });


        /*dadosPessoa = "Primeiro Nome ";
        dadosPessoa +=  pessoa.getPrimeiroNome();
        dadosPessoa += "Sobrenome ";
        dadosPessoa +=  pessoa.getSobrenome();
        dadosPessoa += "Curso desejado ";
        dadosPessoa +=  pessoa.getCursoDesejado();
        dadosPessoa += "Telefone de contato ";
        dadosPessoa +=  pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro Nome ";
        dadosOutraPessoa +=  outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += "Sobrenome ";
        dadosOutraPessoa +=  outraPessoa.getSobrenome();
        dadosOutraPessoa += "Curso desejado ";
        dadosOutraPessoa +=  outraPessoa.getCursoDesejado();
        dadosOutraPessoa += "Telefone de contato ";
        dadosOutraPessoa +=  outraPessoa.getTelefoneContato();

         */

        Log.i("POOAndroid","Objeto pessoa: "+pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: "+outraPessoa.toString());













    }
}