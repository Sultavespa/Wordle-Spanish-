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

public class MiJFrame extends JFrame {
	public Casilla[][] casillas = new Casilla[5][5];
	public Tecla[] botones = new Tecla[27];
	public MiJFrame(Controlador ctr) {
		super();
		
		
		this.setBounds(100, 100, 635, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WORDLE");
		lblNewLabel.setBounds(55, 28, 497, 53);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 43));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(lblNewLabel);
		
		Casilla casilla = new Casilla(ctr);
		
		casilla.setBounds(36, 103, 100, 100);
		casillas[0][0]=casilla;
		casilla.setPosr(0);
		casilla.setPosc(0);
		this.getContentPane().add(casilla);
		
		Casilla casilla_1 = new Casilla(ctr);
		casillas[0][1]=casilla_1;
		casilla_1.setBounds(146, 103, 100, 100);
		casilla_1.setPosr(0);
		casilla_1.setPosc(1);
		this.getContentPane().add(casilla_1);
		
		Casilla casilla_2 = new Casilla(ctr);
		casillas[0][2]=casilla_2;
		casilla_2.setPosr(0);
		casilla_2.setPosc(2);
		casilla_2.setBounds(256, 103, 100, 100);
		this.getContentPane().add(casilla_2);
		
		Casilla casilla_3 = new Casilla(ctr);
		casillas[0][3]=casilla_3;
		casilla_3.setPosr(0);
		casilla_3.setPosc(3);
		casilla_3.setBounds(366, 103, 100, 100);
		this.getContentPane().add(casilla_3);
		
		Casilla casilla_4 = new Casilla(ctr);
		casillas[0][4]=casilla_4;
		casilla_4.setPosr(0);
		casilla_4.setPosc(4);
		casilla_4.setBounds(476, 103, 100, 100);
		this.getContentPane().add(casilla_4);
		
		Casilla casilla_5 = new Casilla(ctr);
		casillas[1][0]=casilla_5;
		casilla_5.setPosr(1);
		casilla_5.setPosc(0);
		casilla_5.setBounds(36, 214, 100, 100);
		this.getContentPane().add(casilla_5);
		
		Casilla casilla_1_1 = new Casilla(ctr);
		casillas[1][1]=casilla_1_1;
		casilla_1_1.setPosr(1);
		casilla_1_1.setPosc(1);
		casilla_1_1.setBounds(146, 214, 100, 100);
		this.getContentPane().add(casilla_1_1);
		
		Casilla casilla_2_1 = new Casilla(ctr);
		casillas[1][2]=casilla_2_1;
		casilla_2_1.setPosr(1);
		casilla_2_1.setPosc(2);
		casilla_2_1.setBounds(256, 214, 100, 100);
		this.getContentPane().add(casilla_2_1);
		
		Casilla casilla_3_1 = new Casilla(ctr);
		casillas[1][3]=casilla_3_1;
		casilla_3_1.setPosr(1);
		casilla_3_1.setPosc(3);
		casilla_3_1.setBounds(366, 214, 100, 100);
		this.getContentPane().add(casilla_3_1);
		
		Casilla casilla_4_1 = new Casilla(ctr);
		casillas[1][4]=casilla_4_1;
		casilla_4_1.setPosr(1);
		casilla_4_1.setPosc(4);
		casilla_4_1.setBounds(476, 214, 100, 100);
		this.getContentPane().add(casilla_4_1);
		
		Casilla casilla_6 = new Casilla(ctr);
		casillas[2][0]=casilla_6;
		casilla_6.setPosr(2);
		casilla_6.setPosc(0);
		casilla_6.setBounds(36, 325, 100, 100);
		this.getContentPane().add(casilla_6);
		
		Casilla casilla_1_2 = new Casilla(ctr);
		casillas[2][1]=casilla_1_2;
		casilla_1_2.setPosr(2);
		casilla_1_2.setPosc(1);
		casilla_1_2.setBounds(146, 325, 100, 100);
		this.getContentPane().add(casilla_1_2);
		
		Casilla casilla_2_2 = new Casilla(ctr);
		casillas[2][2]=casilla_2_2;
		casilla_2_2.setPosr(2);
		casilla_2_2.setPosc(2);
		casilla_2_2.setBounds(256, 325, 100, 100);
		this.getContentPane().add(casilla_2_2);
		
