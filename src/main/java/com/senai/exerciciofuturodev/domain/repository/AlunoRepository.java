package com.senai.exerciciofuturodev.domain.repository;

import com.senai.exerciciofuturodev.domain.model.AlunoModel;
import com.senai.exerciciofuturodev.domain.model.CursoModel;
import com.senai.exerciciofuturodev.rest.dto.AlunoDto;
import com.senai.exerciciofuturodev.rest.dto.CursoDto;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepository {

    public void salvarAluno(AlunoModel alunoModel) {
        var insertTable = "insert into alunos (nome) values ()";
        System.out.println("O aluno " + alunoModel.getNome() + " foi salvo con sucesso!");
    }

    public AlunoDto getAluno(Integer id) {
        var selectAlunos = "SELECT nome FROM ALUNOS where id = :id";
        AlunoDto alunoDtoRetornadoDoSql = new AlunoDto();
        alunoDtoRetornadoDoSql.setNome("Alfredo");
        return alunoDtoRetornadoDoSql;
    }
}
