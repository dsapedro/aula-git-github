
package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        double canal, canal4, canal5, canal7, canal12, pessoas, pessoasTotal;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Informe o número do canal: ");
    canal=input.nextDouble();
    System.out.println("Informe o número de pessoas: ");
    pessoas=input.nextDouble();
    
    while(canal!=0){
        pessoasTotal=pessoas+pessoasTotal;
        if(canal == 4){canal4+=pessoas;}
        else if(canal == 5){canal5+=pessoas;}
        else if(canal == 7){canal7+=pessoas;}
        else if(canal == 12){canal12+=pessoas;}
    }
    System.out.println("Canal 4: "+(canal4*100/pessoas)+"\nCanal 5: "+(canal5*100/pessoas)+"\nCanal 7: "+(canal7*100/pessoas)+"\nCanal 12: "+(canal12*100/pessoas));
    }
    
}
