package model;

import java.util.ArrayList;
import java.util.List;

public class Capital {
    private String sigla;
    private int x, y;
    public List<Aresta> conexoes;

    public Capital(String sigla, int x, int y) {
        this.sigla = sigla;
        this.x = x;
        this.y = y;
        this.conexoes = new ArrayList<>();
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public String getSigla() { return sigla; }

  
}
