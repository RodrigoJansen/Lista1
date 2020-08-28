import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float peso, excesso, multa;
    multa = 0;
    excesso = 0;
    System.out.println("Qual o peso do peixe? ");
    peso = ler.nextFloat();
    if(peso > 50){
      excesso = peso - 50;
      multa = excesso * 4;
    }
    System.out.println("O valor de multa é: "+ multa);
  }
}