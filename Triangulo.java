package exercicio0603;
import java.util.Scanner;

public class triangulo {
	
	public static void main(String[] args) {
		//Variáveis
		double altura,area,base;
		//instanciar classe scanner
		Scanner ler = new Scanner (System.in);
		//Entrada de dados
		System.out.println("Informe o valor da base:");
		base = ler.nextDouble();
		System.out.println("Informe o valor da altura:");
		altura = ler.nextDouble();
		//Processamento
		area =((base* altura))/ 2;
		//Saída de dados
		System.out.println("O resultado em graus celcius é: " + area );
		ler.close();
	}
	}