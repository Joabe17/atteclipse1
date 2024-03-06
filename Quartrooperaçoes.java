package exercicio0603;
import java.util.Scanner;
public class Quartrooperaçoes {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		double a,b,soma,multip,divi,subt;
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		//Entrada de dados
		System.out.println("Informe valor 1: ");
		a = ler.nextDouble();
		System.out.println("Informe valor 2: ");
		b = ler.nextDouble();
		//Processamento
		soma = a+b;
		multip = a*b;
		divi = a/b;
		subt= a-b;
		//Saída
		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da multiplicação é: " + multip);
		System.out.println("O resultado da divisão é: " + divi);
		System.out.println("O resultado da subtração é: " + subt);
		}
		}

