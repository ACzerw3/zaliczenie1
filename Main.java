import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x;
    System.out.print("Podaj rozmiar tablicy: ");
    x = scanner.nextInt();
    System.out.println(" ");
    int tablica1[] = new int[x];
    for(int i=0; i<x; i++)
      {
      System.out.print("Podaj element tablicy: ");
      tablica1[i] = scanner.nextInt();
      }
      System.out.println(" ");
    
    for(int j=0; j<x; j++)
      System.out.println("Kolejny element pierwszej tablicy to: " +tablica1[j]);
      System.out.println(" ");
    
    int tablica2[] = new int[x];
    for(int k=0; k<x; k++)
      {
        tablica2[k] = tablica1[k];
        System.out.println("Kolejny element drugiej tablicy to: " +tablica2[k]);
      }
  }
}