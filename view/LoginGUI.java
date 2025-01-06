package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Interface gráfica da tela de login.
 * 
 * @author Bruna Assayag
 */
public class LoginGUI extends JFrame {
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JTextField loginField;
	private JPasswordField senhaField;
	private JButton btnLimpar;
	private JButton btnEntrar;
	
	public LoginGUI() {
		setTitle("LOGIN");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
		Font fonte = new Font("Tahoma", Font.PLAIN, 14);
				
		lblLogin = new JLabel("Login");
		lblLogin.setFont(fonte);
		lblLogin.setBounds(30, 27, 48, 22);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setFont(fonte);
		lblSenha.setBounds(30, 91, 48, 22);
		
		loginField = new JTextField();
		loginField.setBounds(30, 55, 200, 25);
		loginField.setColumns(10);
		
		senhaField = new JPasswordField();
		senhaField.setBounds(30, 117, 200, 25);
		senhaField.setColumns(10);		
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBounds(30, 170, 90, 25);

		btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(130, 170, 90, 25);
		
		setLayout(null);

		getContentPane().add(lblLogin);
		getContentPane().add(loginField);
				
		getContentPane().add(lblSenha);
		getContentPane().add(senhaField);
		
		getContentPane().add(btnLimpar);
		getContentPane().add(btnEntrar);
	}
	
	public String getLogin() {
		return loginField.getText();
	}
	public void setLogin(String l) {
		this.loginField.setText(l);
	}
	
	public String getSenha() {
		return String.valueOf(senhaField.getPassword());
	}
	public void setSenha(String s) {
		this.senhaField.setText(s);
	}

	 /**
	  * Valida o par de login e senha.
	  * 
	  * @see ControllerLogin
	  * @author    Bruna Assayag
	  */
	public void limpar(ActionListener ouvirLimpar) { //add ouvinte 'limpar'
		btnLimpar.addActionListener(ouvirLimpar);		
	}
	public void entrar(ActionListener ouvirEntrar) { //add ouvinte 'entrar'
		btnEntrar.addActionListener(ouvirEntrar);
	}
}