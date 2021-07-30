package com.rupesh.in;

import java.util.Scanner;

public class TreasureHunt {	
	private int[][] treasureArray;
    static final int treasureArraySize = 5;	
	Scanner input;
	private void fillTresureArray(){
		System.out.println("Enter the tresure array (5x5) separated by spaces: ");
		for(int i=0;i<treasureArraySize;i++){
			for(int j=0;j<treasureArraySize;j++){
				treasureArray[i][j] = input.nextInt();
			}
		}
	}
	private void findTreasure(){
		boolean found = false;
		int currentCellRow = 0;
		int currentCellCol = 0;
		while(!found){
			System.out.println("Currently in row "+(currentCellRow+1)+" col "+(currentCellCol+1));
			int value = treasureArray[currentCellRow][currentCellCol];
			int nextCellCol = value % 10 - 1;
			value /= 10;
			int nextCellRow = value % 10 - 1;
			if(nextCellCol==currentCellCol && nextCellRow==currentCellRow){
				System.out.println("Treasure found");
				found = true;
			}else{
				currentCellCol = nextCellCol;
				currentCellRow = nextCellRow;
			}
			
		}
	}
	TreasureHunt(){
		input = new Scanner(System.in);
		treasureArray = new int[treasureArraySize][treasureArraySize];
		fillTresureArray();
		findTreasure();
	}
	public static void main(String[] args){
		new TreasureHunt();		
	}
}