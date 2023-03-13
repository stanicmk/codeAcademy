package treeExamples;

public class RightTriangle {
	
public static void main(String[] args) {
	
	starTriangle(); 
	
	}



private static void starTriangle() {
	int n = 6;
	for(int i = 1; i<=n; i++){
		
		for(int k = 5; k>=i; k--) {
			System.out.print("  ");
		}
		
		for(int j = 1; j<=i; j++) {
			System.out.print("* ");
		}
		
		System.out.println();
		
	
	}
	

}


}



	
	

		
		
