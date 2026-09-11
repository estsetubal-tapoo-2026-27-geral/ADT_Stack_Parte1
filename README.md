# ADT Stack — 2026/27 | Parte 1

Este repositório contém um projeto **IntelliJ** de apoio ao estudo dos tipos abstratos de dados em Java, no âmbito da unidade curricular de **Tópicos Avançados de POO** da ESTSetúbal.

## ADT Stack | Exercício

1. Analise a interface `Stack<T>` e identifique as operações disponibilizadas pelo ADT *Stack*.

2. Consulte as exceções definidas no projeto e verifique em que situações devem ser lançadas.

3. Execute o método `main()` e observe o funcionamento da pilha.

4. Altere o método `main()` para verificar o lançamento e o tratamento das exceções. Teste, pelo menos, as seguintes situações:

    - tentar remover um elemento de uma pilha vazia;
    - tentar adicionar um elemento a uma pilha cheia.

5. Modifique o programa para utilizar uma pilha de *strings* (`Stack<String>`) e teste novamente as operações disponíveis.

## Critérios de conclusão

A atividade fica concluída quando:

- são identificadas as operações disponibilizadas pela interface `Stack<T>` e o respetivo comportamento;
- é explicado em que situações são lançadas `EmptyStackException` e `FullStackException`;
- o método `main()` é executado com uma pilha de inteiros e evidencia o comportamento LIFO (*Last In, First Out*);
- o programa testa e trata a tentativa de remover ou consultar um elemento numa pilha vazia;
- o programa testa e trata a tentativa de inserir um elemento numa pilha cheia;
- a implementação é adaptada para utilizar `Stack<String>` sem alterar o contrato do ADT;
- as principais operações são novamente executadas com *strings* e produzem os resultados esperados;
- o projeto compila e executa sem erros não tratados.
