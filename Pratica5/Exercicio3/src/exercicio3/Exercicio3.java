
package exercicio3;
import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
        double canal=0, canal4=0, canal5=0, canal7=0, canal12=0, pessoas=0, pessoasTotal=0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Informe o número do canal: ");
    canal=input.nextDouble();
    System.out.println("Informe o número de pessoas: ");
    pessoas=input.nextDouble();
    
    while(canal!=0){
        pessoasTotal=pessoas+pessoasTotal;
        if(canal == 4){canal4=canal4+pessoas;}
        else if(canal == 5){canal5=canal5+pessoas;}
        else if(canal == 7){canal7=canal7+pessoas;}
        else if(canal == 12){canal12=canal12+pessoas;}
        System.out.println("Informe o número do canal: ");
    canal=input.nextDouble();
    System.out.println("Informe o número de pessoas: ");
    pessoas=input.nextDouble();
    }
    System.out.println("Canal 4: "+(canal4*100/pessoasTotal)+"\nCanal 5: "+(canal5*100/pessoasTotal)+"\nCanal 7: "+(canal7*100/pessoasTotal)+"\nCanal 12: "+(canal12*100/pessoasTotal));
    }
    
}
