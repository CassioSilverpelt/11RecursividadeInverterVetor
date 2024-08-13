package controller;

import javax.swing.JOptionPane;

public class InverterVetorController {
	public InverterVetorController() {
		super();
	}
	
	public int[] inverterVetor(int[] vet, int ini, int fim) {
		if (ini > fim) {return vet;}
		else if (ini == fim) {return inverterVetor(vet, ini+1, fim-1);}
		else {
			int aux = vet[ini];
			vet[ini] = vet[fim];
			vet[fim] = aux;
			return inverterVetor (vet, ini+1, fim-1);
		}
	}
	
	public int[] popularVetor(int[] vet, int count) {
		if (count == vet.length) {return vet;}
		else {
			vet[count] = Integer.parseInt(JOptionPane.showInputDialog("Insira o número para a posição: " + count + " do vetor."));
			return popularVetor(vet, (count + 1));
		}
	}
	
	public void escreverVetor(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i] + " ");
		}
		System.out.println("\n");
	}
	
}

