package pac;

import java.util.Random;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
	Scanner sr=new Scanner(System.in);
	System.out.println("请输入1");
	while (true) {
		int sc=sr.nextInt();
	if (sc==1) {
		System.out.println("R("+(int)(Math.random()*100)+","+(int)(Math.random()*100)+")");
	}
	
	}
	
}
}
