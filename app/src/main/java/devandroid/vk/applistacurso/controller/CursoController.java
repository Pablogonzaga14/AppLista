package devandroid.vk.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.vk.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListadeCursos() {

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("HTML"));
        listCursos.add(new Curso("C#"));
        listCursos.add(new Curso("Python"));
        listCursos.add(new Curso("PHP"));

        return listCursos;
    }
    public ArrayList<String> dadosParaSpinner() {
        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListadeCursos().size(); i++){
            Curso objeto = (Curso) getListadeCursos().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());
        }
        return dados;
    }
}
