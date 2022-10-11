package com.senai.exerciciofuturodev.rest.controller;

import com.senai.exerciciofuturodev.domain.service.AlunoService;
import com.senai.exerciciofuturodev.rest.dto.AlunoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping("/aluno")
    public String salvarCurso(@RequestBody AlunoDto alunoDto) {
        alunoService.salvar(alunoDto);
        return "Aluno salvo com sucesso!";
    }

    @GetMapping("/aluno")
    public AlunoDto buscarAluno() {
        AlunoDto alunoDtoLocalizadoPeloId = alunoService.buscarAluno(2);
        return alunoDtoLocalizadoPeloId;
    }
}
