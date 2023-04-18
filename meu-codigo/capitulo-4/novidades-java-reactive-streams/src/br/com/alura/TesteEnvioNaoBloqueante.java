package br.com.alura;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

import br.com.alura.model.NotaFiscal;
import br.com.alura.wsclient.NotaFiscalWSClient;

public class TesteEnvioNaoBloqueante {

	public static void main(String[] args) {
		System.out.println("A thread do TesteEnvioNaoBloqueante é: " + Thread.currentThread().getName());
		NotaFiscal primeiraNotaFiscal = new NotaFiscal("João", 39.99, LocalDate.now());
		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
		NotaFiscalWSClient nfwsc = new NotaFiscalWSClient();
		publisher.consume(nfwsc::enviar);
		publisher.consume(data -> {
			System.out.println("Outra thread: " + Thread.currentThread().getName());
		});
		publisher.submit(primeiraNotaFiscal);
		System.out.println("Você irá receber a nota fiscal no seu e-mail");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();
		publisher.close();
	}
}
