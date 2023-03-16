package Distribuidora;

public class Distribuidora {
	public static void main(String[] args) {
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double outros = 19849.53;
        
        double total = SP + RJ + MG + ES + outros;
        
        double percentualSP = (SP / total) * 100;
        double percentualRJ = (RJ / total) * 100;
        double percentualMG = (MG / total) * 100;
        double percentualES = (ES / total) * 100;
        double percentualOutros = (outros / total) * 100;
        
        System.out.println("Percentual de representação de cada estado:");
        System.out.println("SP: " + percentualSP + "%");
        System.out.println("RJ: " + percentualRJ + "%");
        System.out.println("MG: " + percentualMG + "%");
        System.out.println("ES: " + percentualES + "%");
        System.out.println("Outros: " + percentualOutros + "%");
    }

}
