package br.edu.lista01;

public class Exercicios {

	/**
	 * Calcula o nÉsimo termo da PA
	 * 
	 * @param a1
	 * @param n
	 * @param r
	 * @return o termo na posição n
	 */
	public static double calcularNEsimoTermo(double a1, int n, double r) {
		double an = a1 + (n - 1) * r;
		return an;
	}

	/**
	 * Calcula a distância entre dois pontos no plano cartesiano.
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return A distância entre os pontos.
	 */
	public static double calcularDistanciaEntrePontos(int x1, int y1, int x2,
			int y2) {
		int distanciaX = x2 - x1;
		int distanciaY = y2 - y1;
		double quadradoDistanciaX = Math.pow(distanciaX, 2);
		double quadradoDistanciaY = Math.pow(distanciaY, 2);
		double somaDosQuadrados = quadradoDistanciaX + quadradoDistanciaY;
		double distancia = Math.sqrt(somaDosQuadrados);
		return distancia;
	}

	/**
	 * Calcula a média aritmética entre 3 notas.
	 * 
	 * @param nota1
	 * @param nota2
	 * @param nota3
	 * @return A média aritmética.
	 */
	public static double mediaAritmetica(double nota1, double nota2,
			double nota3) {
		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	/**
	 * Calcula a média ponderada entre 3 notas
	 * 
	 * @param nota1
	 * @param peso1
	 * @param nota2
	 * @param peso2
	 * @param nota3
	 * @param peso3
	 * @return A média ponderada.
	 */
	public static double mediaPonderada(double nota1, int peso1, double nota2,
			int peso2, double nota3, int peso3) {
		double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1
				+ peso2 + peso3);
		return media;
	}

	/**
	 * Calcula a média harmônica entre 3 notas.
	 * 
	 * @param nota1
	 * @param nota2
	 * @param nota3
	 * @return A média ponderada.
	 */
	public static double mediaHarmonica(double nota1, double nota2, double nota3) {
		double inversoNota1 = 1 / nota1;
		double inversoNota2 = 1 / nota2;
		double inversoNota3 = 1 / nota3;
		double somaDosInversos = inversoNota1 + inversoNota2 + inversoNota3;
		double mediaHarmonica = 3 / somaDosInversos;
		return mediaHarmonica;
	}

	/**
	 * Realiza a conversão de temperatura de celsius para fahrenheit
	 * 
	 * @param celsius
	 * @return
	 */
	public static double celsiusParaFahrenheit(double celsius) {
		double fahrenheit = (9 * celsius + 160) / 5;
		return fahrenheit;
	}

	/**
	 * Calcula o volume do cilindro através do raio e da altura.
	 * 
	 * @param raio
	 * @param altura
	 * @return O volume do cilindro
	 */
	public static double calcularVolumeCilindro(double raio, double altura) {
		double areaDabase = Math.PI * Math.pow(raio, 2);
		double volume = areaDabase * altura;
		return volume;
	}

	/**
	 * Calcula o consumo de um automóvel, em litros, para um veículo que consome
	 * em média 12km por litro. Tempo em horas. Velocidade média em km por hora.
	 * 
	 * @param tempo
	 * @param velocidadeMedia
	 * @return O consumo em litros de uma viagem.
	 */
	public static double calculaLitrosConsumidos(double tempo,
			double velocidadeMedia) {
		final double kmPorLitro = 12;
		double distancia = tempo * velocidadeMedia;
		double consumo = distancia / kmPorLitro;
		return consumo;
	}

	/**
	 * Realiza o acréscimo do valor em porcentagem.
	 * 
	 * @param valor
	 * @param acrescimo
	 * @return O valor acrescido com a porcentagem.
	 */
	public static double calcularAcrescimoEmPorcentagem(double valor, double acrescimo) {
		double fracaoIdeal = valor / 100;
		double acrescimoNumerico = acrescimo * fracaoIdeal;
		double valorFinal = valor + acrescimoNumerico;
		return valorFinal;
	}
}
