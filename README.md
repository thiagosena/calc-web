Calculadora Web
========

Sistema Web que irá simular uma calculadora com as 4 operações básicas (Adição, Subtração, Multiplicação e Divisão) consumindo as funções de uma biblioteca ([calc-lib](https://github.com/thiagosena/maven-calclib)) para realizar essas operações.

##Arquitetura
* O sistema está sendo desenvolvido na linguagem java, utilizando o [Play Framework](http://www.playframework.com/), na [versão 1.2.5.3](http://downloads.typesafe.com/play/1.2.5.3/play-1.2.5.3.zip?_ga=1.118093450.261176557.1398211744)
* Usar diretamente as funções da [CalculadoraLib](https://github.com/thiagosena/maven-calclib) e só se preocupa com a leitura dos parâmetros informados pelo usuario e com a renderização do resultado.

##Procedimentos
1. Os commits só poderão ser realizados se for associado a um número de tarefa
    *  Informar um número de tarefa válido no momento em que fizer o commit/push
2. Cada commit/push gera um comentário no registro da tarefa na ferramenta de controle de mudanças, com as seguintes informações
    *  Data do commit
    *  Autor
    *  Arquivos envolvidos
    *  Comentário do log
3. Possuir um sistema de Integração Contínua toda vez que houver alterações no repositório
4. Cada build completada com sucesso, produzirá uma tag/label
5. Builds que não foram completadas devido a erros de compilação ou mesmo de testes, devem enviar uma mensagem para um responsável com os detalhes do erro.
