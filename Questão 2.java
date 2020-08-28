import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Ler = new Scanner(System.in);
    double a, b, c, xUm, xDois, Delta;
    System.out.println("Qual o valor de A?");
    a = Ler.nextDouble();
    System.out.println("Qual o valor de B?");
    b = Ler.nextDouble();
    System.out.println("Qual o valor de C?");
    c = Ler.nextDouble();
    Delta = b*b - 4*a*c;
    xUm = (-b + Math.sqrt(Delta)) / 2*a;
    xDois = (-b - Math.sqrt(Delta)) / 2*a;

    System.out.println("Seu valor de X é " + xUm);
    System.out.print("Seu valor de X' é "+ xDois);
  }
}