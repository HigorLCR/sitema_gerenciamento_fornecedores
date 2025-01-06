package model;

import java.util.regex.Pattern;
import java.util.Map;
import java.util.HashMap;

public class Fornecedor {
	private String cnpj;
	private String nome;
	private String logradouro;
	private String numero;
	private String cidade;
	private String estado;
	private String telefone;

	public Fornecedor(String cnpj, String nome, String logradouro, String numero, String cidade, String estado, String telefone) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
	}
	public Fornecedor() {
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public static Map<String, Boolean> validarDados(
		String cnpj, 
		String nome, 
		String numero,
		String logradouro,
		String cidade,
		String estado,
		String telefone
	) {
		Map<String, Boolean> validacao = new HashMap<>();
		
		validacao.put("cnpj", Boolean.FALSE);
		validacao.put("nome", Boolean.FALSE);
		validacao.put("numero", Boolean.FALSE);
		validacao.put("logradouro", Boolean.FALSE);
		validacao.put("cidade", Boolean.FALSE);
		validacao.put("estado", Boolean.FALSE);
		validacao.put("telefone", Boolean.FALSE);
		
		if (Pattern.matches("^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$", cnpj)) {
			validacao.put("cnpj", Boolean.TRUE);
		}
		if (!nome.isBlank()) {
			validacao.put("nome", Boolean.TRUE);
		}
		if (Pattern.matches("^[0-9]+$", numero)) {
			validacao.put("numero", Boolean.TRUE);
		}
		if (!logradouro.isBlank()) {
			validacao.put("logradouro", Boolean.TRUE);
		}
		if (!cidade.isBlank()) {
			validacao.put("cidade", Boolean.TRUE);
		}
		if (!estado.isBlank()) {
			validacao.put("estado", Boolean.TRUE);
		}
		if (Pattern.matches("^[0-9]+$", telefone)) {
			validacao.put("telefone", Boolean.TRUE);
		}
		
		return validacao;
	}
}
