 package app.easykey.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.easykey.entidade.TipoSenha;
import app.easykey.img.BG_SELECIONAR_SENHA;
import br.cnec.fcsl.controle.Controle;

import java.awt.Dialog.ModalityType;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;

import javax.swing.border.LineBorder;

public class SelecionarSenha extends JDialog implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6204125811215129901L;
	private JPanel panelPrincipal = new JPanel();
	private JLabel lblFechar;
	private JLabel lblMinimizar;
	private JPanel panelSenhas;
	private JLabel lbl_alto_custo;
	private JLabel lblComum;
	private JLabel lblJudicial;
	private JLabel lblPreferencial;
	private Controle controle= new Controle();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SelecionarSenha dialog = new SelecionarSenha();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SelecionarSenha() {
		setModalityType(ModalityType.TOOLKIT_MODAL);
		setBounds(100, 100, 1132, 570);
		getContentPane().setLayout(new BorderLayout());
		panelPrincipal.setLayout(new FlowLayout());
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal = new BG_SELECIONAR_SENHA();
		panelPrincipal.setBorder(new LineBorder(Color.GRAY));
		setUndecorated(true);
		getContentPane().add(panelPrincipal, BorderLayout.CENTER);
		
		lblFechar = new JLabel("");
		lblFechar.addMouseListener(this);
		lblFechar.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/icon_close.png")));
		
		lblMinimizar = new JLabel("");
		lblMinimizar.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/icon_min.png")));
		
		panelSenhas = new JPanel();
		panelSenhas.setBackground(Color.WHITE);
		GroupLayout gl_panelPrincipal = new GroupLayout(panelPrincipal);
		gl_panelPrincipal.setHorizontalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(976)
					.addComponent(lblMinimizar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(2)
					.addComponent(lblFechar, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
					.addGap(32))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addContainerGap(518, Short.MAX_VALUE)
					.addComponent(panelSenhas, GroupLayout.PREFERRED_SIZE, 604, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panelPrincipal.setVerticalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(17)
							.addComponent(lblMinimizar))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(5)
							.addComponent(lblFechar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(33)
					.addComponent(panelSenhas, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
					.addGap(108))
		);
		panelSenhas.setLayout(new GridLayout(2, 2, 0, 0));
		
		lbl_alto_custo = new JLabel("");
		lbl_alto_custo.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/op_alto_custo.png")));
		panelSenhas.add(lbl_alto_custo);
		
		lblJudicial = new JLabel("");
		lblJudicial.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/op_judicial.png")));
		panelSenhas.add(lblJudicial);
		
		lblComum = new JLabel("");
		lblComum.addMouseListener(this);
		lblComum.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/op_comum.png")));
		panelSenhas.add(lblComum);
		
		lblPreferencial = new JLabel("");
		lblPreferencial.addMouseListener(this);
		lblPreferencial.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/op_preferencial.png")));
		panelSenhas.add(lblPreferencial);
		panelPrincipal.setLayout(gl_panelPrincipal);
	}
	
	

	
	public void mouseEntered(MouseEvent arg0) {
		if (arg0.getSource() == lblComum) {
			do_lblComum_mouseEntered(arg0);
		}
		
		if (arg0.getSource() == lblPreferencial) {
			do_lblPreferencial_mouseEntered(arg0);
		}
		
		if (arg0.getSource() == lblJudicial) {
			do_lblJudicial_mouseEntered(arg0);
		}
		
		if (arg0.getSource() == lblFechar) {
			do_lblFechar_mouseEntered(arg0);
		}
	}
	
	
	protected void do_lblComum_mouseEntered(MouseEvent arg0) {
		lblComum.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/op_comum_hover.png")));
		lblComum.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	protected void do_lblPreferencial_mouseEntered(MouseEvent arg0) {
		lblPreferencial.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/op_preferencial_hover.png")));
		lblPreferencial.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	protected void do_lblJudicial_mouseEntered(MouseEvent arg0) {
		System.out.println("teste");
	}
	
	protected void do_lblFechar_mouseEntered(MouseEvent arg0) {
		lblFechar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblFechar) {
			do_lblFechar_mouseClicked(e);
		}
		
		if (e.getSource() == lblPreferencial) {
			do_lblPreferencial_mouseEntered(e);
		}
		if(e.getSource()== lblComum){
			do_lblComum_mouseClicked(e);
		}
		
	}
	
	private void do_lblComum_mouseClicked(MouseEvent e) {
		controle.gerarSenha(TipoSenha.COMUM);//chama o método gerarSenha e passa o tipo de senha de acordo com o panel escolhido pelo usuário
		
	}

	protected void do_lblFechar_mouseClicked(MouseEvent arg0) {
		setVisible(false);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblComum) {
			do_lblComum_mouseExisted(e);
		}
		
		if (e.getSource() == lblPreferencial) {
			do_lblPreferencial_mouseExited(e);
		}
		
	
	}
	
	public void do_lblComum_mouseExisted(MouseEvent e){
		lblComum.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/op_comum.png")));
	}
	
	public void do_lblPreferencial_mouseExited(MouseEvent e){
		lblPreferencial.setIcon(new ImageIcon(SelecionarSenha.class.getResource("/app/easykey/img/op_preferencial.png")));
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
