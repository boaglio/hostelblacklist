package com.boaglio.hb.type;

/**
 * Mensagens de retorno do REST
 *
 * @author Fernando Boaglio
 */
public enum RetornoREST {

	sucesso(0,"sucesso"),
	registroNaoEncontrado(-1,"registro nao encontrado"),
	registroNaoAtualizado(-2,"registro nao atualizado"),
	registroNaoRemovido(-3,"registro nao removido"),
	arquivoNaoEncontrado(-4,"arquivo nao encontrado"),
	documentoInvalidoParaAssinar(-5,"documento invalido para assinar digitalmente"),
	erroNoProcessamento(-6,"erro no processamento"),
	erroInesperado(-99,"erro inesperado");

	RetornoREST(int codigo,String mensagem) {
		this.codigo = codigo;
		this.mensagem = mensagem;
	}

	private int codigo;
	private String mensagem;

	public int codigo() {
		return codigo;
	}

	public String mensagem() {
		return mensagem;
	}

}
