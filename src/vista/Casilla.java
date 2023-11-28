package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controlador.Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Casilla extends JLabel{
	private int posr;
	private int posc;
	public static final int h=100;
	public static final int w=100;
	public Casilla(Controlador ctr) {
		super("");
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ctr.setRandC(posr,posc);
			}
		});
		
		this.setLayout(null);
		
		this.setBorder(new LineBorder(new Color(221, 221, 221), 4));
		this.setOpaque(true);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font("Bahnshrift", Font.BOLD, 47));
		this.setBackground(new Color(255, 255, 255));
		this.setSize(100,100);
	
		repaint();
		revalidate();
	}
	
	public void setPosr(int r) {
		this.posr=r;
	}
	
	public int getPosr() {
		return this.posr;
	}
	
	public int getPosc() {
		return this.posc;
	}
	
	public void setPosc(int r) {
		this.posc=r;
	}
	
	public void setBounds(int x, int y, int wd, int ht) {
		super.setBounds(x,y,w,h);
	}
	
	public void setOrange() {
		this.setBackground(Color.ORANGE);
		this.setForeground(Color.WHITE);
		
	}

	public void setRight() {
		this.setBackground(new Color(17, 172, 0));
		this.setForeground(Color.WHITE);
		
	}
	
	public void setWrong() {
		this.setBackground(Color.GRAY);
		this.setForeground(Color.white);
	}
	
	public void setRed() {
		this.setBackground(Color.RED);
		this.setForeground(Color.white);
	}

	public static boolean isGreen(Casilla c) {
		if(c.getBackground().equals(new Color(17, 172, 0))){
			return true;
		}
		return false;
	}
	
	public static boolean isOrange(Casilla c) {
		if(c.getBackground().equals(Color.ORANGE)){
			return true;
		}
		return false;
	}

	public void setDefault() {
		this.setBorder(new LineBorder(new Color(221, 221, 221), 4));
		this.setBackground(new Color(255, 255, 255));
		this.setForeground(Color.BLACK);
	}

	public void setSelected() {
		this.setBorder(new LineBorder(new Color(173, 216, 230),4));
		
	}

}
