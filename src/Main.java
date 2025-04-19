import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grafo grafo = new Grafo();

        grafo.adicionarAresta("SP", "RJ", 429);
        grafo.adicionarAresta("SP", "MG", 586);
        grafo.adicionarAresta("RJ", "ES", 521);
        grafo.adicionarAresta("ES", "MG", 522);

        grafo.adicionarAresta("SP", "PR", 408);
        grafo.adicionarAresta("PR", "SC", 300);
        grafo.adicionarAresta("SC", "RS", 476);

        grafo.adicionarAresta("MG", "GO", 906);
        grafo.adicionarAresta("GO", "DF", 209);
        grafo.adicionarAresta("DF", "MT", 1133);
        grafo.adicionarAresta("MT", "MS", 694);
        grafo.adicionarAresta("MS", "GO", 835);

        grafo.adicionarAresta("BA", "SE", 356);
        grafo.adicionarAresta("SE", "AL", 294);
        grafo.adicionarAresta("AL", "PE", 285);
        grafo.adicionarAresta("PE", "PB", 117);
        grafo.adicionarAresta("PB", "RN", 185);
        grafo.adicionarAresta("PE", "PI", 1024);
        grafo.adicionarAresta("PI", "MA", 446);
        grafo.adicionarAresta("BA", "PI", 1124);
        grafo.adicionarAresta("MA", "CE", 985);
        grafo.adicionarAresta("CE", "RN", 538);

        grafo.adicionarAresta("TO", "PA", 966);
        grafo.adicionarAresta("TO", "MA", 808);
        grafo.adicionarAresta("PA", "AP", 839);
        grafo.adicionarAresta("PA", "AM", 2581);
        grafo.adicionarAresta("AM", "RR", 785);
        grafo.adicionarAresta("AM", "RO", 901);
        grafo.adicionarAresta("RO", "AC", 544);
        grafo.adicionarAresta("MT", "RO", 1452);
        grafo.adicionarAresta("TO", "DF", 873);
        grafo.adicionarAresta("GO", "TO", 874);
        grafo.adicionarAresta("MT", "PA", 1660);

        System.out.println("Para facilitar, digite apenas a Sigla dos Estados.");
        System.out.println();
        System.out.println("AC - Rio Branco");
        System.out.println("AL - Maceió");
        System.out.println("AP - Macapá");
        System.out.println("AM - Manaus");
        System.out.println("BA - Salvador");
        System.out.println("CE - Fortaleza");
        System.out.println("DF - Brasília");
        System.out.println("ES - Vitória");
        System.out.println("GO - Goiânia");
        System.out.println("MA - São Luís");
        System.out.println("MT - Cuiabá");
        System.out.println("MS - Campo Grande");
        System.out.println("MG - Belo Horizonte");
        System.out.println("PA - Belém");
        System.out.println("PB - João Pessoa");
        System.out.println("PR - Curitiba");
        System.out.println("PE - Recife");
        System.out.println("PI - Teresina");
        System.out.println("RJ - Rio de Janeiro");
        System.out.println("RN - Natal");
        System.out.println("RS - Porto Alegre");
        System.out.println("RO - Porto Velho");
        System.out.println("RR - Boa Vista");
        System.out.println("SC - Florianópolis");
        System.out.println("SP - São Paulo");
        System.out.println("SE - Aracaju");
        System.out.println("TO - Palmas");
        System.out.println();

        System.out.print("Digite a capital de origem: ");
        String origem = scanner.nextLine().trim().toLowerCase();
        System.out.print("Digite a capital de destino: ");
        String destino = scanner.nextLine().trim().toLowerCase();
    }
}
