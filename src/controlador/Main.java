package controlador;

import javax.swing.UIManager;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		Controlador ctr = new Controlador();
	}

}
