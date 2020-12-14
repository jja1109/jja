package java121401;

public class App {

	public static void main(String[] args) {
		int i=1;
		long sum=0;
		while(i<=214748364) {
			if (i%2==1) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println("sum="+sum);
	}
}
