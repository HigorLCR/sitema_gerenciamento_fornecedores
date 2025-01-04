package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Fornecedor;
import view.CadastroGUI;

public class ControllerCadastro {
	
	private ArrayList<Fornecedor> fornecedores;
	private CadastroGUI cadastroView;
	
	public ControllerCadastro(CadastroGUI cadView) {
		this.cadastroView = cadView;
		this.fornecedores = new ArrayList<Fornecedor>();
		
		this.cadastroView.limpar(new OuvinteCadastro());
		this.cadastroView.enviar(new OuvinteCadastro());
	}
	
	class OuvinteCadastro implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "ENVIAR") {
				// fazer validação e cadastrar dados
			} else if (e.getActionCommand() == "LIMPAR") {
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
