package main;

import controller.ControllerLogin;
import controller.ControllerCadastro;
import model.Usuario;
import view.CadastroGUI;
import view.LoginGUI;

public class Tela {

	public static void main(String[] args) {
		//CadastroUsuarioGUI();
		Usuario model = new Usuario();
		LoginGUI logGUI = new LoginGUI();
		CadastroGUI cadGUI = new CadastroGUI();
		new ControllerLogin(model, logGUI, cadGUI);
		new ControllerCadastro(cadGUI);
		logGUI.setVisible(true);
	}

}
