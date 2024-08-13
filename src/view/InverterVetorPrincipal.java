package view;

import controller.InverterVetorController;

public class InverterVetorPrincipal {
	public static void main(String[] args){
		InverterVetorController invCon = new InverterVetorController();
		int[] vetorx = new int[10];
		int[] vetory = new int[11];		
		
		invCon.popularVetor(vetorx, 0);
		invCon.inverterVetor(vetorx, 0, vetorx.length-1);
		invCon.escreverVetor(vetorx);
		//1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		invCon.popularVetor(vetory, 0);
		invCon.inverterVetor(vetory, 0, vetory.length-1);
		invCon.escreverVetor(vetory);
		//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
	}
}
