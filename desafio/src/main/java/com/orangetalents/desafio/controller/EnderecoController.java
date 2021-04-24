package com.orangetalents.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orangetalents.desafio.model.Endereco;
import com.orangetalents.desafio.repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository repository;
	
	@PostMapping
	public ResponseEntity<Endereco> post (@RequestBody Endereco endereco){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(endereco));
	}

}
