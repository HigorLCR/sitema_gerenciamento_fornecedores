package controller;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Fornecedor;
import view.FornecedorGUI;

/**
 * Um par de login e senha.
 * 
 * @see Fornecedor
 * @see FornecedorGUI
 * @author Bruna Assayag
 */
public class ControllerFornecedor {
	
	private Fornecedor model;
	private FornecedorGUI cadastroView;
	private ArrayList<Fornecedor> fornecedores;
	
	public ControllerFornecedor(Fornecedor model, FornecedorGUI cadView) {
		this.model = model;
		this.cadastroView = cadView;
		this.fornecedores = new ArrayList<Fornecedor>();
		
		this.cadastroView.limpar(new OuvinteCadastro());
		this.cadastroView.enviar(new OuvinteCadastro());
	}
	
	class OuvinteCadastro implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "ENVIAR") {
				String cnpj = cadastroView.getCnpj();
				String nome = cadastroView.getNome();
				String numero = cadastroView.getNumero();
				String logradouro = cadastroView.getLogradouro();
				String cidade = cadastroView.getCidade();
				String estado = cadastroView.getEstadoSelecionado();
				String telefone = cadastroView.getTelefone();
				
				Map<String, Boolean> validacao = Fornecedor.validarDados(
					cnpj, 
					nome, 
					numero, 
					logradouro, 
					cidade, 
					estado, 
					telefone
				);
				
				if(!validacao.get("cnpj").booleanValue())
					JOptionPane.showMessageDialog(cadastroView, "Preencha o CNPJ com 14 dígitos!");
				else if(!validacao.get("nome").booleanValue()) {
					JOptionPane.showMessageDialog(cadastroView, "'Nome' é um campo obrigatório!");
				}
				else if(!validacao.get("numero").booleanValue()) {
					JOptionPane.showMessageDialog(cadastroView, "Apenas números no campo 'Número'");
				}
				else if(!validacao.get("logradouro").booleanValue()) {
					JOptionPane.showMessageDialog(cadastroView, "'Logradouro' é um campo obrigatório!");
				}
				else if(!validacao.get("cidade").booleanValue()) {
					JOptionPane.showMessageDialog(cadastroView, "'Cidade' é um campo obrigatório!");
				}
				else if(!validacao.get("estado").booleanValue()) {
					JOptionPane.showMessageDialog(cadastroView, "Por favor, selecione um estado!");
				}
				else if(!validacao.get("telefone").booleanValue()) {
					JOptionPane.showMessageDialog(cadastroView, "Apenas números no campo 'Telefone'.");
				}
				else {
					Fornecedor novoFornecedor = new Fornecedor(cnpj,nome,logradouro,numero,cidade,estado,telefone);
					fornecedores.add(novoFornecedor);
					cadastroView.adicionarDados(novoFornecedor);
					
					JOptionPane.showMessageDialog(cadastroView, "Fornecedor cadastrado com sucesso!");
				}
				
			}
			else if (e.getActionCommand() == "LIMPAR") {
				cadastroView.setCnpj("");
				cadastroView.setCidade("");
				cadastroView.setNome("");
				cadastroView.setNumero("");
				cadastroView.setLogradouro("");
				cadastroView.setTelefone("");
				cadastroView.setEstadoSelecionado(0);
			}
		}

	}
	

}