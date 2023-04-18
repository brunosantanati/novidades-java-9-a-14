module br.com.alura.http {
	requires transitive br.com.alura.modelo;
	requires java.net.http;
	
	exports br.com.alura.http.dao;
}