package model;

import java.util.regex.Pattern;
import java.util.Map;
import java.util.HashMap;

public class Fornecedor {
	private int cnpj;
	private String nome;
	private String logradouro;
	private int numero;
	private String cidade;
	private String estado;
	private int telefone;

	public Fornecedor(int cnpj, String nome, String logradouro, int numero, String cidade, String estado,
			int telefone) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
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
		
		return validacao;
	}
}
