package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.ControllerLogin.OuvinteLogin;
import model.Fornecedor;
import model.Usuario;
import view.FornecedorGUI;
import view.LoginGUI;
 
/**
 * Controle da tela de login.
 * 
 * @see Usuario
 * @see LoginGUI
 * @see Fornecedor
 * @see FornecedorGUI
 * @see ControllerFornecedor
 * 
 * @author Bruna Assayag
 * @author Heitor ???
 */

public class ControllerLogin {
	private Usuario model;
	private LoginGUI loginView;
	
	public ControllerLogin(Usuario model, LoginGUI logView) {
		this.model = model;
		this.loginView = logView;
		
		this.loginView.limpar(new OuvinteLogin());
		this.loginView.entrar(new OuvinteLogin());
	}
	
	class OuvinteLogin implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//BOTÃO ENTRAR
			if(e.getActionCommand()=="ENTRAR") {
				if(model.validacao(loginView.getLogin(), loginView.getSenha())) {
					loginView.dispose();
					Fornecedor modelForn = new Fornecedor();
					FornecedorGUI cadastroView = new FornecedorGUI();
					ControllerFornecedor controller = new ControllerFornecedor(modelForn, cadastroView);
					cadastroView.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(loginView, "Login ou senha inválidos!");					
				}
			}
			
			//BOTÃO LIMPAR
			else if(e.getActionCommand()=="LIMPAR") {
				loginView.setLogin("");
				loginView.setSenha("");
			}
		}
		
	}

}