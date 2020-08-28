import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int m=1;
    while(m != 0){
      System.out.println("\nEscreva um valor (insira '0' para finalizar)");
      m = ler.nextInt();
      if(m < 10 && m != 0){
        System.out.println("O Fatorial deste número é: "+ fat(m));
      }
      if(m >= 10){
         System.out.println("A quantidade de Divisores, deste número é: "+ div(m));
      }
    }
  }

  public static int fat(int m){
    int fatorial = 1;
    for(int i = m; i >= 1; i--){
      fatorial *= i;
    }
    return fatorial;
  }

  public static int div(int m){
    int Quantidade = 0;
    for(int i = 1; i <= m; i++){
      if(m % i == 0){
        Quantidade++;
      }
    }
    return Quantidade;
  }
}