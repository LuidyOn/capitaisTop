package utils;

public class interface {
    public static void exibirCabecalho() {
        System.out.println("========================================");
        System.out.println("       ROTEIRO DE CAPITAIS DO BRASIL    ");
        System.out.println("========================================");
    }

    public static void exibirSiglasCapitais() {
        System.out.println("Capitais disponíveis:");
        System.out.println("AC - AL - AP - AM - BA - CE - DF - ES - GO - MA - MT - MS - MG - PA - PB - PR - PE - PI - RJ - RN - RS - RO - RR - SC - SP - SE - TO");
    }

    public static void exibirResultado(ResultadoRota rota, String origem, String destino) {
        if (rota == null) {
            System.out.println("Não foi possível encontrar uma rota entre " + origem + " e " + destino + ".");
        } else {
            System.out.println("Rota encontrada de " + origem + " para " + destino + ":");
            System.out.println("Distância terrestre: " + rota.distanciaTerrestre + " km");
            System.out.println("Caminho: " + rota.caminho);
        }
    }
  
}
