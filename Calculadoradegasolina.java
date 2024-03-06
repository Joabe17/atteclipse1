package exercicio0603;

import java.util.Scanner;
public class Calculadoradegasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variaveis
		double cosmedio, distotal,litros,custotal,combus;
		//Instanciar class scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de Dados
				System.out.println("Informe o valor do litro de gasolina");
				combus = ler.nextDouble();
				
				System.out.println("informe a distancia total:");
				distotal = ler.nextDouble();
				
				System.out.println("Informe o valor do consumo medio:");
				cosmedio = ler.nextDouble();
				
				//Processamento
				litros = distotal/cosmedio;
				custotal = litros*combus;
				
				//Saida
				System.out.println("A quantidade de litros gasto é:" + litros );
				System.out.println("O resultado do custo total é:" + custotal);
	}
				
	}