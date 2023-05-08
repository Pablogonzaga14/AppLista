package devandroid.vk.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.vk.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {
        Log.d("Controller","Controller Iniciado");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("Controller","Salvo"+pessoa.toString());

    }
}
