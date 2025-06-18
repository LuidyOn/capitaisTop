# Calculadora de Rotas entre Capitais do Brasil

Este projeto é uma aplicação Java com interface gráfica (Swing) que permite calcular a menor rota terrestre entre as capitais dos estados brasileiros, exibindo o caminho e a distância total em um mapa do Brasil.

## Funcionalidades

- Seleção de capital de origem e destino.
- Cálculo da menor rota terrestre entre as capitais, considerando as conexões rodoviárias.
- Exibição do caminho percorrido e da distância total.
- Visualização gráfica do trajeto no mapa do Brasil.

## Estrutura do Projeto

```
.
├── src/
│   ├── model/
│   │   ├── Aresta.java
│   │   ├── Capital.java
│   │   ├── GrafoCapitais.java
│   │   ├── NomesCapitais.java
│   │   └── ResultadoRota.java
│   ├── resources/
│   │   └── mapa_brasil.jpg
│   └── utils/
│       ├── Interface.java
│       ├── Main.java
│       └── MapaPanel.java
```

- **model/**: Contém as classes de domínio do grafo (capitais, arestas, nomes, resultado de rota).
- **resources/**: Imagem do mapa do Brasil usada na interface.
- **utils/**: Classes utilitárias, interface gráfica e inicialização do grafo.

## Como Executar

1. **Compile o projeto** (exemplo usando terminal):

   ```sh
   javac -d bin src/model/*.java src/utils/*.java
   ```

2. **Execute a aplicação**:

   ```sh
   java -cp bin utils.Main
   ```



## Exemplo de Uso

1. Abra a aplicação.
2. Selecione a capital de origem e destino nos menus suspensos.
3. Clique em "Calcular Rota".
4. Veja o caminho destacado no mapa, a lista de capitais percorridas e a distância total.

## Créditos

- Projeto acadêmico para estudo de grafos e algoritmos de caminhos mínimos.
- Desenvolvido por Gabriel Fiorio Bonifacio Rodrigue, Luis Gabriel de Oliveira, Maria Eduarda Fernandes Almeida.



