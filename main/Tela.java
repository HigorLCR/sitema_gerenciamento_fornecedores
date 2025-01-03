package main;

import controller.ControllerLogin;
import model.Usuario;
import view.LoginGUI;

public class Tela {

	public static void main(String[] args) {
		//CadastroUsuarioGUI();
		Usuario model = new Usuario();
		LoginGUI logGUI = new LoginGUI();
		ControllerLogin controller = new ControllerLogin(model, logGUI);
		logGUI.setVisible(true);
	}

}
