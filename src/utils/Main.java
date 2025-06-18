package utils;

import model.*;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new Interface().setVisible(true));
    }

 public static GrafoCapitais inicializarGrafo() {
    GrafoCapitais grafo = new GrafoCapitais();
    
    grafo.adicionarCapital("AC",  119,  327);   // Rio Branco
    grafo.adicionarCapital("AL", 706, 324);   // Maceió
    grafo.adicionarCapital("AP", 429, 143);   // Macapá
    grafo.adicionarCapital("AM", 265, 208);   // Manaus
    grafo.adicionarCapital("BA", 648, 378);   // Salvador
    grafo.adicionarCapital("CE", 652, 217);   // Fortaleza
    grafo.adicionarCapital("DF", 483, 426);   // Brasília
    grafo.adicionarCapital("ES", 613, 503);   // Vitória
    grafo.adicionarCapital("GO", 466, 444);   // Goiânia
    grafo.adicionarCapital("MA", 543, 203);   // São Luís
    grafo.adicionarCapital("MT", 343, 425);   // Cuiabá
    grafo.adicionarCapital("MS", 367, 512);   // Campo Grande
    grafo.adicionarCapital("MG", 555 , 502);   // Belo Horizonte
    grafo.adicionarCapital("PA", 479, 176);   // Belém
    grafo.adicionarCapital("PB", 717, 280);   // João Pessoa
    grafo.adicionarCapital("PR", 456, 598);   // Curitiba
    grafo.adicionarCapital("PE", 719, 302);   // Recife
    grafo.adicionarCapital("PI", 580, 244);   // Teresina
    grafo.adicionarCapital("RJ", 559, 560);   // Rio de Janeiro
    grafo.adicionarCapital("RN", 713, 252);   // Natal
    grafo.adicionarCapital("RS", 429,680);   // Porto Alegre
    grafo.adicionarCapital("RO", 195, 320);   // Porto Velho
    grafo.adicionarCapital("RR", 256, 94);   // Boa Vista
    grafo.adicionarCapital("SC", 467, 641);   // Florianópolis
    grafo.adicionarCapital("SP",  502, 570);   // São Paulo
    grafo.adicionarCapital("SE", 676, 350);   // Aracaju
    grafo.adicionarCapital("TO", 481, 334);   // Palmas
    
    
    grafo.adicionarConexaoTerrestre("ES", "RJ", 521);
    grafo.adicionarConexaoTerrestre("RJ", "SP", 429);
    grafo.adicionarConexaoTerrestre("SP", "PR", 408);
    grafo.adicionarConexaoTerrestre("PR", "SC", 300);
    grafo.adicionarConexaoTerrestre("SC", "RS", 476);
    grafo.adicionarConexaoTerrestre("SP", "MG", 586);
    grafo.adicionarConexaoTerrestre("MG", "DF", 740);
    grafo.adicionarConexaoTerrestre("DF", "GO", 209);
    grafo.adicionarConexaoTerrestre("MS", "PR", 990);
    grafo.adicionarConexaoTerrestre("GO", "DF", 209); 
    grafo.adicionarConexaoTerrestre("BA", "PI", 1145);
    grafo.adicionarConexaoTerrestre("ES", "BA", 851);
    grafo.adicionarConexaoTerrestre("AC", "RO", 509);
    grafo.adicionarConexaoTerrestre("GO", "MT", 934);
    grafo.adicionarConexaoTerrestre("MT", "MS", 694);
    grafo.adicionarConexaoTerrestre("RO", "MT", 600);
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
    grafo.adicionarConexaoTerrestre("CE", "PI", 634);
    grafo.adicionarConexaoTerrestre("CE", "RN", 537);
    grafo.adicionarConexaoTerrestre("CE", "PB", 688);
    grafo.adicionarConexaoTerrestre("CE", "PE", 800);
    grafo.adicionarConexaoTerrestre("MG", "GO", 906);
    grafo.adicionarConexaoTerrestre("DF", "MT", 1133);
    grafo.adicionarConexaoTerrestre("MT", "PA", 1783);
    grafo.adicionarConexaoTerrestre("PA", "TO", 1155);
    grafo.adicionarConexaoTerrestre("PA", "RR", 1187);
    grafo.adicionarConexaoTerrestre("RR", "AP", 1942);
    grafo.adicionarConexaoTerrestre("PI", "TO", 902);
    grafo.adicionarConexaoTerrestre("AL", "BA", 732);
    grafo.adicionarConexaoTerrestre("MA", "TO", 808);
    grafo.adicionarConexaoTerrestre("TO", "GO", 874);
    grafo.adicionarConexaoTerrestre("MT", "AM", 2300);
    grafo.adicionarConexaoTerrestre("RN", "CE", 537);
    grafo.adicionarConexaoTerrestre("PB", "CE", 688);
    grafo.adicionarConexaoTerrestre("PE", "RN", 285);
    grafo.adicionarConexaoTerrestre("AL", "SE", 294);
    grafo.adicionarConexaoTerrestre("BA", "MG", 1372);
    grafo.adicionarConexaoTerrestre("BA", "ES", 851);
    grafo.adicionarConexaoTerrestre("MG", "SP", 586);
    grafo.adicionarConexaoTerrestre("PR", "SC", 300);
    grafo.adicionarConexaoTerrestre("SC", "RS", 476);
    grafo.adicionarConexaoTerrestre("RS", "SC", 476);
    grafo.adicionarConexaoTerrestre("GO", "TO", 874);
    grafo.adicionarConexaoTerrestre("TO", "PA", 1155);
    grafo.adicionarConexaoTerrestre("PA", "AP", 308);
    grafo.adicionarConexaoTerrestre("AP", "AM", 1187);
    grafo.adicionarConexaoTerrestre("AM", "RR", 785);
    grafo.adicionarConexaoTerrestre("RR", "PA", 1187);
    grafo.adicionarConexaoTerrestre("MT", "RO", 600);
    grafo.adicionarConexaoTerrestre("RO", "AM", 901);
    grafo.adicionarConexaoTerrestre("MT", "PA", 1783);
    grafo.adicionarConexaoTerrestre("MT", "TO", 1133);
    grafo.adicionarConexaoTerrestre("GO", "MS", 934);
    grafo.adicionarConexaoTerrestre("MS", "SP", 1014);
    grafo.adicionarConexaoTerrestre("MS", "PR", 990);
    grafo.adicionarConexaoTerrestre("PR", "MS", 990);
    grafo.adicionarConexaoTerrestre("MG", "GO", 906);
    grafo.adicionarConexaoTerrestre("DF", "MG", 740);
    grafo.adicionarConexaoTerrestre("DF", "TO", 1133);
    grafo.adicionarConexaoTerrestre("TO", "MA", 1355);
    grafo.adicionarConexaoTerrestre("MA", "PI", 446);
    grafo.adicionarConexaoTerrestre("PI", "CE", 634);
    grafo.adicionarConexaoTerrestre("PE", "PB", 116);
    grafo.adicionarConexaoTerrestre("PB", "RN", 179);


    return grafo;
}
    
  
}
