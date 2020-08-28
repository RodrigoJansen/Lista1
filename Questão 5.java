import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int quant = -1, j=1, iint;
    double i, Quadrado;
    System.out.println("Insira valores");
    while(j != 0){
      j = ler.nextInt();
      i = Math.sqrt(j);
      iint = (int)Math.sqrt(j);
      Quadrado = i - iint;
      if(Quadrado == 0){
        quant++;
      }
    }
    System.out.println("A quantidade de Quadrados perfeitos é: " + quant);
  }
}