import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        System.out.println("entrer un nombre: ");
        Scanner scr = new Scanner(System.in);
        int M = scr.nextInt();
        int i = 2;
        int co = 0;
        while (co < M) {
            if (Premier(i) == true) {
                co++;
                System.out.println(i);
            }
            i++;
        }

    }

    public static boolean Premier(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
