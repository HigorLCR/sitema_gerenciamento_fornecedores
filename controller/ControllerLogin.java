package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Usuario;
import view.LoginGUI;
 
public class ControllerLogin {
	private Usuario model;
	private LoginGUI view;
	
	public ControllerLogin(Usuario model, LoginGUI view) {
		this.model = model;
		this.view = view;
		
		this.view.limpar(new OuvinteLogin());
		this.view.entrar(new OuvinteLogin());
	}
	
	class OuvinteLogin implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//BOTÃO ENTRAR
			if(e.getActionCommand()=="ENTRAR") {
				if(model.validacao(view.getLogin(), view.getSenha())) {
					view.dispose();
					//abrir tela de cadastro
				}
				else {
					JOptionPane.showMessageDialog(view, "Login ou senha inválidos!");					
				}
			}
			
			//BOTÃO LIMPAR
			else if(e.getActionCommand()=="LIMPAR") {
				view.setLogin("");
				view.setSenha("");
			}
		}
		
	}

}
