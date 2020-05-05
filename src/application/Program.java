package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

//algoritimo para fazer calculo de um triangulo
public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// x e y referencias para do tipo Triangulo (pega da classe Triangulo)
		Triangle x , y;
		//instanciar o objeto
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the mesures of triangule x: ");
		x.a = sc.nextDouble();//faz a leitura dos dados e atribui aos atributos
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the mesures of triangule y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
			
		
			// areas recebem o métodos x e y da classe Triangule
			double areaX = x.area();
		     
			double areaY = y.area();
		    
		    System.out.printf("Triangle X area: %.4f%n", areaX);
		    System.out.printf("Triangle Y area: %.4f%n", areaY);
	    

	    if(areaX>areaY) {
	    	System.out.println("Lager area: X");
	    }else {
	    	System.out.println("Lager area: Y");
	    	
	    }
	    sc.close();
	}
}

