package control;

public class Probabilidade {
	   public final static void calcularTipagemFilho(String tipagemMae, String tipagemPai) {
	        System.out.println("Probabilidades da Tipagem Sanguínea do Filho:");

	    
	        if (tipagemMae.equals("O") && tipagemPai.equals("O")) {
	            System.out.println("100% de chance de ser O");
	        } else if (tipagemMae.equals("A") && tipagemPai.equals("A")) {
	            System.out.println("75% de chance de ser A, 25% de chance de ser O");
	        } else if (tipagemMae.equals("B") && tipagemPai.equals("B")) {
	            System.out.println("75% de chance de ser B, 25% de chance de ser O");
	        } else if (tipagemMae.equals("A") && tipagemPai.equals("O") || tipagemMae.equals("O") && tipagemPai.equals("A")) {
	            System.out.println("50% de chance de ser A, 50% de chance de ser O");
	        } else if (tipagemMae.equals("B") && tipagemPai.equals("O") || tipagemMae.equals("O") && tipagemPai.equals("B")) {
	            System.out.println("50% de chance de ser B, 50% de chance de ser O");
	        } else if (tipagemMae.equals("A") && tipagemPai.equals("B") || tipagemMae.equals("B") && tipagemPai.equals("A")) {
	            System.out.println("25% de chance de ser A, 25% de chance de ser B, 25% de chance de ser AB, 25% de chance de ser O");
	        } else if (tipagemMae.equals("AB") || tipagemPai.equals("AB")) {
	            System.out.println("25% de chance de ser A, 25% de chance de ser B e 50% de chance de ser AB");
	        } else {
	            System.out.println("Combinação não encontrada.");
	        }
	    }
	   
	   public final static void calcularFatorRHFilho(String fatorRHMae, String fatorRHPai) {
	        System.out.println("\nProbabilidades do Fator RH do Filho:");
	        if (fatorRHMae.equals("-") && fatorRHPai.equals("-")) {
	            System.out.println("100% de chance de ser RH-");
	        } else if (fatorRHMae.equals("+") && fatorRHPai.equals("-") || fatorRHMae.equals("-") && fatorRHPai.equals("+")) {
	            System.out.println("50% de chance de ser RH+, 50% de chance de ser RH-");
	        } else if (fatorRHMae.equals("+") && fatorRHPai.equals("+")) {
	            System.out.println("75% de chance de ser RH+, 25% de chance de ser RH-");
	        } else {
	            System.out.println("Combinação não encontrada.");
	        }
	    }

}
