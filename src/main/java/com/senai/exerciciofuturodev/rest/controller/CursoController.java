package com.senai.exerciciofuturodev.rest.controller;

import com.senai.exerciciofuturodev.domain.service.CursoService;
import com.senai.exerciciofuturodev.rest.dto.CursoDto;
import com.senai.exerciciofuturodev.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {

    @Autowired
    CursoService cursoService;

    @PostMapping("/curso")
    public String salvarCurso(@RequestBody CursoDto cursoDto) {
        cursoService.salvar(cursoDto);
        return "Curso salvo com sucesso!";
    }

    @GetMapping("/curso")
    public CursoDto buscarUsuario() {
        CursoDto cursoDtoLocalizadoPeloId = cursoService.buscarCurso(2);
        return cursoDtoLocalizadoPeloId;
    }
}
