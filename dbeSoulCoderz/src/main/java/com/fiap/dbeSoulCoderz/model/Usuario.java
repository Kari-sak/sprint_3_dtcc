package com.fiap.dbeSoulCoderz.model;

import com.fiap.dbeSoulCoderz.dto.DadosRequisicaoUsuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Usuario")
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idUsuario;
	private String nomeUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private String telefoneUsuario;
	private String cpfUsuario;
	private boolean ativoUsuario;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(Long idUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario, String telefoneUsuario,
			String cpfUsuario, boolean ativoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.telefoneUsuario = telefoneUsuario;
		this.cpfUsuario = cpfUsuario;
		this.ativoUsuario = ativoUsuario;
	}
	
	

	public Usuario(DadosRequisicaoUsuario requisicao) {
		super();
		this.nomeUsuario = requisicao.nomeUsuario();
		this.emailUsuario = requisicao.emailUsuario();
		this.senhaUsuario = requisicao.senhaUsuario();
		this.telefoneUsuario = requisicao.telefoneUsuario();
		this.cpfUsuario = requisicao.cpfUsuario();
		this.ativoUsuario = true;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getEmailUsuario() {
		return emailUsuario;
	}
	
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	public String getTelefoneUsuario() {
		return telefoneUsuario;
	}
	
	public void setTelefoneUsuario(String telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}
	
	public String getCpfUsuario() {
		return cpfUsuario;
	}
	
	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}
	
	public boolean isAtivoUsuario() {
		return ativoUsuario;
	}
	
	public void setAtivoUsuario(boolean ativoUsuario) {
		this.ativoUsuario = ativoUsuario;
	}
	
	
	
}
