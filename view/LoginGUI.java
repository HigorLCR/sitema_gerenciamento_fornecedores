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

public class LoginGUI extends JFrame {
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JTextField loginField;
	private JPasswordField senhaField;
	private JButton btnLimpar;
	private JButton btnEntrar;
	private JPanel contentPane;
	
	public LoginGUI() {
		setTitle("LOGIN");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
		Font fonte = new Font("Tahoma", Font.PLAIN, 14);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblLogin = new JLabel("Login");
		lblLogin.setFont(fonte);
		lblLogin.setBounds(30, 27, 48, 22);
		
		lblSenha = new JLabel("Senha\n");
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
	public void setSenha(String l) {
		this.senhaField.setText(l);
	}
	
	public void limpar(ActionListener ouvirLimpar) {
		btnLimpar.addActionListener(ouvirLimpar);		
	}
	public void addOuvinteLogin(ActionListener ouvirEntrar) {
		btnEntrar.addActionListener(ouvirEntrar);
	}	
}