package model;

import java.util.*;

public class GrafoCapitais {
    public Map<String, Capital> capitais;
    
    public GrafoCapitais() {
        this.capitais = new HashMap<>();
    }
    
    public void adicionarCapital(String nome) {
        capitais.put(nome, new Capital(nome));
    }
    
    public void adicionarConexaoTerrestre(String origem, String destino, int distancia) {
        capitais.get(origem).conexoes.add(new Aresta(destino, distancia));
        capitais.get(destino).conexoes.add(new Aresta(origem, distancia));
    }
