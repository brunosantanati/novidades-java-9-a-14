package br.com.alura.dao;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class PlanetaDAO {

	public void listar() throws URISyntaxException, IOException, InterruptedException {
		HttpClient httpClient = HttpClient.newBuilder().build();

		httpClient.sendAsync(HttpRequest.newBuilder().uri(new URI("http://localhost:8080/planetas")).GET().build(),
				BodyHandlers.ofString()).whenComplete((s, t) -> System.out.println(s.body()));
	}
}
