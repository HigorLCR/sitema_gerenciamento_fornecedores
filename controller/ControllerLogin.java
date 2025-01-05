package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Usuario;
import view.CadastroGUI;
import view.LoginGUI;
 
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
				if(Usuario.validacao(loginView.getLogin(), loginView.getSenha())) {
					loginView.dispose();
					Fornecedor modelForn = new Fornecedor();
					CadastroGUI cadastroView = new CadastroGUI();
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
