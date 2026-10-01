package Project_Calc;

import java.util.Scanner;

public class Calculadora_Project {

	static double lerNumero(Scanner entrada) {

		System.out.println("Qual o número?");
		double numero = entrada.nextDouble();
		return numero;

	}

	static double lerNumero(Scanner entrada, String txt) {

		System.out.println(txt);

		double numero = entrada.nextDouble();
		return numero;

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double resultado = 0;
		double radiano = 0;
		double num1 = 0;
		double num2 = 0;

		System.out.println("----------------------------");
		System.out.println("+ = soma ");
		System.out.println("- = subtração ");
		System.out.println("x = multiplicação ");
		System.out.println("/ = divisão ");
		System.out.println("% = porcentagem");
		System.out.println("r = radiciação ");
		System.out.println("p = potenciação");
		System.out.println("sen = seno");
		System.out.println("cos = cosseno");
		System.out.println("tan = tangente");
		System.out.println("pi = valor de PI ");
		System.out.println("log = logaritmo");
		System.out.println("log10 = logaritmo na base10");
		System.out.println("Qual operação? ");
		String opcao = entrada.next();
		System.out.println("----------------------------");

		switch (opcao) {

		default:
			System.out.println("Opção inválida!");
			System.exit(0);

		case "+":
			num1 = lerNumero(entrada);
			num2 = lerNumero(entrada);

			resultado = num1 + num2;

			break;

		case "-":
			num1 = lerNumero(entrada);
			num2 = lerNumero(entrada);

			resultado = num1 - num2;

			break;

		case "x":
			num1 = lerNumero(entrada);
			num2 = lerNumero(entrada);

			resultado = num1 * num2;

			break;

		case "/":
			num1 = lerNumero(entrada);
			num2 = lerNumero(entrada);

			if (num2 == 0) {

				System.out.println("Impossivel dividir por zero!");

			} else {
				resultado = num1 / num2;
			}

			break;

		case "%":
			num1 = lerNumero(entrada, "Qual porcentagem?");
			num2 = lerNumero(entrada, "Qual o número?");

			resultado = (num1 / 100) * num2;

			break;

		case "r":
			num1 = lerNumero(entrada, "Qual o número para calcular a raiz?");

			resultado = Math.sqrt(num1);

			break;

		case "p":
			num1 = lerNumero(entrada, "Base?");
			num2 = lerNumero(entrada, "Expoente?");

			resultado = Math.pow(num1, num2);

			break;

		case "sen":
			num1 = lerNumero(entrada, "Qual ângulo?");

			radiano = Math.toRadians(num1);
			resultado = Math.sin(radiano);

			break;

		case "cos":
			num1 = lerNumero(entrada, "Qual ângulo?");

			radiano = Math.toRadians(num1);
			resultado = Math.cos(radiano);

			break;

		case "tan":
			num1 = lerNumero(entrada, "Qual ângulo?");

			radiano = Math.toRadians(num1);
			resultado = Math.tan(radiano);

			break;

		case "pi":

			resultado = Math.PI;

			break;

		case "log":

			num1 = lerNumero(entrada, "Qual o valor para logaritmo?");

			resultado = Math.log(num1);

			break;

		case "log10":

			num1 = lerNumero(entrada, "Qual o valor para log10?");

			resultado = Math.log10(num1);

			break;

		}

		System.out.println(resultado);

	}

}
