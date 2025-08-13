package demo2;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[]args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rows=sc.nextInt();
		System.out.println("Enter the no of cols");
		int cols=sc.nextInt();
		int[][] matrix=new int[rows][cols];
		int[][] transpose = new int[cols][rows];
		System.out.println("Enter the matrix elemets");
		
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
				}
		}for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				transpose[j][i] = matrix[i][j];
            }
        }
		System.out.print(" the matrix:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
                	
                }
        System.out.print("Transpose of the matrix:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(); 
        }
	}
}
            
