package com.senai.exerciciofuturodev.domain.service;

import com.senai.exerciciofuturodev.domain.model.AlunoModel;
import com.senai.exerciciofuturodev.domain.repository.AlunoRepository;
import com.senai.exerciciofuturodev.rest.dto.AlunoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public void salvar(AlunoDto alunoDto) {
        AlunoModel alunoModel = new AlunoModel();
        alunoModel.setNome(alunoDto.getNome());
        alunoRepository.salvarAluno(alunoModel);
    }

    public AlunoDto buscarAluno(Integer id) {
        return alunoRepository.getAluno(id);
    }
}
