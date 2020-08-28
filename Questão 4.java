import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n;
    float s;
    System.out.println("Qual o valor de 'N'?");
    n = ler.nextInt();
    s = 1 + 1/fat(1) + 1/fat(2) + 1/fat(3) + 1/fat(n);
    System.out.print("O valor de S é: " + s);
  }
  public static float fat(int num){
    int fatorial = 1;
    for(int i = num; i >= 1; i--){
      fatorial *= i;
    }
    return fatorial;
  }
}