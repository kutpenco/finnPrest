package br.com.digitalhouse.finnprest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.digitalhouse.finnprest.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Integer>{
	
	List<Conta> findAllByContaId(Integer id);
}
