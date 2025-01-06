package main;

import controller.ControllerLogin;
import model.Fornecedor;
import model.Usuario;
import view.FornecedorGUI;
import view.LoginGUI;

public class Tela {

	public static void main(String[] args) {
		Usuario model = new Usuario();
		LoginGUI logGUI = new LoginGUI();
		ControllerLogin controller = new ControllerLogin(model, logGUI);
		logGUI.setVisible(true);
		//tabGUI.setVisible(true);
	}

}
