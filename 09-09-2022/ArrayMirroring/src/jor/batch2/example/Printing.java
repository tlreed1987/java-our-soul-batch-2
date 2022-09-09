package jor.batch2.example;

public class Printing {
	
	public static void print(int[][] array) {
		for(int i=0; i<array.length;i++) {
			for(int j=0, value=0; j<array[i].length;j++) {
					System.out.print(array[i][j]+"\t");
			}
			System.out.println();
	     }
		
	}
	

	public static int[][] assignNumbers(int[][] array, int max) {
	
		for(int i=0; i<array.length;i++) {
			for(int j=0, value=0; j<array[i].length;j++) {
				value=(int)(Math.random() * max + 1);
				array[i][j]=value;
			}
		}
		return array;
	}

}
