import java.util.*;

class Grafo {
    private final Map<String, List<Aresta>> adjacencia;

    public Grafo() {
        this.adjacencia = new HashMap<>();
    }

    public void adicionarAresta(String origem, String destino, int distancia) {
        origem = origem.toLowerCase();
        destino = destino.toLowerCase();
        adjacencia.putIfAbsent(origem, new ArrayList<>());
        adjacencia.putIfAbsent(destino, new ArrayList<>());
        adjacencia.get(origem).add(new Aresta(destino, distancia));
        adjacencia.get(destino).add(new Aresta(origem, distancia));
    }

    public Result dijkstra(String origem, String destino) {
        origem = origem.toLowerCase();
        destino = destino.toLowerCase();
        Map<String, Integer> distancias = new HashMap<>();
        Map<String, String> predecessores = new HashMap<>();
        PriorityQueue<Aresta> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(a -> a.distancia));

        for (String cidade : adjacencia.keySet()) {
            distancias.put(cidade, Integer.MAX_VALUE);
        }
        distancias.put(origem, 0);
        filaPrioridade.add(new Aresta(origem, 0));

        while (!filaPrioridade.isEmpty()) {
            Aresta atual = filaPrioridade.poll();
            for (Aresta vizinho : adjacencia.getOrDefault(atual.destino, new ArrayList<>())) {
                int novaDistancia = distancias.get(atual.destino) + vizinho.distancia;
                if (novaDistancia < distancias.get(vizinho.destino)) {
                    distancias.put(vizinho.destino, novaDistancia);
                    predecessores.put(vizinho.destino, atual.destino);
                    filaPrioridade.add(new Aresta(vizinho.destino, novaDistancia));
                }
            }
        }

        List<String> caminho = reconstruirCaminho(origem, destino, predecessores);
        int distanciaTotal = distancias.get(destino);

        return new Result(caminho, distanciaTotal);
    }

    private List<String> reconstruirCaminho(String origem, String destino, Map<String, String> predecessores) {
        List<String> caminho = new ArrayList<>();
        String passo = destino;
        while (passo != null) {
            caminho.add(passo);
            passo = predecessores.get(passo);
        }
        Collections.reverse(caminho);
        return caminho;
    }
}

class Aresta {
    String destino;
    int distancia;

    public Aresta(String destino, int distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }

}

class Result {
    List<String> caminho;
    int distancia;

    public Result(List<String> caminho, int distancia) {
        this.caminho = caminho;
        this.distancia = distancia;
    }
}
