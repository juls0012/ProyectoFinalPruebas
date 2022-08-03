package actividad;
import java.util.Scanner;

public class pruebaOrdenamientoSeleccion
{
   public static void main( String[] args )
   {
      
	  // crea objeto para realizar el ordenamiento por selección
	   
	  boolean verificar =  false;
	  Scanner entrada = new Scanner(System.in);
	  System.out.println("Por favor ingresa la longitud del array, numero entre 10 y 20");
	  int tamanio = entrada.nextInt();
	  if(tamanio<10 || tamanio>20) {
		  
		  while(verificar==false) {
			  
			  System.out.println("Ingresa un valor entre 10 y 20");
			  tamanio = entrada.nextInt();
			  if(tamanio>=10 && tamanio<=20) {
			  verificar=true;
			  }
		  }
	  
	  }
  
	 
	  

      OrdenamientoSeleccion arregloOrden = new OrdenamientoSeleccion( tamanio );
      
      System.out.println( "Arreglo desordenado:" );
      System.out.println( arregloOrden ); // imprime arreglo desordenado

      arregloOrden.ordenar(); // ordena el arreglo

      System.out.println( "Arreglo ordenado:" );
      System.out.println( arregloOrden ); // imprime el arreglo ordenado
   } // fin de main
} // fin de la clase PruebaOrdenamientoSeleccion
