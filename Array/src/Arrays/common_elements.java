package Arrays;

public class common_elements {
public static void main(String args[]) {
	int a1[]= {1,2 ,3,4,5,6};
	int b1[]= {6,5,9,8,1};
	for(int i=0;i<a1.length;i++) {
		for(int j=0;j<b1.length;j++) {
			if(a1[i]==b1[j]) {
				System.out.print(a1[i]+" ");
			}
		}
	}
}
}
