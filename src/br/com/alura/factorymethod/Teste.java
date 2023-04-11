package br.com.alura.factorymethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	//Novidade do Java 9 - Factory Method para Collection.
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		
		//esse código é equivalente ao de cima
		List<String> listaNomes = List.of("primeiroNome", "segundoNome", "terceiroNome");
		System.out.println(listaNomes);
		
		//também temos o método of para Set e Map
		Set<String> meuSet = Set.of("outroNome");
		Map<String, String> meuMap = Map.of("nome", "João");
		
		System.out.println(meuSet);
		System.out.println(meuMap);
	}
}
