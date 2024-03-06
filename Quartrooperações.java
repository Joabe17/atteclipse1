package exercicio0603;
import java.util.Scanner;

public class Quartrooperações {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Variáveis
	double a,b,soma,multe,dev,sub;
	//Instaciar classe Scanner
	Scanner ler = new Scanner (System.in);
	//Entrada de dados
	System.out.println("Informe valor 1: ");
	a = ler.nextDouble();
	System.out.println("Informe valor 2: ");
	b = ler.nextDouble();
	//Processamento
	soma = a+b;
	multe = a*b;
	dev = a/b;
	sub= a-b;
	//Saída
	System.out.println("O resultado da soma é: " + soma);
	System.out.println("O resultado da multiplicação é: " + multe);
	System.out.println("O resultado da divisão é: " + dev);
	System.out.println("O resultado da subtração é: " + sub);
	}

}
