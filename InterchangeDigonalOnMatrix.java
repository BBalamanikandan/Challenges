package javapractise;

public class InterchangeDigonalOnMatrix {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		int tmp=a[0][2];
		a[0][2]=a[0][0];
		a[0][0]=tmp;
		
		int temp=a[2][2];
		a[2][2]=a[2][0];
		a[2][0]=temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			} System.out.println();
		}
	}

}
