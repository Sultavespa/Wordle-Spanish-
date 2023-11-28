package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.Controlador;

public class Teclado extends JPanel{
	public Teclado(MiJFrame fr, Controlador ctr) {
		super();
		this.setSize(599, 177);
		this.setLayout(null);
		this.setVisible(true);
		Tecla tecla_8 = new Tecla("Q",ctr);
		tecla_8.setBounds(25, 11,1,1);
		fr.botones[0]=tecla_8;
		this.add(tecla_8);
		Tecla tecla_8_1 = new Tecla("W",ctr);
		tecla_8_1.setBounds(82, 11,1,1);
		fr.botones[1]=tecla_8_1;
		this.add(tecla_8_1);
		
		Tecla tecla_8_2 = new Tecla("E",ctr);
		tecla_8_2.setBounds(135, 11,1,1);
		fr.botones[2]=tecla_8_2;
		this.add(tecla_8_2);
		
		Tecla tecla_8_3 = new Tecla("R",ctr);
		fr.botones[3]=tecla_8_3;
		tecla_8_3.setBounds(192, 11,1,1);
		this.add(tecla_8_3);
		
		Tecla tecla_8_4 = new Tecla("T",ctr);
		fr.botones[4]=tecla_8_4;
		tecla_8_4.setBounds(245, 11,1,1);
		this.add(tecla_8_4);
		
		Tecla tecla_8_5 = new Tecla("Y",ctr);
		fr.botones[5]=tecla_8_5;
		tecla_8_5.setBounds(302, 11,1,1);
		this.add(tecla_8_5);
		
		Tecla tecla_8_6 = new Tecla("U",ctr);
		fr.botones[6]=tecla_8_6;
		tecla_8_6.setBounds(355, 11,1,1);
		this.add(tecla_8_6);
		
		Tecla tecla_8_7 = new Tecla("I",ctr);
		fr.botones[7]=tecla_8_7;
		tecla_8_7.setBounds(412, 11,1,1);
		this.add(tecla_8_7);
		
		Tecla tecla_8_8 = new Tecla("O",ctr);
		fr.botones[8]=tecla_8_8;
		tecla_8_8.setBounds(465, 11,1,1);
		this.add(tecla_8_8);
		
		Tecla tecla_8_9 = new Tecla("P",ctr);
		fr.botones[9]=tecla_8_9;
		tecla_8_9.setBounds(522, 11,1,1);
		this.add(tecla_8_9);
		
		Tecla tecla_8_10 = new Tecla("A",ctr);
		fr.botones[10]=tecla_8_10;
		tecla_8_10.setBounds(25, 65,1,1);
		this.add(tecla_8_10);
		
		Tecla tecla_8_1_1 = new Tecla("S",ctr);
		fr.botones[11]=tecla_8_1_1;
		tecla_8_1_1.setBounds(82, 65,1,1);
		this.add(tecla_8_1_1);
		
		Tecla tecla_8_2_1 = new Tecla("D",ctr);
		fr.botones[12]=tecla_8_2_1;
		tecla_8_2_1.setBounds(135, 65,1,1);
		this.add(tecla_8_2_1);
		
		Tecla tecla_8_3_1 = new Tecla("F",ctr);
		fr.botones[13]=tecla_8_3_1;
		tecla_8_3_1.setBounds(192, 65,1,1);
		this.add(tecla_8_3_1);
		
		Tecla tecla_8_4_1 = new Tecla("G",ctr);
		fr.botones[14]=tecla_8_4_1;
		tecla_8_4_1.setBounds(245, 65,1,1);
		this.add(tecla_8_4_1);
		
		Tecla tecla_8_5_1 = new Tecla("H",ctr);
		fr.botones[15]=tecla_8_5_1;
		tecla_8_5_1.setBounds(302, 65,1,1);
		this.add(tecla_8_5_1);
		
		Tecla tecla_8_6_1 = new Tecla("J",ctr);
		fr.botones[16]=tecla_8_6_1;
		tecla_8_6_1.setBounds(355, 65,1,1);
		this.add(tecla_8_6_1);
		
		Tecla tecla_8_7_1 = new Tecla("K",ctr);
		fr.botones[17]=tecla_8_7_1;
		tecla_8_7_1.setBounds(412, 65,1,1);
		this.add(tecla_8_7_1);
		
		Tecla tecla_8_8_1 = new Tecla("L",ctr);
		fr.botones[18]=tecla_8_8_1;
		tecla_8_8_1.setBounds(465, 65,1,1);
		this.add(tecla_8_8_1);
		
		Tecla tecla_8_9_1 = new Tecla("Ñ",ctr);
		fr.botones[19]=tecla_8_9_1;
		tecla_8_9_1.setBounds(522, 65,1,1);
		this.add(tecla_8_9_1);
		
		Tecla tecla_8_11 = new Tecla("Z",ctr);
		fr.botones[20]=tecla_8_11;
		tecla_8_11.setBounds(25, 119,1,1);
		this.add(tecla_8_11);
		
		Tecla tecla_8_2_2 = new Tecla("X",ctr);
		fr.botones[21]=tecla_8_2_2;
		tecla_8_2_2.setBounds(82, 119,1,1);
		this.add(tecla_8_2_2);
		
		Tecla tecla_8_4_2 = new Tecla("C",ctr);
		fr.botones[22]=tecla_8_4_2;
		tecla_8_4_2.setBounds(135, 119,1,1);
		this.add(tecla_8_4_2);
		
		Tecla tecla_8_6_2 = new Tecla("V",ctr);
		fr.botones[23]=tecla_8_6_2;
		tecla_8_6_2.setBounds(192, 119,1,1);
		this.add(tecla_8_6_2);
		
		Tecla tecla_8_7_2 = new Tecla("B",ctr);
		fr.botones[24]=tecla_8_7_2;
		tecla_8_7_2.setBounds(245, 119,1,1);
		this.add(tecla_8_7_2);
		
		Tecla tecla_8_8_2 = new Tecla("N",ctr);
		fr.botones[25]=tecla_8_8_2;
		tecla_8_8_2.setBounds(302, 119,1,1);
		this.add(tecla_8_8_2);
		
		Tecla tecla_8_9_2 = new Tecla("M",ctr);
		fr.botones[26]=tecla_8_9_2;
		tecla_8_9_2.setBounds(355, 119,1,1);
		this.add(tecla_8_9_2);
		
		Tecla tecla_8_7_2_1 = new Tecla("<--",ctr);
		
		tecla_8_7_2_1.setBounds(412, 119,1,1);
		this.add(tecla_8_7_2_1);
		
		Tecla tecla_8_7_2_1_1 = new Tecla("ENTER",ctr);
		
		tecla_8_7_2_1_1.setBounds(496, 119,1,1);
		this.add(tecla_8_7_2_1_1);
		repaint();
		revalidate();
	}
	
	public void setBounds(int x, int y, int wd, int ht) {
		super.setBounds(x,y,599, 177);
	}
	
}
