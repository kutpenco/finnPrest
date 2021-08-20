package br.com.digitalhouse.finnprest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.digitalhouse.finnprest.model.Proposta;

public interface PropostaRepository extends JpaRepository<Proposta, Integer>{
	
	List<Proposta> findAllByPropostaId(Integer id);
	
}