		Casilla casilla_3_2 = new Casilla(ctr);
		casillas[2][3]=casilla_3_2;
		casilla_3_2.setPosr(2);
		casilla_3_2.setPosc(3);
		casilla_3_2.setBounds(366, 325, 100, 100);
		this.getContentPane().add(casilla_3_2);
		
		Casilla casilla_4_2 = new Casilla(ctr);
		casillas[2][4]=casilla_4_2;
		casilla_4_2.setPosr(2);
		casilla_4_2.setPosc(4);
		casilla_4_2.setBounds(476, 325, 100, 100);
		this.getContentPane().add(casilla_4_2);
		
		Casilla casilla_7 = new Casilla(ctr);
		casillas[3][0]=casilla_7;
		casilla_7.setPosr(3);
		casilla_7.setPosc(0);
		casilla_7.setBounds(36, 436, 100, 100);
		this.getContentPane().add(casilla_7);
		
		Casilla casilla_1_3 = new Casilla(ctr);
		casillas[3][1]=casilla_1_3;
		casilla_1_3.setPosr(3);
		casilla_1_3.setPosc(1);
		casilla_1_3.setBounds(146, 436, 100, 100);
		this.getContentPane().add(casilla_1_3);
		
		Casilla casilla_2_3 = new Casilla(ctr);
		casillas[3][2]=casilla_2_3;
		casilla_2_3.setPosr(3);
		casilla_2_3.setPosc(2);
		casilla_2_3.setBounds(256, 436, 100, 100);
		this.getContentPane().add(casilla_2_3);
		
		Casilla casilla_3_3 = new Casilla(ctr);
		casillas[3][3]=casilla_3_3;
		casilla_3_3.setPosr(3);
		casilla_3_3.setPosc(3);
		casilla_3_3.setBounds(366, 436, 100, 100);
		this.getContentPane().add(casilla_3_3);
		
		Casilla casilla_4_3 = new Casilla(ctr);
		casillas[3][4]=casilla_4_3;
		casilla_4_3.setPosr(3);
		casilla_4_3.setPosc(4);
		casilla_4_3.setBounds(476, 436, 100, 100);
		this.getContentPane().add(casilla_4_3);
		
		Casilla casilla_8 = new Casilla(ctr);
		casillas[4][0]=casilla_8;
		casilla_8.setPosr(4);
		casilla_8.setPosc(0);
		casilla_8.setBounds(36, 547, 100, 100);
		this.getContentPane().add(casilla_8);
		
		Casilla casilla_4_4 = new Casilla(ctr);
		casillas[4][1]=casilla_4_4;
		casilla_4_4.setPosr(4);
		casilla_4_4.setPosc(1);
		casilla_4_4.setBounds(146, 547, 100, 100);
		this.getContentPane().add(casilla_4_4);
		
		Casilla casilla_3_4 = new Casilla(ctr);
		casillas[4][2]=casilla_3_4;
		casilla_3_4.setPosr(4);
		casilla_3_4.setPosc(2);
		casilla_3_4.setBounds(256, 547, 100, 100);
		this.getContentPane().add(casilla_3_4);
		
		Casilla casilla_2_4 = new Casilla(ctr);
		casillas[4][3]=casilla_2_4;
		casilla_2_4.setPosr(4);
		casilla_2_4.setPosc(3);
		casilla_2_4.setBounds(366, 547, 100, 100);
		this.getContentPane().add(casilla_2_4);
		
		Casilla casilla_1_4 = new Casilla(ctr);
		casillas[4][4]=casilla_1_4;
		casilla_1_4.setPosr(4);
		casilla_1_4.setPosc(4);
		casilla_1_4.setBounds(476, 547, 100, 100);
		this.getContentPane().add(casilla_1_4);
		
		Teclado teclado = new Teclado(this, ctr);
		teclado.setBounds(10, 669, 599, 177);
		this.getContentPane().add(teclado);
		
		
		
		
		
		
		this.setVisible(true);
		this.repaint();
		this.revalidate();
	}
	
}
