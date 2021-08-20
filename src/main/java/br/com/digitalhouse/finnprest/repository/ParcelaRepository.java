package br.com.digitalhouse.finnprest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.digitalhouse.finnprest.model.Parcela;

public interface ParcelaRepository extends JpaRepository<Parcela, Integer>{
	
	List<Parcela> findAllByParcelaId(Integer id);
}
