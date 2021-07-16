package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Curso;
import com.example.demo.model.Cursos;

@RestController
@RequestMapping("/class")
public class Controller {

	 @GetMapping("{id}")
	 public Curso getCurso(@PathVariable("id") String id) {
		 return new Curso(id,"mate", "5", "01-02-2021");
	 }
	 
	 @RequestMapping("/cursos/{cursoId}")
	    public Cursos getCursos(@PathVariable("cursoId") String userId) {
	    	List<Curso> cursosL = Arrays.asList(
					new Curso("1","mate", "5", "01-01-2021"),
					new Curso("2","mate2", "8", "01-03-2021")
					);
	    	Cursos cursos = new Cursos();
	    	cursos.setCursosList(cursosL);
	    	return cursos;
	    }
}
