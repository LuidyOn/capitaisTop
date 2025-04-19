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
