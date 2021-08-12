package br.com.digitalhouse.finnprest.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private Double salario;
	private Double patrimonio;
	private LocalDate dataNascimento;
	private LocalDate dataAdmissao;
	@Embedded
	private Contato contato;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	public Cliente(String nome, String email, Telefone telefone, Endereco endereco, Double salario, Double patrimonio, LocalDate dataNascimento, LocalDate dataAdmissao) {
		this.nome = nome;
		this.contato = new Contato(email, telefone);
		this.endereco = endereco;
		this.salario = salario;
		this.patrimonio = patrimonio;
		this.dataNascimento = dataNascimento;
		this.dataAdmissao = dataAdmissao;
		
	}

	protected Cliente() {}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return contato.getEmail();
	}

	public String getTelefone() {
		return contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero();
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
}
