package com.orangetalents.desafio.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangetalents.desafio.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
}
