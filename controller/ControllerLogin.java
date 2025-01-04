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
	private CadastroGUI cadastroView;
	
	public ControllerLogin(Usuario model, LoginGUI logView, CadastroGUI cadView) {
		this.model = model;
		this.loginView = logView;
		this.cadastroView = cadView;
		
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
