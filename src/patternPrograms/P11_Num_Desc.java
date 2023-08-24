package patternPrograms;

public class P11_Num_Desc {

	public static void main(String[] args) {
		{
			int i, j;
			int n = 5;
			for (i = n; i > 0; i--) {
				for (j = 1; j <= i; j++) {
					System.out.print(j+" ");
				}
				//next line
				System.out.println("");
			}
		}
	}
}
