package java_collection_02;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();
	}

	//private Map<String, String> mapa = new HashMap<String, String>();
	private Map<String, String> mapa = null;

	private void start() {
		adicionarItensNoMapa();
		exibirValorDoMapaPelaChave("SRS");
		exibirValorDoMapaPelaChave("VALOR QUE N�O EXISTE !");
		iterarMapa();
	}

	private void adicionarItensNoMapa() {

		try {
			mapa.put("SRS", "Santa Rita do Sapucai");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajub�");
			mapa.put("ZORO", "Concei��o dos Ouros");
			mapa.put("CACHU", "Cachoeira de Minas");

			System.out.println("Cheguei no fim do try");
		} catch (Exception e) {
			System.out.println("Ocorreu uma exce��o!");
		} finally {
			System.out.println("Cheguei no finally");
		}

	}

	private void exibirValorDoMapaPelaChave(String chave) {

		String valorDoItemNoMapa = mapa.get(chave);
		if (valorDoItemNoMapa == null || valorDoItemNoMapa.isEmpty()) {
			System.out.println("Esta chave n�o " + "est� presente no mapa: " + chave);
		} else {
			System.out.println("O valor dessa chave eh: " + mapa.get(chave));

		}

	}

	private void iterarMapa() {

		System.out.println("------");
		for (String chave : mapa.keySet()) {
			System.out.println("Chave: " + chave + " | Valor: " + mapa.get(chave));
		}
	}
}
