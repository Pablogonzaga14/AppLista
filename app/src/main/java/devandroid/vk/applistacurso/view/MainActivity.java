package devandroid.vk.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.vk.applistacurso.R;
import devandroid.vk.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;
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

        dadosPessoa = "Primeiro Nome ";
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

        Log.i("POOAndroid","Objeto pessoa: "+pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: "+outraPessoa.toString());













    }
}