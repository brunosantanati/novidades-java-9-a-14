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
