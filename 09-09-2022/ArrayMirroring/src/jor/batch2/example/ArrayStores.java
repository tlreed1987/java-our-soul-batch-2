package jor.batch2.example;

public class ArrayStores {
	private int[][] numbers;
	private int[][] mirror;
	
	public ArrayStores() {
		numbers=new int[4][4];
		mirror=new int[4][4];
	}
	public ArrayStores(int row, int col) {
		numbers=new int[row][col];
		mirror=new int[row][col];
	}
	
	public void assignNumbers() {
		numbers=Printing.assignNumbers(numbers, 200);
	}
	
	public void generateMirror() {
		int colSize=numbers[0].length;
		int lastIndex=colSize-1;
		for(int i=0; i<numbers.length;i++) {
			for(int j=0; j<numbers[i].length;j++) {
				mirror[i][j] = numbers[i][lastIndex-j];
			}
		}
	}
	
	public void print() {
		Printing.print(numbers);
	    System.out.println("*******Mirror***********");
		Printing.print(mirror);
	}
	
	
}

	