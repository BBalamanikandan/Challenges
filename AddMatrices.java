package javapractise;

public class AddMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,3,4},{2,4,3},{3,4,5}},b[][]={{1,3,4},{2,4,3},{1,2,4}};
		int size=0;
		
		if(a.length==b.length) {
			size=a.length;
		}
		int c[][]=new int[size][size];

		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(c[i][j]=a[i][j]+b[i][j]);
			}
			System.out.println();
		}
		
	}

}
