package com.orangetalents.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orangetalents.desafio.model.Usuario;
import com.orangetalents.desafio.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/cpf/{cpf}")
	public ResponseEntity<List<Usuario>> getByName(@PathVariable String cpf){
		return ResponseEntity.ok(repository.findAllByCpf(cpf));
	}
	
	@PostMapping
	public ResponseEntity<Usuario> post (@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
	}

}
