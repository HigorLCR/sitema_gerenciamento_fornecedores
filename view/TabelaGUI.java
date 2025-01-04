package view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class TabelaGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;


	/**
	 * Create the frame.
	 */
	public TabelaGUI() {
		setTitle("Tabela de Fornecedores");
		setSize(500,530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		Font fonte = new Font("Tahoma", Font.PLAIN, 14);
		
		
		btnVoltar = new JButton("VOLTAR");
		btnVoltar.setBounds(104, 419, 89, 23);
		
	}
}
