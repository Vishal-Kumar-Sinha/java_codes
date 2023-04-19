import java.util.Scanner;
class Matrix {
	private int matrix1[][]=new int[10][10];
	private int matrix2[][]=new int[10][10];
	private int m1,m2,n1,n2;
	private static void display(int[][] a,int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter rows in matrix 1 :: ");
		m1=s.nextInt();
		System.out.print("Enter columns in matrix 1 :: ");
		n1=s.nextInt();
		System.out.print("Enter rows in matrix 2 :: ");
		m2=s.nextInt();
		System.out.print("Enter columns in matrix 2 :: ");
		n2=s.nextInt();
		System.out.println("Enter 1st matrix :: ");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				matrix1[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter 2nd matrix :: ");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				matrix2[i][j]=s.nextInt();
			}
		}
		System.out.println("The 1st matrix is :: ");
		display(matrix1,m1,n1);
		System.out.println("The 2nd matrix is :: ");
		display(matrix2,m2,n2);
	}
	void sum() {
		if(m1!=m2 && n1!=n2) {
			System.out.println("Addition not possible...");
			System.exit(0);
		}
		int result[][]=new int[m1][n1];	
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("The sum matrix is :: ");
		display(result,m1,n1);
	}
	void diff() {
		if(m1!=m2 && n1!=n2) {
			System.out.println("Subtraction not possible...");
			System.exit(0);
		}
		int result[][]=new int[m1][n1];	
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				result[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
		System.out.println("The difference matrix is :: ");
		display(result,m1,n1);
	}
	void multiply() {
		if(n1!=m2) {
			System.out.println("Multiplication not possible...");
			System.exit(0);
		}
		int result[][]=new int[m1][n2];	
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n2;j++) {
				for(int k=0;k<n1;k++) {
					result[i][j]=result[i][j]+matrix1[i][k]+matrix2[k][j];
				}
			}
		}
		System.out.println("The multiplied matrix is :: ");
		display(result,m1,n2);
	}
}
public class pg13 {
	public static void main(String[] args) {
		Matrix m=new Matrix();
		m.input();
		m.sum();
		m.diff();
		m.multiply();
	}
}