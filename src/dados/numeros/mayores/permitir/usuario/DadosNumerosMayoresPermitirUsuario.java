
package dados.numeros.mayores.permitir.usuario;
import java.util.Random;
public class DadosNumerosMayoresPermitirUsuario {
	public static void main(String[] args){	
	Random MiAleatorio = new Random();
	int d = MiAleatorio.nextInt(6);
	int d2 = MiAleatorio.nextInt(6);
	int d3 = MiAleatorio.nextInt(6);
	System.out.println("El numero aleatorio resultante es:"+d);
	System.out.println("El numero aleatorio resultante es:"+d2);
	System.out.println("El numero aleatorio resultante es:"+d3);
	if(d==6 && d2==6 && d3==6){
		System.out.println("Excelente");	
	}
	else if(d==6 && d2==6){
		System.out.println("Muy bien");	
	}
	else if(d==6 && d3==6){
		System.out.println("Muy bien");	
	}
	else if(d2==6 && d3==6){
		System.out.println("Muy bien");	
	}
	else if(d==6){
		System.out.println("bien");	
	}
	else{
		System.out.println("pesimo");
	}
        }	
        }
  
     
     
     
      
       
      
               
               
               
       
               
        
    
    

