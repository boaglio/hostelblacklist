package com.boaglio.hb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hospede")
public class Hospede {

	@Id
	private String id;

	@TextIndexed(weight = 3)
	private String nome;

	@TextIndexed
	private String rg;

	@TextIndexed
	private String cpf;

	@TextIndexed
	private String cidadeOrigem;

	@TextIndexed
	private String paisOrigem;

	@TextIndexed
	private Date ultimaOcorrencia;

	@TextIndexed
	private List<String> tags;

	@TextIndexed(weight = 2)
	private List<Ocorrencia> ocorrencias = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public Date getUltimaOcorrencia() {
		return ultimaOcorrencia;
	}

	public void setUltimaOcorrencia(Date ultimaOcorrencia) {
		this.ultimaOcorrencia = ultimaOcorrencia;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

}
