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

public class EndingBad extends JFrame {
	private JFrame frame;
	public static Casilla[][] casillas = new Casilla[5][5];
	public static Tecla[] botones = new Tecla[27];
	public EndingBad(Controlador ctr) {
		super();
		
		frame = new JFrame();
		
		frame.setBounds(100, 100, 717, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WORDLE");
		lblNewLabel.setBounds(101, 69, 497, 92);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 67));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHas = new JLabel("HAS");
		lblHas.setForeground(new Color(68, 68, 68));
		lblHas.setHorizontalAlignment(SwingConstants.CENTER);
		lblHas.setFont(new Font("Bahnschrift", Font.BOLD, 48));
		lblHas.setBounds(101, 258, 497, 53);
		frame.getContentPane().add(lblHas);
		
		Casilla cslP = new Casilla(ctr);
		cslP.setText("G");
		cslP.setBounds(28, 391, 100, 100);
		cslP.setRight();
		frame.getContentPane().add(cslP);
		
		Casilla casilla_1 = new Casilla(ctr);
		casilla_1.setText("A");
		casilla_1.setBounds(138, 391, 100, 100);
		casilla_1.setRight();
		frame.getContentPane().add(casilla_1);
		
		Casilla casilla_2 = new Casilla(ctr);
		casilla_2.setText("N");
		casilla_2.setBounds(248, 391, 100, 100);
		casilla_2.setRight();
		frame.getContentPane().add(casilla_2);
		
		Casilla casilla_3 = new Casilla(ctr);
		casilla_3.setText("A");
		casilla_3.setBounds(358, 391, 100, 100);
		casilla_3.setRight();
		frame.getContentPane().add(casilla_3);
		
		Casilla casilla_4 = new Casilla(ctr);
		casilla_4.setText("D");
		casilla_4.setBounds(468, 391, 100, 100);
		casilla_4.setRight();
		frame.getContentPane().add(casilla_4);
		
		Casilla casilla_4_1 = new Casilla(ctr);
		casilla_4_1.setText("O");
		casilla_4_1.setBounds(578, 391, 100, 100);
		casilla_4_1.setRight();
		frame.getContentPane().add(casilla_4_1);
		
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
		lblNewLabel_1.setBounds(44, 555, 286, 59);
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
		lblNewLabel_1_1.setBounds(384, 555, 286, 59);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		
		
		
		
		
		frame.setVisible(true);
		this.repaint();
		this.revalidate();
	}
}
