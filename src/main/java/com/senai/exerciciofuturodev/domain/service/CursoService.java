package com.senai.exerciciofuturodev.domain.service;

import com.senai.exerciciofuturodev.domain.model.CursoModel;
import com.senai.exerciciofuturodev.domain.repository.CursoRepository;
import com.senai.exerciciofuturodev.rest.dto.CursoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    public void salvar(CursoDto cursoDto) {
        CursoModel cursoModel = new CursoModel();
        cursoModel.setTitulo(cursoDto.getTitulo());
        cursoRepository.salvarCurso(cursoModel);
    }

    public CursoDto buscarCurso(Integer id) {
        return cursoRepository.getCurso(id);
    }
}
