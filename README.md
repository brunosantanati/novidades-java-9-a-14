## Comandos jshell

```
/help
/set feedback verbose
/set feedback silent
/list
/set feedback normal
/edit
/drop 8

Para ver documentação de uma class, digitar por exemplo:
Stream
e apertar tab.

Para ver a documentação de um método, digitar por exemplo:
Stream.of()
e apertar tab.

Para salvar:
/save /home/myuser/capitulo-2.jsh

Para abrir arquivo salvo:
jshell /home/myuser/capitulo-2.jsh

/exit
```

## Diferentes jeitos de salvar arquivo no jshell

[Link para o artigo](https://www.tutorialspoint.com/how-to-save-the-current-jshell-session-in-java-9)  

```
/save [file-path]: without argument, this command saves all of the active code entered during the session in the file entered in the second argument. Note that the code entered in error and the internal commands are not saved in the file.
/save -all [file-path]: saves all of the active code, in error and at startup, entered during the session, in the file entered as the second argument. Internal orders entered are not recorded.
/save -history [file-path]: saves all the code and commands entered during the session, in the file entered in the second argument. Even the internal commands are saved in the file.
/save -start: saves all the code launched when JShell starts.
```

## Outros comandos utilizados no curso

```
Antes de rodar o exemplo do capítulo 3:
https://github.com/brunosantanati/novidades-java-9-a-14/blob/main/meu-codigo/capitulo-3/req-assincrona-http2/src/br/com/alura/TesteDAO.java
rodar esse comando:
java -jar novidades-java-rest-0.0.1-SNAPSHOT.jar

Dentro da pasta do projeto (e-livraria) rodar os comandos abaixo para compilar e executar o programa:

javac -d bin/ -cp bin src/br/com/alura/modelo/dominio/Categoria.java src/br/com/alura/modelo/dominio/Livro.java src/br/com/alura/modelo/dominio/NotaFiscal.java src/br/com/alura/http/dao/LivroDAO.java src/br/com/alura/nf/servico/NotaFiscalServico.java src/br/com/alura/nf/subscriber/NotaFiscalSubscriber.java src/br/com/alura/nf/util/NotaFiscalUtil.java src/br/com/alura/Principal.java

java -cp bin br.com.alura.Principal

Para criar um módulo, executar dentro da pasta src:

mkdir br.com.alura
mv br br.com.alura/
Dentro da pasta src/br.com.alura criar o arquivo module.info.java

Para compilar e executar a aplicação modular, rodar na pasta do projeto (e-livraria):

javac -d mods/br.com.alura --module-path mods src/br.com.alura/br/com/alura/modelo/dominio/Categoria.java src/br.com.alura/br/com/alura/modelo/dominio/Livro.java src/br.com.alura/br/com/alura/modelo/dominio/NotaFiscal.java src/br.com.alura/br/com/alura/http/dao/LivroDAO.java src/br.com.alura/br/com/alura/nf/servico/NotaFiscalServico.java src/br.com.alura/br/com/alura/nf/subscriber/NotaFiscalSubscriber.java src/br.com.alura/br/com/alura/nf/util/NotaFiscalUtil.java src/br.com.alura/br/com/alura/Principal.java src/br.com.alura/module-info.java

java --module-path mods -m br.com.alura/br.com.alura.Principal
```
