package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JTextField;
import javax.swing.Timer;

import vista.Casilla;
import vista.Ending;
import vista.EndingBad;
import vista.MiJFrame;
import vista.Tecla;
import vista.MiJFrame;
public class Controlador implements UsaTeclado{
	int cuentaletras=0;
	int r = 0;
	int c = 0;
	public List<String> palabras = leerPalabrasDesdeArchivo();
	public MiJFrame miframe;
    public String palabraAlAzar = elegirPalabraAlAzar(palabras);
    char[] correcta = palabraAlAzar.toCharArray();
    char[] caracteres = palabraAlAzar.toCharArray();
    char[] orangestogive = palabraAlAzar.toCharArray();
    public Controlador() {
    	miframe = new MiJFrame(this);
    	
    }
    
    
	public void rellenarCasilla(char l) {
		
		if(r<=4 && c<=4) {
			for(int x=0;x<5;x++) {
				miframe.casillas[r][x].setDefault();
			}
			cuentaletras++;
			System.out.println(l);
			System.out.println(r+" "+c);
			miframe.casillas[r][c].setText(l+"");
			System.out.println((l+"").toLowerCase()+" Es la letra y "+ caracteres[4]+" es la primera ");
			if((l+"").toLowerCase().equals(caracteres[4]+"")) {
				System.out.println("green");
				
			};
			
			if(c==5) {
				
			}else {
				c++;
			}
		}else {
			
		}

	}
	
	public void enter() {
		String entered="";
		for(int x=0;x<5;x++) {
			entered=entered+miframe.casillas[r][x].getText().toLowerCase();
		}
		System.out.println(entered);
		if(palabras.contains(entered) ) {
			
		
		orangestogive = palabraAlAzar.toCharArray();
		Casilla[] oranges = new Casilla[5];
		Casilla[] correctas = new Casilla[5];
		
		int sigcorrect=0;
		int sigorange=0;
		
		if(cuentaletras==5) {
			for(int i = 0;i<5;i++) {
				System.out.println("Comparando " + miframe.casillas[r][i].getText().toLowerCase()+ " con " + caracteres[i]);
				if(miframe.casillas[r][i].getText().toLowerCase().equals(caracteres[i]+"")) {
					miframe.casillas[r][i].setRight();
					int controler = 1;
					for(int x=0;x<5;x++) {
						if(controler==1) {
							if((orangestogive[x]+"").equals(miframe.casillas[r][i].getText().toLowerCase())) {
								orangestogive[x]=0;
								controler--;
							}
						}
					}
					correctas[sigcorrect]=miframe.casillas[r][i];
					sigcorrect++;
					
					for(int t=0;t<27;t++) {
						if(miframe.botones[t].getText().equals(miframe.casillas[r][i].getText())) {
							miframe.botones[t].setRight();
						}
					}
					
					
				}else {
					boolean orange = false;
					
					for(int e = 0;e<5;e++) {
						
						if(miframe.casillas[r][i].getText().toLowerCase().equals(caracteres[e]+"")) {
							System.out.println("Coincide orange");
							if(sigorange<5) {
								oranges[sigorange]=miframe.casillas[r][i];
							}
							
							sigorange++;
							
							
							
							for(int t=0;t<27;t++) {
								if(miframe.botones[t].getText().equals(miframe.casillas[r][i].getText())) {
									if(Tecla.isGreen(miframe.botones[t])) {
										miframe.botones[t].setRight();
									}else {
										miframe.botones[t].setOrange();
									}
									
								}
							}
							orange = true;
						}else {
							if(!orange) {
								miframe.casillas[r][i].setWrong();
								for(int t=0;t<27;t++) {
									if(miframe.botones[t].getText().equals(miframe.casillas[r][i].getText())) {
										miframe.botones[t].setWrong();
										
									}
								}
							}
							
						}
					}
					
					
				}
			}
			for(int i=0;i<5;i++) {
				for(int ix=0;ix<5;ix++) {
					System.out.println(miframe.casillas[r][i].getText());
					System.out.println(correcta[ix]);
					if(miframe.casillas[r][i].getText().toLowerCase().equals(correcta[ix]+"")) {
						if(Casilla.isGreen(miframe.casillas[r][i])) {
							
						}else {
							
							for(int x=0;x<5;x++) {
								
									if((orangestogive[x]+"").equals(miframe.casillas[r][i].getText().toLowerCase())) {
										if(Casilla.isOrange(miframe.casillas[r][i])) {
											
										}else {
											orangestogive[x]=0;
											miframe.casillas[r][i].setOrange();
										}
										
										
									}
								
							}
							
						}
					}
				}
			}
			
			boolean setorange=true;
			int countoranges=1;
			for(int er =0;er<5;er++) {

				
			
				if(oranges[er]!=null) {
					String l = oranges[er].getText();
					for(int err=0;err<5;err++) {
						
							if((caracteres[err]+"").equals(l.toLowerCase())) {
								countoranges++;
							
						}
					}
				}
				
				for(int ere=0;ere<5;ere++) {
					if(oranges[er]!=null&&correctas[ere]!=null) {
						
						String orange = oranges[er].getText();
						String correct = correctas[ere].getText();
						System.out.println("COMPARAR "+orange+" CON "+ correct);
						if(orange.equals(correct)) {
							
							setorange=false;
						}
					}
					
					
				}
				for(int eree=0;eree<5;eree++) {
					if(oranges[er]!=null) {
						
						if(setorange==true) {
							if(countoranges==0) {
								
							}else {
								
								countoranges--;
							}
							
						}
					}
				}
				
				
			}
			for(int iri=0;iri<5;iri++) {
				if(Casilla.isGreen(miframe.casillas[r][iri])|| Casilla.isOrange(miframe.casillas[r][iri])) {
					
				}else {
					miframe.casillas[r][iri].setWrong();
				}
			}
			r++;
			c=0;
			cuentaletras=0;
		}
		
		if(correctas[4]!=null) {
			r=0;
			c=0;
			miframe.setVisible(false); 
			miframe.dispose();
			EndingBad ending = new EndingBad(this);
		}
		if(r==5) {
			r=0;
			c=0;
			miframe.setVisible(false); 
			miframe.dispose();
			Ending end = new Ending(this);
			System.out.println("PERD");
		}
		}else {
			
				
				
				doTaskWithTimer();
				
			}
		}
	
