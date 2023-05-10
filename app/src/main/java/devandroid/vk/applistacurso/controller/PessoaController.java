package devandroid.vk.applistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.vk.applistacurso.model.Pessoa;
import devandroid.vk.applistacurso.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity){
        preferences =
                mainActivity.getSharedPreferences(NOME_PREFERENCES,0);
        listaVip = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("Controller","Controller Iniciado");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("Controller","Salvo"+pessoa.toString());

        listaVip.putString("primeironome", pessoa.getPrimeiroNome());
        listaVip.putString("sobrenome", pessoa.getSobrenome());
        listaVip.putString("nomeCurso", pessoa.getCursoDesejado());
        listaVip.putString("telefone_de_contato", pessoa.getTelefoneContato());
        listaVip.apply();

    }

    public Pessoa buscar(Pessoa pessoa){

        pessoa.setPrimeiroNome(preferences.getString("primeironome", "NA"));
        pessoa.setSobrenome(preferences.getString("sobrenome", "NA"));
        pessoa.setCursoDesejado(preferences.getString("nomeCurso", "NA"));
        pessoa.setTelefoneContato(preferences.getString("telefone_de_contato", "NA"));

        return pessoa;

    }
    public void limpar(){

        listaVip.clear();
        listaVip.apply();

    };
}