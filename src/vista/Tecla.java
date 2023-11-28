package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controlador.Controlador;

public class Tecla extends JLabel{
	
	private boolean isGreen=false;

	public Tecla(String tecla, Controlador ctr){
		
		super();
		
		this.setText(tecla);
		this.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.setFont(new Font("Bahnshrift", Font.BOLD, 16));
		this.setForeground(new Color(60, 60, 60));
		this.setBackground(new Color(199, 199, 199));
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setOpaque(true);
		
		this.setSize(37, 37);
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(getText()=="ENTER") {
					ctr.enter();
				}else {
					if(getText()=="<--") {
						ctr.borrar();
					}else {
						ctr.rellenarCasilla(tecla.charAt(0));
					}
				}
				
				
			}
		});
		repaint();
		revalidate();
	}
	
	public void setBounds(int x, int y, int wd, int ht) {
	
		if(this.getText()=="<--" || this.getText()=="ENTER") {
			super.setBounds(x, y, 69, 40);
		}else {
			super.setBounds(x, y, 40, 40);
		}
	
		
	}

	public void setOrange() {
		this.setBackground(Color.ORANGE);
		this.setForeground(Color.WHITE);
		
	}
	
	public void setWrong() {
		this.setBackground(Color.GRAY);
		this.setForeground(Color.white);
	}

	public void setDefault() {
		this.setBackground(new Color(199, 199, 199));
		this.setForeground(new Color(60, 60, 60));
		
	}

	public void setRight() {
		this.setBackground(new Color(17, 172, 0));
		this.setForeground(Color.WHITE);
		this.isGreen=true;
		
	}

	public static boolean isGreen(Tecla c) {
		if(c.isGreen) return true;
		return false;
	}
}
