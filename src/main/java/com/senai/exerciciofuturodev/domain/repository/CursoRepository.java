package com.senai.exerciciofuturodev.domain.repository;

import com.senai.exerciciofuturodev.domain.model.ClientModel;
import com.senai.exerciciofuturodev.domain.model.CursoModel;
import com.senai.exerciciofuturodev.domain.model.EnderecoModel;
import com.senai.exerciciofuturodev.rest.dto.CursoDto;
import com.senai.exerciciofuturodev.rest.dto.UsuarioDto;
import org.springframework.stereotype.Repository;

@Repository
public class CursoRepository {

    public void salvarCurso(CursoModel cursoModel) {
        var insertTable = "insert into curso (titulo) values ()";
        System.out.println("O curso " + cursoModel.getTitulo() + " foi salvo con sucesso!");
    }

    public CursoDto getCurso(Integer id) {
        var selectCursos = "SELECT titulo FROM CURSOS where id = :id";
        CursoDto cursoDtoRetornadoDoSql = new CursoDto();
        cursoDtoRetornadoDoSql.setTitulo("Novo Curso");
        return cursoDtoRetornadoDoSql;
    }
}
