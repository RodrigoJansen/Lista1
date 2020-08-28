import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float pagar, preço, troco;
    System.out.println("Qual o valor do produto?");
    preço = ler.nextFloat();
    System.out.println("Qual o valor pago?");
    pagar = ler.nextFloat();
    troco = preço - pagar;
    System.out.print("O troco será: " + troco);
  }
}

