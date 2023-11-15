import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, i, toplam = 0, dongu=0, netice;
        Scanner scn = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi= scn.nextInt();

        for (i=1; i<=sayi; i++){
            if (i%3==0&&i%4==0){
                dongu++;
                toplam += i;
            }
        }
        netice=toplam/dongu;
        System.out.print(netice);
    }
}