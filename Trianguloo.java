package exercicio0603;
import java.util.Scanner;
public class Trianguloo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		double base,altura,area;
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


