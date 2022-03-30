import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
	int x,y,z,a,b,c;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe o primeiro lado: ");
	a = input.nextInt();
	System.out.println("Informe o segundo lado: ");
	b = input.nextInt();
	System.out.println("Informe o terceiro lado: ");
	c = input.nextInt();
	
	if(a>Math.abs(b-c)&&a<b+c) {
		x=1;
	}else {
		x=0;
	}
	if(b>Math.abs(a-c)&&a<a+c) {
		y=1;
	}else {
		y=0;
	}
	if(c>Math.abs(a-b)&&a<a+b) {
		z=1;
	}else {
		z=0;
	}
	
	if(x==1 && y==1 && z==1) {
		System.out.println("os três valores informados podem ser os comprimentos dos lados de um\r\n" + 
				"triângulo.");
	}else {
		System.out.println("os três valores informados não podem ser os comprimentos dos lados de um\r\n" + 
				"triângulo.");
	}
	}

}
