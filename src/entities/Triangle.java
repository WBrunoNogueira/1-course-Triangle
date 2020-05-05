package entities;

public class Triangle {
	//atributos
	public double a;
	public double b;
	public double c;
	
	
	//metodo - obs vou usar atributos que não estao aqui na classe? não entao n precisa de parametros
	public double area(){
		//formula para obter o valor do perimetro
		double p = (a + b + c) / 2.0;
		//apartir do perimetro, formula para obter a Area
		double result = Math.sqrt( p * (p - a) * (p - b ) * (p - c ));
		return result;
	}
}
