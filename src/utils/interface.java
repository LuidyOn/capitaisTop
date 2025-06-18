package utils;

import model.*;
import javax.swing.*;


import java.awt.*;
import java.util.Arrays;

public class Interface extends JFrame {
    private GrafoCapitais grafo;
    private JComboBox<String> origemComboBox;
    private JComboBox<String> destinoComboBox;
    private JTextArea resultadoArea;
    private JLabel distanciaLabel;
    private MapaPanel mapaPanel;

    public Interface() {
        setTitle("Calculadora de Rotas entre Capitais");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1100); // Ajuste para comportar o mapa maior
        setLocationRelativeTo(null);

        grafo = Main.inicializarGrafo();

        String[] siglas = grafo.capitais.keySet().toArray(new String[0]);
        Arrays.sort(siglas);

        String[] opcoes = new String[siglas.length];
        for (int i = 0; i < siglas.length; i++) {
            opcoes[i] = siglas[i] + " - " + NomesCapitais.NOMES.get(siglas[i]);
        }

        origemComboBox = new JComboBox<>(opcoes);
        destinoComboBox = new JComboBox<>(opcoes);
        JButton calcularBotao = new JButton("Calcular Rota");
        resultadoArea = new JTextArea(4, 30);
        resultadoArea.setEditable(false);

        distanciaLabel = new JLabel("Distância total: ");
        distanciaLabel.setFont(new Font("Arial", Font.BOLD, 14));

        JPanel painelEntrada = new JPanel(new GridLayout(2, 2, 10, 10));
        painelEntrada.setBorder(BorderFactory.createTitledBorder("Entrada"));
        painelEntrada.add(new JLabel("Origem:"));
        painelEntrada.add(origemComboBox);
        painelEntrada.add(new JLabel("Destino:"));
        painelEntrada.add(destinoComboBox);

        JPanel painelSaida = new JPanel(new BorderLayout(5, 5));
        painelSaida.setBorder(BorderFactory.createTitledBorder("Saída"));
        painelSaida.add(distanciaLabel, BorderLayout.NORTH);
        painelSaida.add(new JScrollPane(resultadoArea), BorderLayout.CENTER);

        mapaPanel = new MapaPanel(grafo);
        mapaPanel.setPreferredSize(new Dimension(800, 800)); // Tamanho do mapa ajustado

        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painelCentral.add(mapaPanel);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 10)));
        painelCentral.add(painelEntrada);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 10)));
        calcularBotao.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelCentral.add(calcularBotao);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 10)));
        painelCentral.add(painelSaida);

        add(painelCentral, BorderLayout.CENTER);

        calcularBotao.addActionListener(_ -> calcularRota());
    }

    private void calcularRota() {
        String origemOpcao = (String) origemComboBox.getSelectedItem();
        String destinoOpcao = (String) destinoComboBox.getSelectedItem();

        if (origemOpcao == null || destinoOpcao == null) {
            resultadoArea.setText("Por favor, selecione as capitais.");
            distanciaLabel.setText("Distância total: ");
            mapaPanel.setRota(null);
            return;
        }

        String origem = origemOpcao.split(" - ")[0];
        String destino = destinoOpcao.split(" - ")[0];

        ResultadoRota rota = grafo.calcularMenorRotaTerrestre(origem, destino);
        mapaPanel.setRota(rota);

        if (rota == null) {
            resultadoArea.setText("Não há rota terrestre entre " +
                    NomesCapitais.NOMES.get(origem) + " e " +
                    NomesCapitais.NOMES.get(destino));
            distanciaLabel.setText("Distância total: -");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Caminho:\n");
            for (int i = 0; i < rota.caminho.size(); i++) {
                String sigla = rota.caminho.get(i);
                sb.append(NomesCapitais.NOMES.get(sigla)).append(" (").append(sigla).append(")");
                if (i < rota.caminho.size() - 1) {
                    sb.append(" → ");
                }
            }
            resultadoArea.setText(sb.toString());
            distanciaLabel.setText("Distância total: " + rota.distanciaTotal + " km");
        }
    }
}
