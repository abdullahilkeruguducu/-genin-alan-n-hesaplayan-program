import java.util.Scanner;
//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
// Patika.dev linkim -> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("a degerini giriniz :");
        a = input.nextInt();

        System.out.print("b degerini giriniz :");
        b = input.nextInt();

        System.out.print("c degerini giriniz :");
        c = input.nextInt();
        u = (a+b+c) /2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Sonuc :" + alan);

    }
}