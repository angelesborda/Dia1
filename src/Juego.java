import java.util.Random;
//import java.util.Scanner;

public class Juego {
	public static void main( String[] args )
    {
		/*
		System.out.println ("Ingrese la cantidad total de palos:");
		Scanner entrada= new Scanner (System.in);;
		int total=Integer.valueOf(entrada.nextLine());
		 Palo p = new Palo();
		 p.setPalo(total);
		int canTotal=p.getPalos();
		*/
		
    	int canTotal=21;
		
		Jugador j1= new Jugador();
		Jugador j2= new Jugador();
		
		/*
		System.out.println ("Ingrese el nombre del jugador 1:");
		Scanner jugador= new Scanner (System.in);;
		String nombre=String.valueOf(entrada.nextLine());
		
		j1.setNombre(nombre);
		
		System.out.println ("Ingrese el nombre del jugador 2:");
		jugador= new Scanner (System.in);;
		nombre=String.valueOf(entrada.nextLine());
		
		j2.setNombre(nombre);
		 
		*/ 
	    j1.setCantidad(0);
        j2.setCantidad(0);
        
        Random  rnd = new Random();
        
        int palosQuedan=canTotal;
        int paloSacado;
        String  turno="";
       
        if (rnd.nextInt()%2!=0){
        	while (palosQuedan>0){
        		turno = "jugador 1";
        		if(palosQuedan!=1){
        			paloSacado = rnd.nextInt(2) + 1;
            		System.out.println("el jugador 1 saco " + paloSacado + " palos");
            		palosQuedan = j1.jugar(j1, paloSacado, palosQuedan);
        		}
        		else{
        			palosQuedan = j1.jugar(j1, 1, palosQuedan);
        			System.out.println("el jugador 1 saco " + 1 + " palo - obligatorio");
        		}
        		
            	if(palosQuedan>0){
        			turno="jugador 2";
            		if(palosQuedan!=1){
            			paloSacado = rnd.nextInt(2) + 1;
                		System.out.println("el jugador 2 saco " + paloSacado + " palos");
                		palosQuedan = j2.jugar(j2, paloSacado, palosQuedan);
            		}
            		else{
            			palosQuedan = j2.jugar(j2, 1, palosQuedan);
            			System.out.println("el jugador 2 saco 1 palo obligatorio");
            		}
            	}
        	}
        }
        else{
        	while (palosQuedan>0){
        		turno = "jugador 2";
        		if(palosQuedan !=1){
        			paloSacado = rnd.nextInt(2) + 1;
            		System.out.println("el jugador 2 saco " + paloSacado + " palos");
            		palosQuedan = j2.jugar(j2, paloSacado, palosQuedan);
        		}
        		else{
        			System.out.println("el jugador 2 saco " + 1 + " palos");
            		palosQuedan = j2.jugar(j2, 1, palosQuedan);
        		}
        		
            	
            	if(palosQuedan>0){
            		turno="jugador 1";
            		if(palosQuedan!=1){
            			paloSacado = rnd.nextInt(2) + 1;
            			System.out.println("el jugador 1 saco " + paloSacado + " palos");
                		palosQuedan = j1.jugar(j1, paloSacado, palosQuedan);
                		
            		}
            		else{
            			System.out.println("el jugador 1 saco " + 1 + " palos -- obligatorio 1");
            			palosQuedan = j1.jugar(j1, 1, palosQuedan);
            		}
            		
            		
            	}
            	
            }
        }
        if(turno.equalsIgnoreCase("jugador 1")){
			
        	System.out.println("El jugador 2 ganó. tiene " + j2.getCantidad() + " palos y el jugador 1 tiene " + j1.getCantidad() + " palos");
		}
		else{
			
			System.out.println("El jugador 1 ganó. Tiene " + j1.getCantidad() + " palos y el jugador 2 " + j2.getCantidad());
		}
	}

}
