package exercicio4;

public class Tv {
    int canal, volume;
    private int maiorCanal = 10, menorCanal = 1, volumeMax = 10, volumeMin = 1;

    public Tv(int c, int v){
        this.canal = c;
        this.volume = v;
    }

    public void selecionaCanal(int c){
        if (menorCanal <= c && c <= maiorCanal){
            this.canal = c;
            System.out.println("o canal selecionado foi: " + this.canal);
        } else{
            System.out.println("O canal escolhido não existe, escolha um canal entre 1 e 10!");
        }
    }

    public void aumentaVolume(int v){
        if (v <= 10){
            this.volume = this.volume + (v - this.volume);
            System.out.println("Volume alterado para: " + this.volume);
        } 
        else{
            System.out.println("O volume máximo é 10!");
        }
    }

    public void diminuiVolume(int v){
        if (v >= 1){
            this.volume = this.volume + (v - this.volume);
            System.out.println("Volume alterado para: " + this.volume);
        }
        else {
            System.out.println("O volume mínimo é 1!");
        }
}
}
