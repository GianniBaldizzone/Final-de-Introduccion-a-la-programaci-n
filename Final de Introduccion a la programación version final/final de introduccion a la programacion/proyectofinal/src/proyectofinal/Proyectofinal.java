package proyectofinal;

import javax.swing.*;

class Proyectofinal {

	public static void main(String[] args) {
    int menu;//Variables para el menu
    String m;
	int [] puntuacionj1=new int[10];//Variables para el Tres o mas
    int [] puntuacionpc=new int[10];
    int [] puntuacionj2=new int[10];
    String cantj,contp;
    int cantju,dj1,dj2,dj3,dj4,dj5,dpc1,dpc2,dpc3,dpc4,dpc5,totpc=0,totj11=0,totj1=0,totj2=0,contp1=0,contpp,finn;
    String nombrej1,nombrej2,sn,fin;
    int [] numeros=new int[5]; //Variables Adivina el numero
    boolean fueusado=false;	
    int nume;
    int j1num,contpista = 0,contadiv=0,contr =0,contr1,contde=0,contint=0;
    String pista,con,num;
    do {
	JOptionPane.showMessageDialog(null,"","Bienvenida",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/bienvenida.jpg")));   
	JOptionPane.showMessageDialog(null,"","Bienvenida",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/final.jpg")));   				
    do {
	m=(String)(JOptionPane.showInputDialog(null,"�Que juego desea jugar?\n1-Tres o mas\n2-Adivina el numero","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/juego1o2.jpg")),null,null));
	menu=Integer.parseInt(m);
    } while (menu!=1 && menu!=2);
	switch (menu) {
	case 1:
		// Tres o mas
		JOptionPane.showMessageDialog(null,"","Bienvenida",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/titulo.jpg")));
		    
		    JOptionPane.showMessageDialog(null, "NECESITAS: 5 dados de 6 caras y al menos dos jugadores(en este caso virtuales xd).\n\n�C�MO JUGAR?: El objetivo del juego es sacar tres dados iguales o m�s en una tirada.\n3 dados iguales punt�an con 3 puntos 4 dados iguales con 6 puntos y 5 dados\niguales con 12 puntos. Si nos salen dos dados iguales no puntuamos pero ganamos \nel derecho de volver a tirar (esto solo se puede hacer una vez en caso de que vuelva\n a salir dos se lo tomara como 0 puntos).\n\n�QUIEN GANA?: Se establecen 5 o "
		    		+ "10 rondas y se van anotando las puntuaciones. \nQuien m�s puntos tenga al final gana.","Bienvenida",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/tresomas.jpg")));	
			do {//controla que se ponga bien la cantidad de jugadores
		    cantj=(String)(JOptionPane.showInputDialog(null,"Ingrese la cantidad de jugadores:\n1-Jugador vs Maquina\n2-Jugador vs Jugador\n(Si ingresas un valor inexistente se reiniciara el cuadro)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/1o2.jpg")),null,null));
			cantju=Integer.parseInt(cantj);
	        } while (cantju!=1 && cantju!=2);
			
		    switch (cantju) {
			case 1://Modalidad 1 jugador
			do {
			do {//controla que se ponga bien el numero de rondas
				
		
			contp=(String)(JOptionPane.showInputDialog(null,"Ingrese la cantidad de rondas:\n- 5 RONDAS\n-10 RONDAS\n(si ingresas un valor inexistente se reiniciara el cuadro)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/rondas1.jpg")),null,null));	
			contpp=Integer.parseInt(contp);	
			switch (contpp) {
			case 5:
			contp1=4;	
				break;

			case 10:
			contp1=9;
				break;
			}
			} while (contpp!=5 && contpp!=10);	
			nombrej1=(String)(JOptionPane.showInputDialog(null,"Ingrese el nombre del Jugador 1","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/nombrej1.jpg")),null,null));
			for (int i = 0; i <= contp1; i++) {
			JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/ronda"+(i+1)+".jpg")));
			
				
			
			JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/turnorobot.jpg")));
			dpc1=(int)(Math.random()*6+1);
			dpc2=(int)(Math.random()*6+1);
			dpc3=(int)(Math.random()*6+1);
			dpc4=(int)(Math.random()*6+1);
			dpc5=(int)(Math.random()*6+1);
			JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/mezclando.jpg")));
			JOptionPane.showMessageDialog(null,"Los dados que le ha salido a la maquina son\n"+dpc1+"-"+dpc2+"-"+dpc3+"-"+dpc4+"-"+dpc5,"Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/tirandodados.jpg")));
	    	if (dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc1) {
	    	JOptionPane.showMessageDialog(null, "Cinco dados han sido iguales!!! +12 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/12puntos.jpg")));
	    	puntuacionpc[i]=puntuacionpc[i]+12;	
			}else if ((dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc2)||(dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc3)||(dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc4)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc5)) {
			JOptionPane.showMessageDialog(null, "Cuatro dados han sido iguales!!! +6 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/6puntos.jpg")));
			puntuacionpc[i]=puntuacionpc[i]+6;		
			}else if ((dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc1)||(dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc2)||(dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc3)||(dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc4)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc5)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc5)||(dpc1==dpc3 && dpc3==dpc5 && dpc5==dpc1)||(dpc1==dpc3 && dpc3==dpc5 && dpc5==dpc1)||(dpc1==dpc2 && dpc2==dpc4 && dpc4==dpc1)||(dpc1==dpc2 && dpc2==dpc5 && dpc5==dpc1)||(dpc1==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc1==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc2==dpc3 && dpc3==dpc5 && dpc5==dpc2)||(dpc2==dpc4 && dpc4==dpc5 && dpc5==dpc2)) {
			JOptionPane.showMessageDialog(null, "Tres dados han sido iguales!!! +3 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/3puntos.jpg")));
			puntuacionpc[i]=puntuacionpc[i]+3;		
			}else if ((dpc1==dpc2)||(dpc1==dpc3)||(dpc1==dpc4)||(dpc1==dpc5)||(dpc2==dpc3)||(dpc2==dpc4)||(dpc2==dpc5)||(dpc3==dpc4)||(dpc3==dpc5)||(dpc4==dpc5)) {
				JOptionPane.showMessageDialog(null, "Dos dados han sido iguales posee una segunda tirada","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/2tirada.jpg")));
				dpc1=(int)(Math.random()*6+1);
				dpc2=(int)(Math.random()*6+1);
				dpc3=(int)(Math.random()*6+1);
				dpc4=(int)(Math.random()*6+1);
				dpc5=(int)(Math.random()*6+1);
				JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/mezclando.jpg")));
				JOptionPane.showMessageDialog(null,"Los dados que le ha salido a la maquina son\n"+dpc1+"-"+dpc2+"-"+dpc3+"-"+dpc4+"-"+dpc5,"Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/tirandodados.jpg")));
				
		    	
		    	if (dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc1) {
		    	JOptionPane.showMessageDialog(null, "Cinco dados han sido iguales!!! +12 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/12puntos.jpg")));
		    	puntuacionpc[i]=puntuacionpc[i]+12;	
				}else if ((dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc2)||(dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc3)||(dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc4)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc5)) {
				JOptionPane.showMessageDialog(null, "Cuatro dados han sido iguales!!! +6 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/6puntos.jpg")));
				puntuacionpc[i]=puntuacionpc[i]+6;		
				}else if ((dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc1)||(dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc2)||(dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc3)||(dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc4)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc5)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc5)||(dpc1==dpc3 && dpc3==dpc5 && dpc5==dpc1)||(dpc1==dpc3 && dpc3==dpc5 && dpc5==dpc1)||(dpc1==dpc2 && dpc2==dpc4 && dpc4==dpc1)||(dpc1==dpc2 && dpc2==dpc5 && dpc5==dpc1)||(dpc1==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc1==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc2==dpc3 && dpc3==dpc5 && dpc5==dpc2)||(dpc2==dpc4 && dpc4==dpc5 && dpc5==dpc2)) {
				JOptionPane.showMessageDialog(null, "Tres dados han sido iguales!!! +3 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/3puntos.jpg")));
				puntuacionpc[i]=puntuacionpc[i]+3;
				}else if ((dpc1==dpc2)||(dpc1==dpc3)||(dpc1==dpc4)||(dpc1==dpc5)||(dpc2==dpc3)||(dpc2==dpc4)||(dpc2==dpc5)||(dpc3==dpc4)||(dpc3==dpc5)||(dpc4==dpc5)) {
				JOptionPane.showMessageDialog(null,"Dos dados han sido iguales nuevamente!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/0puntos.jpg")));
				puntuacionpc[i]=puntuacionpc[i]+0;	
				}else if (dpc1!=dpc2 && dpc2!=dpc3 && dpc3!=dpc4 && dpc4!=dpc5 && dpc5!=dpc1) {
				JOptionPane.showMessageDialog(null,"Ningun dado ha sido igual al resto!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/0puntos.jpg")));
				puntuacionpc[i]=puntuacionpc[i]+0;
					
				}
			}else if (dpc1!=dpc2 && dpc2!=dpc3 && dpc3!=dpc4 && dpc4!=dpc5 && dpc5!=dpc1) {
				JOptionPane.showMessageDialog(null,"Ningun dado ha sido igual al resto!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/0puntos.jpg")));
			puntuacionpc[i]=puntuacionpc[i]+0;	
			}
	    	totpc=totpc+puntuacionpc[i];
			JOptionPane.showMessageDialog(null, "******* Maquina: "+totpc+" puntos *******", "Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/maquinapuntos.jpg")));
			
	    	
			
			
			JOptionPane.showMessageDialog(null, "******* Turno de "+nombrej1+" *******","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/tetocaati.jpg")));
			dj1=(int)(Math.random()*6+1);
			dj2=(int)(Math.random()*6+1);
			dj3=(int)(Math.random()*6+1);
			dj4=(int)(Math.random()*6+1);
			dj5=(int)(Math.random()*6+1);
			JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jmezclando.jpg")));
			JOptionPane.showMessageDialog(null, " Su dado es "+dj1 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj1+".png")));
	    	JOptionPane.showMessageDialog(null, " Su dado es "+dj2 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj2+".png")));
	    	JOptionPane.showMessageDialog(null, " Su dado es "+dj3 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj3+".png")));
	    	JOptionPane.showMessageDialog(null, " Su dado es "+dj4 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj4+".png")));
	    	JOptionPane.showMessageDialog(null, " Su dado es "+dj5 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj5+".png")));
	    	if (dj1==dj2 && dj2==dj3 && dj3==dj4 && dj4==dj5 && dj5==dj1) {
	        JOptionPane.showMessageDialog(null, "Cinco dados han sido iguales!!! +12 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j12puntos.jpg")));
	        puntuacionj1[i]=puntuacionj1[i]+12;	
	    	}else if ((dj1==dj2 && dj2==dj3 && dj3==dj4 && dj4==dj1)||(dj2==dj3 && dj3==dj4 && dj4==dj5 && dj5==dj2)||(dj3==dj4 && dj4==dj5 && dj5==dj1 && dj1==dj3)||(dj4==dj5 && dj5==dj1 && dj1==dj2 && dj2==dj4)||(dj5==dj1 && dj1==dj2 && dj2==dj3 && dj3==dj5)) {
	    	JOptionPane.showMessageDialog(null, "Cuatro dados han sido iguales!!! +6 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j6puntos.jpg")));
	    	puntuacionj1[i]=puntuacionj1[i]+6;		
	    	}else if ((dj1==dj2 && dj2==dj3 && dj3==dj1)||(dj2==dj3 && dj3==dj4 && dj4==dj2)||(dj3==dj4 && dj4==dj5 && dj5==dj3)||(dj4==dj5 && dj5==dj1 && dj1==dj4)||(dj5==dj1 && dj1==dj2 && dj2==dj5)||(dj5==dj1 && dj1==dj2 && dj2==dj5)||(dj1==dj3 && dj3==dj5 && dj5==dj1)||(dj1==dj3 && dj3==dj5 && dj5==dj1)||(dj1==dj2 && dj2==dj4 && dj4==dj1)||(dj1==dj2 && dj2==dj5 && dj5==dj1)||(dj1==dj3 && dj3==dj4 && dj4==dj1)||(dj1==dj3 && dj3==dj4 && dj4==dj1)||(dj2==dj3 && dj3==dj5 && dj5==dj2)||(dj2==dj4 && dj4==dj5 && dj5==dj2)) {
	    	JOptionPane.showMessageDialog(null, "Tres dados han sido iguales!!! +3 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j3puntos.jpg")));
	    	puntuacionj1[i]=puntuacionj1[i]+3;		
	    	}else if ((dj1==dj2)||(dj1==dj3)||(dj1==dj4)||(dj1==dj5)||(dj2==dj3)||(dj2==dj4)||(dj2==dj5)||(dj3==dj4)||(dj3==dj5)||(dj4==dj5)) {
	    	JOptionPane.showMessageDialog(null, "Dos dados han sido iguales posee una segunda tirada","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j2tirada.jpg")));
	    	dj1=(int)(Math.random()*6+1);
			dj2=(int)(Math.random()*6+1);
			dj3=(int)(Math.random()*6+1);
			dj4=(int)(Math.random()*6+1);
			dj5=(int)(Math.random()*6+1);
			JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jmezclando.jpg")));
			JOptionPane.showMessageDialog(null, " Su dado es "+dj1 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj1+".png")));
	    	JOptionPane.showMessageDialog(null, " Su dado es "+dj2 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj2+".png")));
	    	JOptionPane.showMessageDialog(null, " Su dado es "+dj3 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj3+".png")));
	    	JOptionPane.showMessageDialog(null, " Su dado es "+dj4 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj4+".png")));
	    	JOptionPane.showMessageDialog(null, " Su dado es "+dj5 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj5+".png")));
	    	if (dj1==dj2 && dj2==dj3 && dj3==dj4 && dj4==dj5 && dj5==dj1) {
	        JOptionPane.showMessageDialog(null, "Cinco dados han sido iguales!!! +12 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j12puntos.jpg")));
	        puntuacionj1[i]=puntuacionj1[i]+12;	
	    	}else if ((dj1==dj2 && dj2==dj3 && dj3==dj4 && dj4==dj1)||(dj2==dj3 && dj3==dj4 && dj4==dj5 && dj5==dj2)||(dj3==dj4 && dj4==dj5 && dj5==dj1 && dj1==dj3)||(dj4==dj5 && dj5==dj1 && dj1==dj2 && dj2==dj4)||(dj5==dj1 && dj1==dj2 && dj2==dj3 && dj3==dj5)) {
	    	JOptionPane.showMessageDialog(null, "Cuatro dados han sido iguales!!! +6 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j6puntos.jpg")));
	    	puntuacionj1[i]=puntuacionj1[i]+6;		
	    	}else if ((dj1==dj2 && dj2==dj3 && dj3==dj1)||(dj2==dj3 && dj3==dj4 && dj4==dj2)||(dj3==dj4 && dj4==dj5 && dj5==dj3)||(dj4==dj5 && dj5==dj1 && dj1==dj4)||(dj5==dj1 && dj1==dj2 && dj2==dj5)||(dj5==dj1 && dj1==dj2 && dj2==dj5)||(dj1==dj3 && dj3==dj5 && dj5==dj1)||(dj1==dj3 && dj3==dj5 && dj5==dj1)||(dj1==dj2 && dj2==dj4 && dj4==dj1)||(dj1==dj2 && dj2==dj5 && dj5==dj1)||(dj1==dj3 && dj3==dj4 && dj4==dj1)||(dj1==dj3 && dj3==dj4 && dj4==dj1)||(dj2==dj3 && dj3==dj5 && dj5==dj2)||(dj2==dj4 && dj4==dj5 && dj5==dj2)) {
	    	JOptionPane.showMessageDialog(null, "Tres dados han sido iguales!!! +3 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j3puntos.jpg")));
	    	puntuacionj1[i]=puntuacionj1[i]+3;
	    	
	    	}else if ((dj1==dj2)||(dj1==dj3)||(dj1==dj4)||(dj1==dj5)||(dj2==dj3)||(dj2==dj4)||(dj2==dj5)||(dj3==dj4)||(dj3==dj5)||(dj4==dj5)) {
	        JOptionPane.showMessageDialog(null, "Dos dados han sido iguales nuevamente!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j0puntos.jpg")));
	        puntuacionj1[i]=puntuacionj1[i]+0;
	        }else if (dj1!=dj2 && dj2!=dj3 && dj3!=dj4 && dj4!=dj5 && dj5!=dj1){
	        JOptionPane.showMessageDialog(null, "Ningun dado ha sido igual al resto!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j0puntos.jpg")));
			puntuacionj1[i]=puntuacionj1[i]+0;	
			}
	    	
	    	}else if (dj1!=dj2 && dj2!=dj3 && dj3!=dj4 && dj4!=dj5 && dj5!=dj1) {
	    	JOptionPane.showMessageDialog(null, "Ningun dado ha sido igual al resto!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j0puntos.jpg")));
	    	puntuacionj1[i]=puntuacionj1[i]+0;
	    	}
	    	totj1=totj1+puntuacionj1[i];
	    	JOptionPane.showMessageDialog(null, "******* "+nombrej1+": "+totj1+" puntos *******", "Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jugadorpuntos.jpg")));	
	    	do {
			fin=(String)(JOptionPane.showInputDialog(null,"�Desea retirarse y ver los resultados?:\n1-Continuar\n2-Retirarse\n(Si ingresas un valor inexistente se reiniciara el cuadro)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/teretiras.jpg")),null,null));
			finn=Integer.parseInt(fin);
			if (finn==2) {
			contp1=0;	
			}
	    	} while (finn!=1 && finn!=2);
			}	
			
			switch (contp1) {
			case 4:
				JOptionPane.showMessageDialog(null, "********** Tabla de resultados **********\nMaquina\nRonda n�1: "+puntuacionpc[0]+ "\nRonda n�2: "+puntuacionpc[1]+"\nRonda n�3: "+puntuacionpc[2]+ "\nRonda n�4: "+puntuacionpc[3]+ "\nRonda n�5: "+puntuacionpc[4]+"\nPuntuaci�n total: "+totpc, "Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/mpuntuaciontotal.jpg")));		
				JOptionPane.showMessageDialog(null, "********** Tabla de resultados **********\n"+nombrej1+"\nRonda n�1: "+puntuacionj1[0]+ "\nRonda n�2: "+puntuacionj1[1]+"\nRonda n�3: "+puntuacionj1[2]+ "\nRonda n�4: "+puntuacionj1[3]+ "\nRonda n�5: "+puntuacionj1[4]+"\nPuntuaci�n total: "+totj1, "Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jpuntuaciontotal.jpg")));		
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "********** Tabla de resultados **********"+"\n"+ "Maquina"+"\n"+ "\nRonda n�1: "+puntuacionpc[0]+ "\nRonda n�2: "+puntuacionpc[1]+"\nRonda n�3: "+puntuacionpc[2]+ "\nRonda n�4: "+puntuacionpc[3]+ "\nRonda n�5: "+puntuacionpc[4]+ "\nRonda n�6: "+puntuacionpc[5]+ "\nRonda n�7: "+puntuacionpc[6]+ "\nRonda n�8: "+puntuacionpc[7]+ "\nRonda n�9: "+puntuacionpc[8]+ "\nRonda n�10: "+puntuacionpc[9]+"\nPuntuaci�n total: "+totpc, "Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jpuntuaciontotal.jpg")));			
				JOptionPane.showMessageDialog(null, "********** Tabla de resultados **********"+"\n"+nombrej1+"\n"+ "\nRonda n�1: "+puntuacionj1[0]+ "\nRonda n�2: "+puntuacionj1[1]+"\nRonda n�3: "+puntuacionj1[2]+ "\nRonda n�4: "+puntuacionj1[3]+ "\nRonda n�5: "+puntuacionj1[4]+ "\nRonda n�6: "+puntuacionj1[5]+ "\nRonda n�7: "+puntuacionj1[6]+ "\nRonda n�8: "+puntuacionj1[7]+ "\nRonda n�9: "+puntuacionj1[8]+ "\nRonda n�10: "+puntuacionj1[9]+"\nPuntuaci�n total: "+totj1, "Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jpuntuaciontotal.jpg")));			
				break;
			}
			
			JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/elganadores.jpg")));
			if (totpc>totj1) {
			JOptionPane.showMessageDialog(null,"", "Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/ganomaquina.jpg")));
			}else if (totj1>totpc) {
			JOptionPane.showMessageDialog(null, nombrej1+" has ganado!!!! Felicidades!!!", "Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/ganojugador.jpg")));	
			}else {
			JOptionPane.showMessageDialog(null, "Ha ocurrido un empate", "Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/empate.jpg")));	
			}
			sn=(String)(JOptionPane.showInputDialog(null,"�Deseas volver a jugar?(responde con si o no)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/recarga1.jpg")),null,null));
			} while (sn.equalsIgnoreCase("si"));
			break;
	        
			
			
			
			
			
			
			case 2://Modalidad 2 jugadores
				do {
					do {//controla que se ponga bien el numero de rondas
						
						
						contp=(String)(JOptionPane.showInputDialog(null,"Ingrese la cantidad de rondas:\n- 5 RONDAS\n-10 RONDAS\n(si ingresas un valor inexistente se reiniciara el cuadro)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/rondas.jpg")),null,null));	
						contpp=Integer.parseInt(contp);
								
						switch (contpp) {
						case 5:
						contp1=4;	
							break;

						case 10:
						contp1=9;
							break;
						}
						} while (contpp!=5 && contpp!=10);	
					nombrej1=(String)(JOptionPane.showInputDialog(null,"Ingrese el nombre del Jugador 1","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jnombrej1.jpg")),null,null));
					nombrej2=(String)(JOptionPane.showInputDialog(null,"Ingrese el nombre del Jugador 2","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jnombrej2.jpg")),null,null));
					for (int i = 0; i <=contp1; i++) {
						JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jjronda"+(i+1)+".jpg")));
					
						
					
					JOptionPane.showMessageDialog(null, "******* Turno de "+nombrej1+" *******","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j1dipper.jpg")));
					dpc1=(int)(Math.random()*6+1);
					dpc2=(int)(Math.random()*6+1);
					dpc3=(int)(Math.random()*6+1);
					dpc4=(int)(Math.random()*6+1);
					dpc5=(int)(Math.random()*6+1);
					JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j1mezclandodados.jpg")));
					JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jj1arrojandodados.jpg")));
					JOptionPane.showMessageDialog(null, " Su dado es "+dpc1 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc1+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dpc2 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc2+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dpc3 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc3+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dpc4 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc4+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dpc5 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc5+".png")));
			    	if (dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc1) {
			    	JOptionPane.showMessageDialog(null, "Cinco dados han sido iguales!!! +12 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j112puntos.jpg")));
			    	puntuacionj1[i]=puntuacionj1[i]+12;	
					}else if ((dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc2)||(dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc3)||(dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc4)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc5)) {
					JOptionPane.showMessageDialog(null, "Cuatro dados han sido iguales!!! +6 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j16puntos.jpg")));
					puntuacionj1[i]=puntuacionj1[i]+6;		
					}else if ((dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc1)||(dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc2)||(dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc3)||(dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc4)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc5)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc5)||(dpc1==dpc3 && dpc3==dpc5 && dpc5==dpc1)||(dpc1==dpc3 && dpc3==dpc5 && dpc5==dpc1)||(dpc1==dpc2 && dpc2==dpc4 && dpc4==dpc1)||(dpc1==dpc2 && dpc2==dpc5 && dpc5==dpc1)||(dpc1==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc1==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc2==dpc3 && dpc3==dpc5 && dpc5==dpc2)||(dpc2==dpc4 && dpc4==dpc5 && dpc5==dpc2)) {
					JOptionPane.showMessageDialog(null, "Tres dados han sido iguales!!! +3 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j13puntos.jpg")));
					puntuacionj1[i]=puntuacionj1[i]+3;		
					}else if ((dpc1==dpc2)||(dpc1==dpc3)||(dpc1==dpc4)||(dpc1==dpc5)||(dpc2==dpc3)||(dpc2==dpc4)||(dpc2==dpc5)||(dpc3==dpc4)||(dpc3==dpc5)||(dpc4==dpc5)) {
						JOptionPane.showMessageDialog(null, "Dos dados han sido iguales posee una segunda tirada","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j12tirada.jpg")));
						dpc1=(int)(Math.random()*6+1);
						dpc2=(int)(Math.random()*6+1);
						dpc3=(int)(Math.random()*6+1);
						dpc4=(int)(Math.random()*6+1);
						dpc5=(int)(Math.random()*6+1);
						JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j1mezclandodados.jpg")));
						JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jj1arrojandodados.jpg")));
						JOptionPane.showMessageDialog(null, " Su dado es "+dpc1 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc1+".png")));
				    	JOptionPane.showMessageDialog(null, " Su dado es "+dpc2 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc2+".png")));
				    	JOptionPane.showMessageDialog(null, " Su dado es "+dpc3 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc3+".png")));
				    	JOptionPane.showMessageDialog(null, " Su dado es "+dpc4 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc4+".png")));
				    	JOptionPane.showMessageDialog(null, " Su dado es "+dpc5 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dpc5+".png")));
				    	if (dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc1) {
				    	JOptionPane.showMessageDialog(null, "Cinco dados han sido iguales!!! +12 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j112puntos.jpg")));
				    	puntuacionj1[i]=puntuacionj1[i]+12;	
						}else if ((dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc2)||(dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc3)||(dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc4)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc5)) {
						JOptionPane.showMessageDialog(null, "Cuatro dados han sido iguales!!! +6 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j16puntos.jpg")));
						puntuacionj1[i]=puntuacionj1[i]+6;		
						}else if ((dpc1==dpc2 && dpc2==dpc3 && dpc3==dpc1)||(dpc2==dpc3 && dpc3==dpc4 && dpc4==dpc2)||(dpc3==dpc4 && dpc4==dpc5 && dpc5==dpc3)||(dpc4==dpc5 && dpc5==dpc1 && dpc1==dpc4)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc5)||(dpc5==dpc1 && dpc1==dpc2 && dpc2==dpc5)||(dpc1==dpc3 && dpc3==dpc5 && dpc5==dpc1)||(dpc1==dpc3 && dpc3==dpc5 && dpc5==dpc1)||(dpc1==dpc2 && dpc2==dpc4 && dpc4==dpc1)||(dpc1==dpc2 && dpc2==dpc5 && dpc5==dpc1)||(dpc1==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc1==dpc3 && dpc3==dpc4 && dpc4==dpc1)||(dpc2==dpc3 && dpc3==dpc5 && dpc5==dpc2)||(dpc2==dpc4 && dpc4==dpc5 && dpc5==dpc2)) {
						JOptionPane.showMessageDialog(null, "Tres dados han sido iguales!!! +3 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j13puntos.jpg")));
						puntuacionj1[i]=puntuacionj1[i]+3;
						}else if ((dpc1==dpc2)||(dpc1==dpc3)||(dpc1==dpc4)||(dpc1==dpc5)||(dpc2==dpc3)||(dpc2==dpc4)||(dpc2==dpc5)||(dpc3==dpc4)||(dpc3==dpc5)||(dpc4==dpc5)) {
						JOptionPane.showMessageDialog(null, "Dos dados han sido iguales nuevamente!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j10puntos.jpg")));
						puntuacionj1[i]=puntuacionj1[i]+0;	
						}else if(dpc1!=dpc2 && dpc2!=dpc3 && dpc3!=dpc4 && dpc4!=dpc5 && dpc5!=dpc1){
						JOptionPane.showMessageDialog(null, "Ningun dado ha sido igual al resto!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j10puntos.jpg")));
						puntuacionj1[i]=puntuacionj1[i]+0;	
						}
				    	
					}else if (dpc1!=dpc2 && dpc2!=dpc3 && dpc3!=dpc4 && dpc4!=dpc5 && dpc5!=dpc1) {
					JOptionPane.showMessageDialog(null, "Ningun dado ha sido igual al resto!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j10puntos.jpg")));
					puntuacionj1[i]=puntuacionj1[i]+0;	
					}
			    	totj11=totj11+puntuacionj1[i];
					JOptionPane.showMessageDialog(null, "******* "+nombrej1+": "+totj11+" puntos ******* ","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j1hastaahora.jpg")));
					
			    	
					
					
					JOptionPane.showMessageDialog(null, "******* Turno de "+nombrej2+" *******","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j2mabel.jpg")));
					dj1=(int)(Math.random()*6+1);
					dj2=(int)(Math.random()*6+1);
					dj3=(int)(Math.random()*6+1);
					dj4=(int)(Math.random()*6+1);
					dj5=(int)(Math.random()*6+1);
					JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j2mezclandodado.jpg")));
					JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jj2arrojandodados.jpg")));
					JOptionPane.showMessageDialog(null, " Su dado es "+dj1 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj1+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dj2 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj2+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dj3 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj3+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dj4 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj4+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dj5 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj5+".png")));
			    	if (dj1==dj2 && dj2==dj3 && dj3==dj4 && dj4==dj5 && dj5==dj1) {
			        JOptionPane.showMessageDialog(null, "Cinco dados han sido iguales!!! +12 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j212puntos.jpg")));
			        puntuacionj2[i]=puntuacionj2[i]+12;	
			    	}else if ((dj1==dj2 && dj2==dj3 && dj3==dj4 && dj4==dj1)||(dj2==dj3 && dj3==dj4 && dj4==dj5 && dj5==dj2)||(dj3==dj4 && dj4==dj5 && dj5==dj1 && dj1==dj3)||(dj4==dj5 && dj5==dj1 && dj1==dj2 && dj2==dj4)||(dj5==dj1 && dj1==dj2 && dj2==dj3 && dj3==dj5)) {
			    	JOptionPane.showMessageDialog(null, "Cuatro dados han sido iguales!!! +6 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j26puntos.jpg")));
			    	puntuacionj2[i]=puntuacionj2[i]+6;		
			    	}else if ((dj1==dj2 && dj2==dj3 && dj3==dj1)||(dj2==dj3 && dj3==dj4 && dj4==dj2)||(dj3==dj4 && dj4==dj5 && dj5==dj3)||(dj4==dj5 && dj5==dj1 && dj1==dj4)||(dj5==dj1 && dj1==dj2 && dj2==dj5)||(dj5==dj1 && dj1==dj2 && dj2==dj5)||(dj1==dj3 && dj3==dj5 && dj5==dj1)||(dj1==dj3 && dj3==dj5 && dj5==dj1)||(dj1==dj2 && dj2==dj4 && dj4==dj1)||(dj1==dj2 && dj2==dj5 && dj5==dj1)||(dj1==dj3 && dj3==dj4 && dj4==dj1)||(dj1==dj3 && dj3==dj4 && dj4==dj1)||(dj2==dj3 && dj3==dj5 && dj5==dj2)||(dj2==dj4 && dj4==dj5 && dj5==dj2)) {
			    	JOptionPane.showMessageDialog(null, "Tres dados han sido iguales!!! +3 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j23puntos.jpg")));
			    	puntuacionj2[i]=puntuacionj2[i]+3;		
			    	}else if ((dj1==dj2)||(dj1==dj3)||(dj1==dj4)||(dj1==dj5)||(dj2==dj3)||(dj2==dj4)||(dj2==dj5)||(dj3==dj4)||(dj3==dj5)||(dj4==dj5)) {
			    	JOptionPane.showMessageDialog(null, "Dos dados han sido iguales posee una segunda tirada","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j22tirada.jpg")));
			    	dj1=(int)(Math.random()*6+1);
					dj2=(int)(Math.random()*6+1);
					dj3=(int)(Math.random()*6+1);
					dj4=(int)(Math.random()*6+1);
					dj5=(int)(Math.random()*6+1);
					JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j2mezclandodado.jpg")));
					JOptionPane.showMessageDialog(null,"","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/jj2arrojandodados.jpg")));
					JOptionPane.showMessageDialog(null, " Su dado es "+dj1 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj1+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dj2 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj2+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dj3 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj3+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dj4 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj4+".png")));
			    	JOptionPane.showMessageDialog(null, " Su dado es "+dj5 , "Tres o m�s", JOptionPane.DEFAULT_OPTION, new ImageIcon(Proyectofinal.class.getResource("/img/dado"+dj5+".png")));
			    	if (dj1==dj2 && dj2==dj3 && dj3==dj4 && dj4==dj5 && dj5==dj1) {
			        JOptionPane.showMessageDialog(null, "Cinco dados han sido iguales!!! +12 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j212puntos.jpg")));
			        puntuacionj2[i]=puntuacionj2[i]+12;	
			    	}else if ((dj1==dj2 && dj2==dj3 && dj3==dj4 && dj4==dj1)||(dj2==dj3 && dj3==dj4 && dj4==dj5 && dj5==dj2)||(dj3==dj4 && dj4==dj5 && dj5==dj1 && dj1==dj3)||(dj4==dj5 && dj5==dj1 && dj1==dj2 && dj2==dj4)||(dj5==dj1 && dj1==dj2 && dj2==dj3 && dj3==dj5)) {
			    	JOptionPane.showMessageDialog(null, "Cuatro dados han sido iguales!!! +6 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j26puntos.jpg")));
			    	puntuacionj2[i]=puntuacionj2[i]+6;		
			    	}else if ((dj1==dj2 && dj2==dj3 && dj3==dj1)||(dj2==dj3 && dj3==dj4 && dj4==dj2)||(dj3==dj4 && dj4==dj5 && dj5==dj3)||(dj4==dj5 && dj5==dj1 && dj1==dj4)||(dj5==dj1 && dj1==dj2 && dj2==dj5)||(dj5==dj1 && dj1==dj2 && dj2==dj5)||(dj1==dj3 && dj3==dj5 && dj5==dj1)||(dj1==dj3 && dj3==dj5 && dj5==dj1)||(dj1==dj2 && dj2==dj4 && dj4==dj1)||(dj1==dj2 && dj2==dj5 && dj5==dj1)||(dj1==dj3 && dj3==dj4 && dj4==dj1)||(dj1==dj3 && dj3==dj4 && dj4==dj1)||(dj2==dj3 && dj3==dj5 && dj5==dj2)||(dj2==dj4 && dj4==dj5 && dj5==dj2)) {
			    	JOptionPane.showMessageDialog(null, "Tres dados han sido iguales!!! +3 puntos","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j23puntos.jpg")));
			    	puntuacionj2[i]=puntuacionj2[i]+3;
			    	}else if ((dj1==dj2)||(dj1==dj3)||(dj1==dj4)||(dj1==dj5)||(dj2==dj3)||(dj2==dj4)||(dj2==dj5)||(dj3==dj4)||(dj3==dj5)||(dj4==dj5)) {
			        JOptionPane.showMessageDialog(null, "Dos dados han sido iguales nuevamente!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j20puntos.jpg")));
			        puntuacionj2[i]=puntuacionj2[i]+0;
			        }else if(dj1!=dj2 && dj2!=dj3 && dj3!=dj4 && dj4!=dj5 && dj5!=dj1){
			        JOptionPane.showMessageDialog(null, "Ningun dado ha sido igual al resto!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j20puntos.jpg")));
					puntuacionj2[i]=puntuacionj2[i]+0;	
					}
			    	}else if (dj1!=dj2 && dj2!=dj3 && dj3!=dj4 && dj4!=dj5 && dj5!=dj1) {
			    	JOptionPane.showMessageDialog(null, "Ningun dado ha sido igual al resto!!! +0 puntos :(","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j20puntos.jpg")));
			    	puntuacionj2[i]=puntuacionj2[i]+0;
			    	}
			    	totj2=totj2+puntuacionj2[i];
			    	JOptionPane.showMessageDialog(null, "******* "+nombrej2+": "+totj2+" puntos *******","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j2hastaahora.jpg")));
			    	fin=(String)(JOptionPane.showInputDialog(null,"�Desean retirarse y ver los resultados?:\n1-Continuar\n2-Retirarse\n(Si ingresas un valor inexistente se reiniciara el cuadro)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/deseanretirarse.jpg")),null,null));
					finn=Integer.parseInt(fin);
					if (finn==2) {
					contp1=0;	
					}
					}	
					switch (contp1) {
					case 4:
						JOptionPane.showMessageDialog(null, "********** Tabla de resultados **********\n"+nombrej1+ "\nRonda n�1: "+puntuacionj1[0]+ "\nRonda n�2: "+puntuacionj1[1]+"\nRonda n�3: "+puntuacionj1[2]+ "\nRonda n�4: "+puntuacionj1[3]+ "\nRonda n�5: "+puntuacionj1[4]+"\nPuntuaci�n total: "+totj11,"Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j1puntuaciontotal.jpg")));	
						JOptionPane.showMessageDialog(null, "********** Tabla de resultados **********\n"+nombrej2+ "\nRonda n�1: "+puntuacionj2[0]+ "\nRonda n�2: "+puntuacionj2[1]+"\nRonda n�3: "+puntuacionj2[2]+ "\nRonda n�4: "+puntuacionj2[3]+ "\nRonda n�5: "+puntuacionj2[4]+"\nPuntuaci�n total: "+totj2,"Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j2puntuaciontotal.jpg")));			
						break;

					case 9:
						JOptionPane.showMessageDialog(null, "********** Tabla de resultados **********\n"+nombrej1+ "\nRonda n�1: "+puntuacionj1[0]+ "\nRonda n�2: "+puntuacionj1[1]+"\nRonda n�3: "+puntuacionj1[2]+ "\nRonda n�4: "+puntuacionj1[3]+ "\nRonda n�5: "+puntuacionj1[4]+ "\nRonda n�6: "+puntuacionj1[5]+ "\nRonda n�7: "+puntuacionj1[6]+ "\nRonda n�8: "+puntuacionj1[7]+ "\nRonda n�9: "+puntuacionj1[8]+ "\nRonda n�10: "+puntuacionj1[9]+"\nPuntuaci�n total: "+totj11,"Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j1puntuaciontotal.jpg")));
						JOptionPane.showMessageDialog(null, "********** Tabla de resultados **********\n"+nombrej2+ "\nRonda n�1: "+puntuacionj2[0]+ "\nRonda n�2: "+puntuacionj2[1]+"\nRonda n�3: "+puntuacionj2[2]+ "\nRonda n�4: "+puntuacionj2[3]+ "\nRonda n�5: "+puntuacionj2[4]+ "\nRonda n�6: "+puntuacionj2[5]+ "\nRonda n�7: "+puntuacionj2[6]+ "\nRonda n�8: "+puntuacionj2[7]+ "\nRonda n�9: "+puntuacionj2[8]+ "\nRonda n�10: "+puntuacionj2[9]+"\nPuntuaci�n total: "+totj2,"Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j2puntuaciontotal.jpg")));
						break;
					}
					
					if (totj2>totj11) {
					JOptionPane.showMessageDialog(null, nombrej2+" ha ganado!!!! Felicidadesss!!!","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j2ganador.jpg")));
					}else if (totj11>totj2) {
					JOptionPane.showMessageDialog(null, nombrej1+" ha ganado!!!! Felicidadesss!!!","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/j1ganador.jpg")));	
					}else {
					JOptionPane.showMessageDialog(null, "Ha ocurrido un empate","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/empatej1j2.jpg")));	
					}
					sn=(String)(JOptionPane.showInputDialog(null,"�Deseas volver a jugar?(responde con si o no)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/recarga.jpg")),null,null));
					} while (sn.equalsIgnoreCase("si"));	
			break;
	    
			}
		break;

	case 2://Adivina el numero
	do {	
	JOptionPane.showMessageDialog(null, "","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/adivinaelnumero.jpg")));
	JOptionPane.showMessageDialog(null, "Adivina el N�mero es un juego en que tienes que utilizar tu l�gica\npara adivinar un n�mero secreto de 5 d�gitos que el ordenador escoge\nal principio del partido. El n�mero est� formado por d�gitos del 0 al 9\ncada d�gito aparece una vez como m�ximo.","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/tituloadivina.jpg")));
	do {
	
	con=(String)(JOptionPane.showInputDialog(null,"Ingrese el nivel de dificultad\n1-Facil (25 rondas y 20 pistas)\n2-Normal (15 rondas y 8 pistas)\n3-Dificil (10 rondas y 2 pistas)\n(si ingresas mal repetira el cuadro)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/niveldedificultad.jpg")),null,null));
	contr1=Integer.parseInt(con);
	switch (contr1) {
	case 1:// Modo facil 25 rondas y 20 pistas
	JOptionPane.showMessageDialog(null, "","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/nivelfacil.jpg")));
	contr=24;
	contpista=20;
	break;

	case 2:// Modo facil 15 rondas y 8 pistas
	JOptionPane.showMessageDialog(null, "","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/nivelnormal.jpg")));
	contr=14;
	contpista=8;
	break;
	
	case 3:// Modo facil 10 rondas y 2 pistas
	JOptionPane.showMessageDialog(null, "","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/niveldificil.jpg")));
	contr=9;
	contpista=2;
	break;
	}
	} while (contr1!=1 && contr1!=2 && contr1!=3);
	
  //controla la repetici�n de los digitos
    for (int i = 0; i <=4; i++) {
	nume=(int)(Math.random()*10);
	fueusado=false;
	for (int j = 0; j <=i; j++) {
	if (nume==numeros[j]) {
	fueusado=true;	
	}	
	}
	if (fueusado) {
	i=i-1;	
	}else {
	numeros[i]=nume;	
	}
    }
    System.out.println("Adivina el numero");
    for (int i = 0; i <=4; i++) {
    System.out.print("-"+numeros[i]);
    }
    //controla la repetici�n de los digitos
    
   for (int t = 0; t <= contr; t++) {
   do {
	contint++;
	num=(String)(JOptionPane.showInputDialog(null,"Ingresar numero del 9 al 0 a ver si aciertas\nNumero de intento: "+contint,"Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/numero"+contadiv+".jpg")),null,null));
	j1num=Integer.parseInt(num);
    } while (j1num<0 || j1num>9);
	if (j1num==numeros[contadiv]) {//has acertado el numero
	contde++;
	JOptionPane.showMessageDialog(null,"Has acertado el "+(contadiv+1)+" lugar del numero\nEl numero era: "+numeros[contadiv]+"\nContinua con el siguiente","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/numero"+contadiv+".jpg")));
	contadiv++;
	if (contadiv==5) {//has ganado
	contr=0;
	JOptionPane.showMessageDialog(null,"Has descubierto el numero completo!!!\nEl numero era: "+numeros[0]+"-"+numeros[1]+"-"+numeros[2]+"-"+numeros[3]+"-"+numeros[4]+"\nGanaste en: "+contde+" intentos","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/ganaste.jpg")));	
	}
    }else if(j1num>=numeros[contadiv]) {//No has acertado el numero
    contde++;
    if (contpista!=0) {
    pista=(String)(JOptionPane.showInputDialog(null,"No has acertado el numero �Deseas una pista?","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")),null,null));
    if (pista.equalsIgnoreCase("si")) {
    JOptionPane.showMessageDialog(null, "El numero es menor al que ingresaste","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));
    contpista=contpista-1;
    JOptionPane.showMessageDialog(null, "Te quedan: "+contpista+" pistas","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));	
    }else {
    JOptionPane.showMessageDialog(null, "Decidiste no utlizar la pista\nPistas restantes: "+contpista,"Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));			
    }	
    }else {
    JOptionPane.showMessageDialog(null,"No has acertado el numero :(","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));
    JOptionPane.showMessageDialog(null, "No te quedan pistas","Adivina el numero", JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));				
    }
	
	}else { //No has acertado el numero
	contde++;
	if (contpista!=0) {
	pista=(String)(JOptionPane.showInputDialog(null,"No has acertado el numero �Deseas una pista?","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")),null,null));
	if (pista.equalsIgnoreCase("si")) {
	JOptionPane.showMessageDialog(null, "El numero es mayor al que ingresaste","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));
	contpista=contpista-1;
	JOptionPane.showMessageDialog(null, "Te quedan: "+contpista+" pistas","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));	
	}else {
			JOptionPane.showMessageDialog(null, "Decidiste no utlizar la pista\nPistas restantes: "+contpista,"Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));			
	}	
	}else {
	JOptionPane.showMessageDialog(null,"No has acertado el numero :(","Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));
	JOptionPane.showMessageDialog(null, "No te quedan pistas","Adivina el numero", JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/pista.jpg")));				
	}
	}	
	}
   if ((contde-1)==contr) {
	   JOptionPane.showMessageDialog(null,"Has fallado al descubrir el numero completo\nEl numero era: "+numeros[0]+"-"+numeros[1]+"-"+numeros[2]+"-"+numeros[3]+"-"+numeros[4],"Adivina el numero",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/perdiste.jpg")));
    }
   contde=0;
   contadiv=0;
   contint=0;
   sn=(String)(JOptionPane.showInputDialog(null,"�Deseas volver a jugar?(responde con si o no)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/recarga3.jpg")),null,null));
	} while (sn.equalsIgnoreCase("si"));
		break;
	}
	sn=(String)(JOptionPane.showInputDialog(null,"�Deseas volver al inicio?(responde con si o no)","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/recarga2.jpg")),null,null));
	} while (sn.equalsIgnoreCase("si"));
    JOptionPane.showMessageDialog(null, "","Tres o mas",JOptionPane.DEFAULT_OPTION,new ImageIcon(Proyectofinal.class.getResource("/img/adios.jpg")));		
	
   

	}
    }

