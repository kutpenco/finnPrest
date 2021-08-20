package br.com.digitalhouse.finnprest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.finnprest.service.EmprestimoService;

@RestController
@RequestMapping("emprestimo/")
public class EmprestimoController {
	
	private EmprestimoService emprestimoService;

	public EmprestimoController(EmprestimoService emprestimoService) {
		this.emprestimoService = emprestimoService;
	}
	
	@GetMapping("consultar/{id}")
	public ResponseEntity<?> consultarContratos(@PathVariable Integer id){
		consulta = emprestimoService.buscaConsulta(id);
		return ResponseEntity.ok(consulta);
	}
	
	@GetMapping("consultar")
	public ResponseEntity<?> consultarContratos(@RequestBody ConsultarEmprestimosDto consulta){
		
		return ResponseEntity.ok(consulta);
	}
 	
	@PostMapping("contratar")
	
	
	@PostMapping("validar/{id}")
	
	
	
}
