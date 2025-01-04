package view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCnpj;
	private JLabel lblNome;
	private JLabel lblLograd;
	private JLabel lblNum;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JLabel lblTel;
	private JTextField cnpjField;
	private JTextField nomeField;
	private JTextField logradField;
	private JTextField numField;
	private JTextField cidadeField;
	private JComboBox<String> cmdEstado;
	private JTextField telField;
	private JButton btnLimpar;
	private JButton btnEnviar;
	
	public CadastroGUI() {
		setTitle("Cadastro de Fornecedor");
		setSize(500,530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
		Font fonte = new Font("Tahoma", Font.PLAIN, 14);

		lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(fonte);
		lblCnpj.setBounds(30, 27, 300, 22);
		
		cnpjField = new JTextField();
		cnpjField.setBounds(30, 55, 300, 25);
		cnpjField.setColumns(10);

		lblNome = new JLabel("NOME");
		lblNome.setFont(fonte);
		lblNome.setBounds(30, 91, 300, 22);

		nomeField = new JTextField();
		nomeField.setBounds(30, 119, 300, 25);
		nomeField.setColumns(10);

		lblLograd = new JLabel("LOGRADOURO");
		lblLograd.setFont(fonte);
		lblLograd.setBounds(30, 155, 300, 22);

		logradField = new JTextField();
		logradField.setBounds(30, 183, 300, 25);
		logradField.setColumns(10);
		
		lblNum = new JLabel("NÚMERO");
		lblNum.setFont(fonte);
		lblNum.setBounds(350, 155, 100, 22);

		numField = new JTextField();
		numField.setBounds(350, 183, 100, 25);
		numField.setColumns(10);
		

		lblCidade = new JLabel("CIDADE");
		lblCidade.setFont(fonte);
		lblCidade.setBounds(30, 219, 300, 22);

		cidadeField = new JTextField();
		cidadeField.setBounds(30, 247, 300, 25);
		cidadeField.setColumns(10);
		

		lblEstado = new JLabel("ESTADO");
		lblEstado.setFont(fonte);
		lblEstado.setBounds(30, 283, 300, 22);

		cmdEstado = new JComboBox<String>();
		cmdEstado.setModel(
			new DefaultComboBoxModel<String>(
				new String[] {
					"", 
					"Espírito Santo", 
					"Minas Gerais", 
					"Rio de Janeiro", 
					"São Paulo"
				}
			)
		);
		cmdEstado.setSelectedIndex(0);
		cmdEstado.setFont(fonte);
		cmdEstado.setBounds(30, 309, 300, 25);
		

		lblTel = new JLabel("TELEFONE");
		lblTel.setFont(fonte);
		lblTel.setBounds(30, 347, 300, 22);

		telField = new JTextField();
		telField.setBounds(30, 375, 300, 25);
		telField.setColumns(10);
		

		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBounds(30, 430, 90, 25);

		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBounds(130, 430, 90, 25);

		
		setLayout(null);
		getContentPane().add(lblCnpj);
		getContentPane().add(cnpjField);
		
		getContentPane().add(lblNome);
		getContentPane().add(nomeField);
		
		getContentPane().add(lblLograd);
		getContentPane().add(logradField);
		
		getContentPane().add(lblNum);
		getContentPane().add(numField);
		
		getContentPane().add(lblCidade);
		getContentPane().add(cidadeField);
		
		getContentPane().add(lblEstado);
		getContentPane().add(cmdEstado);
		
		getContentPane().add(lblTel);
		getContentPane().add(telField);

		getContentPane().add(btnLimpar);
		getContentPane().add(btnEnviar);
	}
	
	
	public String getCnpj() {
		return cnpjField.getText();
	}
	public void setCnpj(String cnpj) {
		this.cnpjField.setText(cnpj);
	}

	public String getNome() {
		return nomeField.getText();
	}
	public void setNome(String nome) {
		this.nomeField.setText(nome);
	}
	
	public String getLogradouro() {
		return logradField.getText();
	}
	public void setLogradouro(String lograd) {
		this.logradField.setText(lograd);
	}
	
	public String getNumero() {
		return numField.getText();
	}
	public void setNumero(String lograd) {
		this.numField.setText(lograd);
	}
	
	public String getCidade() {
		return cidadeField.getText();
	}
	public void setCidade(String cidade) {
		this.cidadeField.setText(cidade);
	}
	
	public String getTelefone() {
		return telField.getText();
	}
	public void setTelefone(String tel) {
		this.telField.setText(tel);
	}
	
    public String getEstadoSelecionado() {
        return (String) this.cmdEstado.getSelectedItem();
    }
    public void setEstadoSelecionado(int index) {
        this.cmdEstado.setSelectedIndex(index);
    }
	
	
	public void limpar(ActionListener ouvirLimpar) { //add ouvinte 'limpar'
		btnLimpar.addActionListener(ouvirLimpar);
	}
	public void enviar(ActionListener ouvirEnviar) { //add ouvinte 'enviar'
		btnEnviar.addActionListener(ouvirEnviar);
	}
}
