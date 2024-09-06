package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCanal, vol;
        Tv t1 = new Tv(5, 7);
        System.out.println("Informe o número do canal que deseja assistir(1 ao 10): ");
        numCanal = scan.nextInt();
        t1.selecionaCanal(numCanal);
        System.out.println("Informe o volume que deseja(1 ao 10): ");
        vol = scan.nextInt();
        if (t1.volume < vol){
            t1.aumentaVolume(vol);
        } 
        else if(t1.volume > vol){
            t1.diminuiVolume(vol);
        }
        else {
            System.out.println("O volume já está no " + vol);
        }
    }
}
