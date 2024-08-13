package controller;

import javax.swing.JOptionPane;

public class InverterVetorController {
	public InverterVetorController() {
		super();
	}
	
	public int[] inverterVetor(int[] vet, int count) {
		if (count == vet.length) {return vet;}
		else if (count == (int)(vet.length-count) && vet.length%2 != 0) {return inverterVetor(vet, count+1);}
		else {
			int aux = vet[count];
			vet[count] = vet[(vet.length-1)-count];
			vet[(vet.length-1)-count] = aux;
			return inverterVetor (vet, count+1);
		}
	}
	
	public int[] popularVetor(int[] vet, int count) {
		if (count < 0) {return vet;}
		else {
			vet[count] = Integer.parseInt(JOptionPane.showInputDialog("Insira o número para a posição: " + count + " do vetor."));
			return popularVetor(vet, (count - 1));
		}
	}
	
	public void escreverVetor(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i] + " ");
		}
		System.out.println("\n");
	}
	
}
