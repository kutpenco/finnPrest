package br.com.digitalhouse.finnprest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.digitalhouse.finnprest.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	List<Cliente> findAllByClientId(Integer id);
}
