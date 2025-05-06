import model.*;
import utils.NomesCapitais;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        GrafoCapitais grafo = inicializarGrafo();
        Scanner scanner = new Scanner(System.in);

        exibirCabecalho();
        exibirSiglasCapitais();
        
        System.out.print("Digite a capital de origem: ");
        String origem = scanner.nextLine().toUpperCase();
        
        System.out.print("Digite a capital de destino: ");
        String destino = scanner.nextLine().toUpperCase();
        
        if (!grafo.capitais.containsKey(origem) || !grafo.capitais.containsKey(destino)) {
            System.out.println("Uma ou ambas as capitais informadas não são válidas.");
            return;
        }
        
        ResultadoRota rotaTerrestre = grafo.calcularMenorRotaTerrestre(origem, destino);
        
        exibirResultado(rotaTerrestre, origem, destino);
        
        scanner.close();
    }

    private static GrafoCapitais inicializarGrafo() {
        GrafoCapitais grafo = new GrafoCapitais();
        
        // Adicionando capitais
        grafo.adicionarCapital("AC");
        grafo.adicionarCapital("AL");
        grafo.adicionarCapital("AP");
        grafo.adicionarCapital("AM");
        grafo.adicionarCapital("BA");
        grafo.adicionarCapital("CE");
        grafo.adicionarCapital("DF");
        grafo.adicionarCapital("ES");
        grafo.adicionarCapital("GO");
        grafo.adicionarCapital("MA");
        grafo.adicionarCapital("MT");
        grafo.adicionarCapital("MS");
        grafo.adicionarCapital("MG");
        grafo.adicionarCapital("PA");
        grafo.adicionarCapital("PB");
        grafo.adicionarCapital("PR");
        grafo.adicionarCapital("PE");
        grafo.adicionarCapital("PI");
        grafo.adicionarCapital("RJ");
        grafo.adicionarCapital("RN");
        grafo.adicionarCapital("RS");
        grafo.adicionarCapital("RO");
        grafo.adicionarCapital("RR");
        grafo.adicionarCapital("SC");
        grafo.adicionarCapital("SP");
        grafo.adicionarCapital("SE");
        grafo.adicionarCapital("TO");

        // Adicionando conexões
        grafo.adicionarConexaoTerrestre("ES", "RJ", 521);
        grafo.adicionarConexaoTerrestre("RJ", "SP", 429);
        grafo.adicionarConexaoTerrestre("SP", "PR", 408);
        grafo.adicionarConexaoTerrestre("PR", "SC", 300);
        grafo.adicionarConexaoTerrestre("SC", "RS", 476);
        grafo.adicionarConexaoTerrestre("SP", "MG", 586);
        grafo.adicionarConexaoTerrestre("MG", "DF", 740);
        grafo.adicionarConexaoTerrestre("DF", "GO", 209);
        grafo.adicionarConexaoTerrestre("GO", "MT", 934);
        grafo.adicionarConexaoTerrestre("MT", "MS", 694);
        grafo.adicionarConexaoTerrestre("MS", "SP", 1014);
        grafo.adicionarConexaoTerrestre("MG", "BA", 1372);
        grafo.adicionarConexaoTerrestre("BA", "SE", 356);
        grafo.adicionarConexaoTerrestre("SE", "AL", 294);
        grafo.adicionarConexaoTerrestre("AL", "PE", 285);
        grafo.adicionarConexaoTerrestre("PE", "PB", 120);
        grafo.adicionarConexaoTerrestre("PB", "RN", 185);
        grafo.adicionarConexaoTerrestre("PE", "PI", 800);
        grafo.adicionarConexaoTerrestre("PI", "MA", 446);
        grafo.adicionarConexaoTerrestre("MA", "PA", 806);
        grafo.adicionarConexaoTerrestre("PA", "AP", 308);
        grafo.adicionarConexaoTerrestre("PA", "AM", 5299);
        grafo.adicionarConexaoTerrestre("AM", "RR", 785);
        grafo.adicionarConexaoTerrestre("AM", "RO", 901);
        grafo.adicionarConexaoTerrestre("RO", "AC", 544);
        grafo.adicionarConexaoTerrestre("BA", "TO", 1213);
        grafo.adicionarConexaoTerrestre("TO", "MA", 1355);
        grafo.adicionarConexaoTerrestre("MG", "ES", 524);
        grafo.adicionarConexaoTerrestre("MG", "RJ", 434);
        
        return grafo;
    }

