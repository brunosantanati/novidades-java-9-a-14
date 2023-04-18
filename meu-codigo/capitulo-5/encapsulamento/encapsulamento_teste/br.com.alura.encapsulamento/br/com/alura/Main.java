package br.com.alura;

//import br.com.alura.nf.servico.NotaFiscalServico;
import br.com.alura.nf.util.NotaFiscalUtil;

public class Main {

	public static void main(String[] args) {
		NotaFiscalUtil nfu = new NotaFiscalUtil(); //OK porque exportamos o pacote br.com.alura.nf.util
		//NotaFiscalServico nfs = new NotaFiscalServico(); //NOK porque nao exportamos o pacote br.com.alura.nf.servico no modulo de nf
	}

}