	public void setRedForAll() {
	    for (int x = 0; x < 5; x++) {
	        miframe.casillas[r][x].setRed();
	    }
	}
	
	public void setDefForAll() {
	    for (int x = 0; x < 5; x++) {
	        miframe.casillas[r][x].setDefault();
	    }
	}

	public void doTaskWithTimer() {
	    Timer timer = new Timer(250, null);
	    ActionListener listener = new ActionListener() {
	        private int count = 0;

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            count++;
	            if (count == 1 || count == 3) { 
	                setRedForAll();
	            } else if (count == 2 || count == 4) { 
	                setDefForAll();
	            }

	            if (count == 4) {
	                ((Timer) e.getSource()).stop();
	            }
	        }
	    };

	    timer.addActionListener(listener);
	    timer.start();
	}
	
	public void borrar() {
		if(c>0) {
			for(int x=0;x<5;x++) {
				miframe.casillas[r][x].setDefault();
			}
			cuentaletras--;
			if(c==0) {
				r--;
				c=4;
			}else {
				c--;
			}
			miframe.casillas[r][c].setText("");
		}
		}
		
	public static List<String> leerPalabrasDesdeArchivo() {
        List<String> palabras = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("palabras.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                palabras.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palabras;
    }

    public static String elegirPalabraAlAzar(List<String> palabras) {
        Random random = new Random();
        int indice = random.nextInt(palabras.size());
        System.out.println(palabras.get(indice));
        return palabras.get(indice);
        
    }


	public  void repeat() {
		
		miframe= new MiJFrame(this);
		palabraAlAzar = elegirPalabraAlAzar(palabras);
	    caracteres = palabraAlAzar.toCharArray();
	}


	public void setRandC(int posr, int posc) {
	
		if(r==posr) {
			for(int x=0;x<5;x++) {
				miframe.casillas[r][x].setDefault();
			}
			c=posc;
			miframe.casillas[r][c].setSelected();
		}
		
		
	}


	
    
    
   
}
