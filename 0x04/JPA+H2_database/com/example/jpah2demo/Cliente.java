package com.example.jpah2demo;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {
	@Id
	private Long id;
	private String nome;
	private String idade;
	private String email;
	@OneToMany
	private List<Telefone> listaTelefones;
	@OneToMany
	private List<Endereco> listaEnderecos;
	
	public Cliente() {
		
	}
	
	public Cliente(Long id, String nome, String idade, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getListaTelefones() {
		return listaTelefones;
	}

	public void setListaTelefones(List<Telefone> listaTelefones) {
		this.listaTelefones = listaTelefones;
	}

	public List<Endereco> getListaEnderecos() {
		return listaEnderecos;
	}

	public void setListaEnderecos(List<Endereco> listaEnderecos) {
		this.listaEnderecos = listaEnderecos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, idade, listaEnderecos, listaTelefones, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(idade, other.idade)
				&& Objects.equals(listaEnderecos, other.listaEnderecos)
				&& Objects.equals(listaTelefones, other.listaTelefones) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", email=" + email + ", listaTelefones="
				+ listaTelefones + ", listaEnderecos=" + listaEnderecos + "]";
	}

	
	
	
	
}
