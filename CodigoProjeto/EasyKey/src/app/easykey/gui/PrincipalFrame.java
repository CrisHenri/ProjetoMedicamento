package app.easykey.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import app.easykey.img.BG_IMG;
import app.easykey.img.BTN_CONSULTA;
import app.easykey.img.BTN_GERAR_IMG;
import app.easykey.img.BTN_NEW_SENHA;

import javax.swing.LayoutStyle.ComponentPlacement;

public class PrincipalFrame extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;
	private JPanel panel;
	private JPanel panel_senha;
	private BTN_CONSULTA panel_consulta;
	private BTN_NEW_SENHA panel_nova_senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalFrame frame = new PrincipalFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 570);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane_1 = new BG_IMG();
		setContentPane(contentPane_1);
		
		panel = new JPanel();
		panel_senha = new BTN_GERAR_IMG();
		panel_senha.setBackground(Color.WHITE);
		
		panel_consulta = new BTN_CONSULTA();
		panel_consulta.setBackground(Color.WHITE);
		GroupLayout gl_panel_consulta = new GroupLayout(panel_consulta);
		gl_panel_consulta.setHorizontalGroup(
			gl_panel_consulta.createParallelGroup(Alignment.LEADING)
				.addGap(0, 380, Short.MAX_VALUE)
				.addGap(0, 394, Short.MAX_VALUE)
		);
		gl_panel_consulta.setVerticalGroup(
			gl_panel_consulta.createParallelGroup(Alignment.LEADING)
				.addGap(0, 98, Short.MAX_VALUE)
				.addGap(0, 125, Short.MAX_VALUE)
		);
		panel_consulta.setLayout(gl_panel_consulta);
		
		panel_nova_senha = new BTN_NEW_SENHA();
		panel_nova_senha.setBackground(Color.WHITE);
		GroupLayout gl_panel_nova_senha = new GroupLayout(panel_nova_senha);
		gl_panel_nova_senha.setHorizontalGroup(
			gl_panel_nova_senha.createParallelGroup(Alignment.LEADING)
				.addGap(0, 380, Short.MAX_VALUE)
				.addGap(0, 380, Short.MAX_VALUE)
				.addGap(0, 394, Short.MAX_VALUE)
		);
		gl_panel_nova_senha.setVerticalGroup(
			gl_panel_nova_senha.createParallelGroup(Alignment.LEADING)
				.addGap(0, 98, Short.MAX_VALUE)
				.addGap(0, 98, Short.MAX_VALUE)
				.addGap(0, 125, Short.MAX_VALUE)
		);
		panel_nova_senha.setLayout(gl_panel_nova_senha);
		GroupLayout gl_contentPane = new GroupLayout(contentPane_1);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(755, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_nova_senha, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_consulta, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_senha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(109))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(110)
					.addComponent(panel_senha, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_consulta, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_nova_senha, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(125, Short.MAX_VALUE))
		);
		GroupLayout gl_panel_senha = new GroupLayout(panel_senha);
		gl_panel_senha.setHorizontalGroup(
			gl_panel_senha.createParallelGroup(Alignment.LEADING)
				.addGap(0, 380, Short.MAX_VALUE)
		);
		gl_panel_senha.setVerticalGroup(
			gl_panel_senha.createParallelGroup(Alignment.LEADING)
				.addGap(0, 111, Short.MAX_VALUE)
		);
		panel_senha.setLayout(gl_panel_senha);
		contentPane_1.setLayout(gl_contentPane);
	}
}
