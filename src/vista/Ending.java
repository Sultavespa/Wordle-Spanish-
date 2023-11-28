package vista;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

import controlador.Controlador;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ending extends JFrame {
	private JFrame frame;
	public static Casilla[][] casillas = new Casilla[5][5];
	public static Tecla[] botones = new Tecla[27];
	public Ending(Controlador ctr) {
		super();
		
		frame = new JFrame();
		
		frame.setBounds(100, 100, 840, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WORDLE");
		lblNewLabel.setBounds(157, 70, 497, 92);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 67));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHas = new JLabel("HAS");
		lblHas.setForeground(new Color(68, 68, 68));
		lblHas.setHorizontalAlignment(SwingConstants.CENTER);
		lblHas.setFont(new Font("Bahnschrift", Font.BOLD, 48));
		lblHas.setBounds(157, 260, 497, 53);
		frame.getContentPane().add(lblHas);
		
		Casilla cslP = new Casilla(ctr);
		cslP.setText("P");
		cslP.setBounds(28, 391, 100, 100);
		cslP.setOrange();
		frame.getContentPane().add(cslP);
		
		Casilla cslE = new Casilla(ctr);
		cslE.setText("E");
		cslE.setBounds(138, 391, 100, 100);
		cslE.setOrange();
		frame.getContentPane().add(cslE);
		
		Casilla cslR = new Casilla(ctr);
		cslR.setText("R");
		cslR.setBounds(248, 391, 100, 100);
		cslR.setOrange();
		frame.getContentPane().add(cslR);
		
		Casilla cslD = new Casilla(ctr);
		cslD.setText("D");
		cslD.setBounds(358, 391, 100, 100);
		cslD.setOrange();
		
		frame.getContentPane().add(cslD);
		
		Casilla cslI = new Casilla(ctr);
		cslI.setText("I");
		cslI.setBounds(468, 391, 100, 100);
		cslI.setOrange();
		frame.getContentPane().add(cslI);
		
		Casilla cslD_1 = new Casilla(ctr);
		cslD_1.setText("D");
		cslD_1.setOrange();
		cslD_1.setBounds(578, 391, 100, 100);
		frame.getContentPane().add(cslD_1);
		
		JLabel lblNewLabel_1 = new JLabel("VOLVER A JUGAR");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ctr.repeat();
				frame.dispose();
			}
		});
		lblNewLabel_1.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(17, 172, 68));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 29));
		lblNewLabel_1.setBounds(88, 555, 286, 59);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SALIR");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 29));
		lblNewLabel_1_1.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		lblNewLabel_1_1.setBackground(new Color(255, 128, 64));
		lblNewLabel_1_1.setBounds(435, 555, 286, 59);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		Casilla casilla_4_1_1 = new Casilla(ctr);
		casilla_4_1_1.setText("O");
		casilla_4_1_1.setBounds(688, 391, 100, 100);
		casilla_4_1_1.setOrange();
		frame.getContentPane().add(casilla_4_1_1);
		
		
		
		
		
		
		frame.setVisible(true);
		this.repaint();
		this.revalidate();
	}
}
