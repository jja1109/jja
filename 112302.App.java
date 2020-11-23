package pac;

public class APP2 {
public static void main(String[] args) throws InterruptedException {
	int arr[][]={
			{45,66},
			{12,34},
			{99,66},
			{77,88}
	};
	while (true) {
		Thread.sleep(2000);
                                System.out.println("已经过去两秒");
		int dd=(int)(Math.random()*10%4);
		System.out.println(arr[dd][0]+","+arr[dd][1]);
		
	}
}
}
