package exercicio0603;

import java.util.Scanner;
public class Calculadoradetemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variaveis
		double celcius, fahrenheit;
		//Instanciar classe scanner
		Scanner ler = new Scanner (System.in);

		//Entrada de Dados
		System.out.println("Informe a temperatura em fahrenheint:");
		fahrenheit = ler.nextDouble();

		//Processamento
		celcius = ((fahrenheit - 32)*5) /9;

		//Saida
		System.out.println("o resultado em graus celcius é:" + celcius);
	}
}