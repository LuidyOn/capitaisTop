package utils;

import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MapaPanel extends JPanel {
    private BufferedImage mapaImagem;
    private GrafoCapitais grafo;
    private ResultadoRota rota;

    public MapaPanel(GrafoCapitais grafo) {
        this.grafo = grafo;
        try {
            mapaImagem = ImageIO.read(getClass().getResourceAsStream("/resources/mapa_brasil.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
            mapaImagem = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = mapaImagem.createGraphics();
            g2d.setColor(Color.RED);
            g2d.fillRect(0, 0, 800, 800);
            g2d.dispose();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (mapaImagem == null) return;

        double escala = Math.min(
            (double) getWidth() / mapaImagem.getWidth(),
            (double) getHeight() / mapaImagem.getHeight()
        );

        int novaLargura = (int) (mapaImagem.getWidth() * escala);
        int novaAltura = (int) (mapaImagem.getHeight() * escala);
        int offsetX = (getWidth() - novaLargura) / 2;
        int offsetY = (getHeight() - novaAltura) / 2;

        
        g.drawImage(mapaImagem, offsetX, offsetY, novaLargura, novaAltura, this);

        
        if (rota != null && rota.caminho != null && rota.caminho.size() > 1) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(0, 100, 255, 200));
            g2.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

            for (int i = 0; i < rota.caminho.size() - 1; i++) {
                Capital origem = grafo.capitais.get(rota.caminho.get(i));
                Capital destino = grafo.capitais.get(rota.caminho.get(i + 1));

                if (origem != null && destino != null) {
                    int x1 = offsetX + (int) (origem.getX() * escala);
                    int y1 = offsetY + (int) (origem.getY() * escala);
                    int x2 = offsetX + (int) (destino.getX() * escala);
                    int y2 = offsetY + (int) (destino.getY() * escala);

                    g2.drawLine(x1, y1, x2, y2);
                }
            }
            g2.dispose();
        }
    }

    public void setRota(ResultadoRota rota) {
        this.rota = rota;
        repaint()
    }
}
