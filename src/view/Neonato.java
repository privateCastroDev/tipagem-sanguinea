package view;

import java.util.Scanner;
import control.Probabilidade;
import model.Gestores;

public class Neonato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gestores g1 = new Gestores();
		
		boolean loop = false;
		
		do {
            System.out.println("Tipagem Sanguínea da Mãe: ");
            String tipagem = sc.nextLine().trim().toUpperCase(); // .trim() remove espaços extras
            
            if (tipagem.matches("^(A|O|B|AB)$")) { // Verifica se o usuário digitou as letras reconhecidas (A, O, B e AB)
                g1.setTipagem(tipagem); // Seta a tipagem de acordo com a variável definida acima
                loop = true;
            } else {
                System.out.println("Erro: Tipagem sanguínea inválida! Use apenas A, O, B ou AB." + "\n");
            }
            
        } while (!loop); // Forma mais legível de manter o loop
		System.out.println("Tipagem: " + g1.getTipagem());		
		
        loop = false;
        do {
        	System.out.println("FatorRH: ");
        	String fatorRh = sc.nextLine().trim();
        	if(fatorRh.matches("^[+-]$")) {
        		g1.setFatorRH(fatorRh);
        		loop = true;        		
        	}else {
        		System.out.println("Erro: Fator RH inválido! Use apenas + ou -." + "\n");
        	}
        } while (!loop);
        System.out.println("Fator RH: " + g1.getFatorRH());
		
		Gestores g2 = new Gestores();
		System.out.println("Tipagem Sanguínea do Pai: ");
		g2.setTipagem(sc.next().toUpperCase());
		sc.nextLine();
		System.out.println("FatorRH: ");
		g2.setFatorRH(sc.next());
		sc.nextLine();
		
		System.out.println(g1);
		System.out.println(g2);
		
		Probabilidade.calcularTipagemFilho(g1.getTipagem(), g2.getTipagem());
		Probabilidade.calcularFatorRHFilho(g1.getFatorRH(), g2.getFatorRH());
		
		
		sc.close();

	}

}
