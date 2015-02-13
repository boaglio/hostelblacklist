package com.boaglio.hb.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Ocorrencia {

	@Id
	private String id;

	private String descricao;

	private Date data;

	private String hostel;

	private List<String> tags;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getHostel() {
		return hostel;
	}

	public void setHostel(String hostel) {
		this.hostel = hostel;
	}

	@Override
	public String toString() {
		return "Ocorrencia [descricao=" + descricao + "]";
	}

}
