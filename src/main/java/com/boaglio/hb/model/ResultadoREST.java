package com.boaglio.hb.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class ResultadoREST {

	private int codigo;
	private String mensagem;
	private long timestamp;
	private long documentoID;
	private String documentoIDstr;

	public ResultadoREST(int codigo,String mensagemRetorno) {
		this.codigo = codigo;
		this.mensagem = mensagemRetorno;
		this.timestamp = System.currentTimeMillis();
	}

	public ResultadoREST(int codigo,String mensagemRetorno,long documentoID) {
		this.codigo = codigo;
		this.mensagem = mensagemRetorno;
		this.documentoID = documentoID;
		this.timestamp = System.currentTimeMillis();
	}

	public ResultadoREST(int codigo,String mensagemRetorno,String documentoID) {
		this.codigo = codigo;
		this.mensagem = mensagemRetorno;
		this.documentoIDstr = documentoID;
		this.timestamp = System.currentTimeMillis();
	}

	public ResultadoREST(String mensagemRetorno,boolean comErro) {
		if (comErro) {
			this.timestamp = System.currentTimeMillis();
		}
		this.mensagem = mensagemRetorno;
	}

	public ResultadoREST() {
		this.timestamp = System.currentTimeMillis();
	}

	public long getCodigo() {
		return codigo;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public long getDocumentoID() {
		return documentoID;
	}

	public void setDocumentoID(long documentoID) {
		this.documentoID = documentoID;
	}

	public String getDocumentoIDstr() {
		return documentoIDstr;
	}

	public void setDocumentoIDstr(String documentoIDstr) {
		this.documentoIDstr = documentoIDstr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true; }
		if (obj == null) { return false; }
		if (getClass() != obj.getClass()) { return false; }
		ResultadoREST other = (ResultadoREST) obj;
		if (codigo != other.codigo) { return false; }
		return true;
	}

	@Override
	public String toString() {
		return "ResultadoREST [codigo=" + codigo + ", mensagem=" + mensagem + "]";
	}

}
